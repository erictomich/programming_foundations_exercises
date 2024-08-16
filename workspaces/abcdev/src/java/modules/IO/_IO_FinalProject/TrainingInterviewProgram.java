import java.util.Scanner;

public class TrainingInterviewProgram {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String optionTraining; 

        System.out.println("\n\nEste programa irá te auxiliar a refletir acerca da sua apresentação pessoal em entrevistas de emprego.");

        System.out.println("Escolha uma das opções abaixo para treinar: \n");
        System.out.println("1 - Experiência Profissional");
        System.out.println("2 - Hard Skills");
        System.out.println("3 - Soft Skills");
        System.out.println("4 - Motivação e objetivos");
        System.out.println("5 - Histórico pessoal na área");
        System.out.println("6 - Formação");
        System.out.println("7 - Projetos e contribuições");
        System.out.println("8 - Autoconhecimento e Reflexão");
        System.out.println("9 - Cultura e Valores");
        System.out.println("10 - Impacto e Legado");
        System.out.println("99 - voltar ao menu anterior");
        System.out.println("\n");

        System.out.print("Digite a opção escolhida: ");

        optionTraining = scanner.nextLine();

        System.out.print("\n");

        consoleClear();

        if("1".equals(optionTraining)) { // Experiência Profissional
            System.out.println("\n\n::: Experiência Profissional :::\n");
            System.out.println("Quais são os projetos mais importantes que você já trabalhou? Por que esses projetos são significativos para você?");
            System.out.println("Como sua experiência anterior moldou sua forma de pensar como programador?");
            System.out.println("Qual foi o maior desafio técnico que você enfrentou e como você o superou?");
            System.out.println("Quais tecnologias você domina e como elas impactaram sua carreira até agora?");
            System.out.println("Como você se mantém atualizado com as últimas tendências e tecnologias no desenvolvimento de software?");
            System.out.println("\n");
        } else if("2".equals(optionTraining)) { // Hard Skills
            System.out.println("Quais são suas habilidades técnicas mais fortes? Como você as desenvolveu ao longo do tempo?");
            System.out.println("Quais tecnologias você domina e como elas impactaram sua carreira até agora?");
            System.out.println("Qual foi o maior desafio técnico que você enfrentou e como você o superou?");
            System.out.println("Como você se mantém atualizado com as últimas tendências e tecnologias no desenvolvimento de software?");
            System.out.println("Qual é a sua abordagem para escrever código limpo e eficiente?");
        } else if("3".equals(optionTraining)) { // Soft skills 
            System.out.println("Como você resolve problemas complexos? Pode compartilhar um exemplo específico?");
            System.out.println("Como você equilibra as demandas técnicas com a colaboração em equipe?");
            System.out.println("Como você gerencia seu tempo e prioriza tarefas em um ambiente de desenvolvimento ágil?");
            System.out.println("Como você lida com feedback sobre seu código ou suas ideias? Pode descrever uma situação em que o feedback foi particularmente útil?");
            System.out.println("Como você contribui para um ambiente de trabalho positivo e colaborativo?");
        } else if("4".equals(optionTraining)) { // Motivação e objetivos
            System.out.println("O que o motiva a ser um programador? Como essa motivação se reflete no seu trabalho diário?");
            System.out.println("Quais são seus objetivos de longo prazo na carreira de desenvolvimento de software?");
            System.out.println("Como você se vê contribuindo para a empresa na qual está se candidatando?");
            System.out.println("Qual é o próximo passo em sua jornada de aprendizado como programador?");
        } else if("5".equals(optionTraining)) { // Histórico pessoal na área
            System.out.println("Como você decidiu seguir uma carreira em desenvolvimento de software? Quais influências moldaram essa decisão?");
            System.out.println("O que você aprendeu com suas primeiras experiências em programação que ainda aplica hoje?");
            System.out.println("Como sua trajetória de vida influenciou sua forma de trabalhar e sua abordagem à programação?");
        } else if("6".equals(optionTraining)) { // Formação
            System.out.println("Como sua formação educacional (formal ou autodidata) contribuiu para seu desenvolvimento como programador?");
            System.out.println("Quais são suas maiores realizações acadêmicas ou de treinamento em programação?");
            System.out.println("Como os cursos, certificações ou treinamentos que você realizou impactaram sua carreira?");
            System.out.println("Como você continuou a aprender e se desenvolver após a conclusão de sua formação inicial?");
        } else if("7".equals(optionTraining)) { // Projetos e contribuições
            System.out.println("Há algum projeto pessoal ou open-source do qual você tenha orgulho? O que você aprendeu com ele?");
            System.out.println("Como você colabora em projetos de equipe? Pode compartilhar um exemplo onde sua contribuição foi essencial?");
            System.out.println("Como você lida com feedback sobre seu código ou suas ideias? Pode descrever uma situação em que o feedback foi particularmente útil?");
        } else if("8".equals(optionTraining)) { // Autoconhecimento e Reflexão
            System.out.println("Como você descreveria seu estilo de trabalho e abordagem à solução de problemas?");
            System.out.println("Quais são seus pontos fortes e áreas em que ainda busca melhorar como programador?");
            System.out.println("Como você lida com o fracasso ou erros no trabalho? Pode descrever uma situação em que isso aconteceu?");
            System.out.println("O que você gostaria que os outros dissessem sobre você como colega de trabalho ou membro da equipe?");
        } else if("9".equals(optionTraining)) { // Cultura e Valores
            System.out.println("Quais são os valores ou princípios que você considera mais importantes no trabalho?");
            System.out.println("Como você se alinha com a cultura e os valores da empresa na qual está se candidatando?");
            System.out.println("Como você contribui para um ambiente de trabalho positivo e colaborativo?");
        } else if("10".equals(optionTraining)) { // Impacto e Legado
            System.out.println("Qual impacto você deseja causar através do seu trabalho como programador?");
            System.out.println("Como você mede o sucesso em sua carreira?");
            System.out.println("Qual legado você gostaria de deixar na empresa onde trabalha ou nos projetos que realiza?");
        }

        scanner.close();

    }

    public static void consoleClear() {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            
            if (os.contains("windows")) {
                // Comando para limpar o console no Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else if (os.contains("linux")) {
                // Comando para limpar o console no Linux
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            } else if (os.contains("mac") || os.contains("unix")) {
                // Comando para limpar o console em macOS ou sistemas Unix-like
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
