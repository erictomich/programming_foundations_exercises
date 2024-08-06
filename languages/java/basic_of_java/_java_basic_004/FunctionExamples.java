import java.util.*;

public class FunctionExamples {

    public static void main(String[] args) {
        // Criação de uma instância do sistema de gestão de notas
        StudentGradeSystem gradeSystem = new StudentGradeSystem();

        // Adicionando alguns alunos e suas notas
        gradeSystem.addStudentGrades("Alice", Arrays.asList(85, 92, 78));
        gradeSystem.addStudentGrades("Bob", Arrays.asList(79, 85, 88));
        gradeSystem.addStudentGrades("Charlie", Arrays.asList(90, 91, 92));

        // Exibir informações de alunos
        gradeSystem.displayStudentInfo();

        // Calcular e exibir médias
        gradeSystem.displayAverageGrades();

        // Buscar e exibir notas de um aluno específico
        String studentToSearch = "Bob";
        List<Integer> grades = gradeSystem.getStudentGrades(studentToSearch);
        if (grades != null) {
            System.out.println("Notas de " + studentToSearch + ": " + grades);
        } else {
            System.out.println("Aluno " + studentToSearch + " não encontrado.");
        }

        // Exemplo de I/O básico
        // Descomente para utilizar a função de leitura de dados do usuário
        // gradeSystem.basicIOExample();
    }
}

class StudentGradeSystem {
    private Map<String, List<Integer>> studentGrades;

    public StudentGradeSystem() {
        studentGrades = new HashMap<>();
    }

    // Método de instância para adicionar notas de um aluno
    public void addStudentGrades(String studentName, List<Integer> grades) {
        studentGrades.put(studentName, grades);
    }

    // Método de instância para exibir informações dos alunos
    public void displayStudentInfo() {
        System.out.println("Informações dos Alunos:");
        for (String student : studentGrades.keySet()) {
            System.out.println("Aluno: " + student);
            System.out.println("Notas: " + studentGrades.get(student));
        }
    }

    // Método de instância para calcular e exibir médias das notas dos alunos
    public void displayAverageGrades() {
        System.out.println("Médias dos Alunos:");
        for (Map.Entry<String, List<Integer>> entry : studentGrades.entrySet()) {
            String student = entry.getKey();
            List<Integer> grades = entry.getValue();
            double average = calculateAverage(grades);
            System.out.printf("Aluno: %s, Média: %.2f%n", student, average);
        }
    }

    // Método de instância para obter as notas de um aluno específico
    public List<Integer> getStudentGrades(String studentName) {
        return studentGrades.get(studentName);
    }

    // Método de instância para entrada e saída básicos (exemplo)
    public void basicIOExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String name = scanner.nextLine();
        System.out.println("Digite as notas separadas por espaço: ");
        String[] gradesStr = scanner.nextLine().split(" ");
        List<Integer> grades = new ArrayList<>();
        for (String grade : gradesStr) {
            grades.add(Integer.parseInt(grade));
        }
        addStudentGrades(name, grades);
        System.out.println("Notas adicionadas para " + name + ": " + grades);
    }

    // Função estática para calcular a média de uma lista de inteiros
    public static double calculateAverage(List<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / (double) grades.size();
    }
}
