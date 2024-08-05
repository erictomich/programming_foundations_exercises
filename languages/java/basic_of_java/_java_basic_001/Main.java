import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        String secondName;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello World!");

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");

        System.out.print("Enter your second name: ");
        secondName = scanner.nextLine();


        System.out.println("Your complete name is: " + name + " " + secondName + "!");

        scanner.close();
    }
}



/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
*/
/*
A classe Scanner em Java é nomeada dessa forma porque 
sua principal função é "escanear" (ou "analisar") a entrada de dados.
 O nome Scanner reflete sua capacidade de ler 
 e interpretar diversos tipos de dados 
 a partir de várias fontes de entrada, 
 como o teclado, arquivos, e outros fluxos de dados.


*** Explicação do Nome Scanner
Origem do Nome:

O termo "scanner" em inglês refere-se a um dispositivo que digitaliza ou examina algo. No contexto da programação, "scanner" pode ser interpretado como um componente que examina e processa dados de entrada.
Função da Classe Scanner:

A classe Scanner é projetada para fornecer uma maneira eficiente e fácil de ler e converter dados de entrada para tipos específicos. Ela pode ler texto, números, e outros tipos de dados, analisando e convertendo conforme necessário.
Funcionalidade:

Leitura de Dados: Scanner pode ler entrada de diversos tipos, como int, double, String, etc.
Análise de Dados: Ela fornece métodos para analisar dados conforme o formato ou o tipo desejado. Por exemplo, nextInt() para ler um número inteiro e nextLine() para ler uma linha de texto.
Facilidade de Uso: Scanner oferece uma interface amigável para interagir com diferentes fontes de entrada, facilitando a implementação de leitura de dados em programas Java.
    */