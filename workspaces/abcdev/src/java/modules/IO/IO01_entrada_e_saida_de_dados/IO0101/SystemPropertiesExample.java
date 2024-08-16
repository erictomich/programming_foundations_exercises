public class SystemPropertiesExample {
    public static void main(String[] args) {
        
        // System.getProperty(): Recupera o valor de uma propriedade do sistema. 
        // Essa função aceita uma chave (nome da propriedade) como argumento 
        // e retorna o valor associado a essa chave. É útil para obter informações 
        // sobre o ambiente de execução, como o sistema operacional, diretórios, 
        // versão do Java, entre outros.

        // Propriedades do Sistema Operacional
        String osName = System.getProperty("os.name");
        String osArch = System.getProperty("os.arch");
        String osVersion = System.getProperty("os.version");

        // Propriedades do Usuário
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        String userDir = System.getProperty("user.dir");

        // Propriedades da JVM
        String javaVersion = System.getProperty("java.version");
        String javaHome = System.getProperty("java.home");
        String javaVendor = System.getProperty("java.vendor");
        String javaVendorUrl = System.getProperty("java.vendor.url");
        String javaClassPath = System.getProperty("java.class.path");

        // Propriedades de Arquivos e Diretórios
        String fileSeparator = System.getProperty("file.separator");
        String pathSeparator = System.getProperty("path.separator");
        String lineSeparator = System.getProperty("line.separator");

        // Propriedades de Localização e Linguagem
        String userLanguage = System.getProperty("user.language");
        String userCountry = System.getProperty("user.country");

        // Propriedades de Segurança
        String userTimezone = System.getProperty("user.timezone");
        String javaSecurityPolicy = System.getProperty("java.security.policy");
        String javaSecurityManager = System.getProperty("java.security.manager");

        // System.out.println(): Imprime o texto fornecido no console, 
        // seguido por uma nova linha. Essa função é usada para exibir 
        // informações ou mensagens para o usuário durante a execução do programa.
        
        // Exibindo as propriedades
        System.out.println("Nome do SO: " + osName);
        System.out.println("Arquitetura do SO: " + osArch);
        System.out.println("Versão do SO: " + osVersion);
        System.out.println("Nome do usuário: " + userName);
        System.out.println("Diretório home do usuário: " + userHome);
        System.out.println("Diretório de trabalho atual: " + userDir);
        System.out.println("Versão do Java: " + javaVersion);
        System.out.println("Diretório de instalação do Java: " + javaHome);
        System.out.println("Fornecedor do Java: " + javaVendor);
        System.out.println("URL do fornecedor do Java: " + javaVendorUrl);
        System.out.println("Caminho da classe Java: " + javaClassPath);
        System.out.println("Separador de arquivos: " + fileSeparator);
        System.out.println("Separador de caminho: " + pathSeparator);
        System.out.println("Separador de linha: " + lineSeparator);
        System.out.println("Idioma do sistema: " + userLanguage);
        System.out.println("País/região do sistema: " + userCountry);
        System.out.println("Fuso horário do usuário: " + userTimezone);
        System.out.println("Política de segurança do Java: " + javaSecurityPolicy);
        System.out.println("Gerenciador de segurança do Java: " + javaSecurityManager);
    }
}
