import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quais foram as notas do aluno?: ");
        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();
        float nota3 = scanner.nextFloat();
        float media = (nota1 + nota2 + nota3) / 3;

        if (media >= 6){
            System.out.println("Aluno aprovado com a média de: " + media);
        }
        else{
            System.out.println("Aluno reprovado com a média de: " + media);
        }
    }
}
