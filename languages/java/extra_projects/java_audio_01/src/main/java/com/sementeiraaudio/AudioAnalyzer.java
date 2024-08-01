package main.java.com.sementeiraaudio;

import be.tarsos.dsp.AudioDispatcher;
import be.tarsos.dsp.io.jvm.AudioDispatcherFactory;
import be.tarsos.dsp.pitch.PitchDetectionHandler;
import be.tarsos.dsp.pitch.PitchDetectionResult;
import be.tarsos.dsp.pitch.PitchProcessor;
import be.tarsos.dsp.AudioEvent; // Certifique-se de importar esta classe

import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class AudioAnalyzer {
    public static void main(String[] args) {
        // Obtém o caminho do recurso de áudio
        URL audioFileUrl = AudioAnalyzer.class.getClassLoader().getResource("audio.mp3");

        if (audioFileUrl == null) {
            System.err.println("Áudio não encontrado");
            return;
        }

        File audioFile = new File(audioFileUrl.getFile());

        try {
            // Cria um dispatcher para o arquivo de áudio
            AudioDispatcher dispatcher = AudioDispatcherFactory.fromFile(audioFile, 2048, 1024);

            // Define o PitchDetectionHandler
            PitchDetectionHandler pitchDetectionHandler = new PitchDetectionHandler() {
                @Override
                public void handlePitch(PitchDetectionResult result, AudioEvent e) {
                    float pitch = result.getPitch();
                    if (pitch != -1) {
                        System.out.println("Pitch detected: " + pitch + " Hz");
                    }
                }
            };

            // Adiciona o processor de pitch ao dispatcher
            dispatcher.addAudioProcessor(new PitchProcessor(PitchProcessor.PitchEstimationAlgorithm.YIN, 44100, 2048, pitchDetectionHandler));

            // Inicia o processamento do áudio
            dispatcher.run();

        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
    }
}
