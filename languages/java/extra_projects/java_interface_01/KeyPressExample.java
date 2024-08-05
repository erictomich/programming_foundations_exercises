import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyPressExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Press Shift + Enter to Exit");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Press Shift + Enter to exit the loop.");
        
        panel.add(label);
        frame.add(panel);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Adiciona um KeyListener para capturar eventos de teclado
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }

            @Override
            public void keyPressed(KeyEvent e) {
                // Verifica se Shift + Enter foi pressionado
                if (e.getKeyCode() == KeyEvent.VK_ENTER && e.isShiftDown()) {
                    System.out.println("Shift + Enter pressed. Exiting...");
                    System.exit(0); // Sai do programa
                }
            }

            @Override
            public void keyReleased(KeyEvent e) { }
        });

        // Mantém o programa rodando até que o usuário pressione Shift + Enter
        while (true) {
            try {
                Thread.sleep(100); // Reduz a utilização da CPU
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
