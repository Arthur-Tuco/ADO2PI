import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a sua idade: ");
        int idade = scanner.nextInt();

        if(idade <= 11){
            System.out.println("Você é uma criança!");
        } else if ((idade >=12) && (idade <=17)) {
            System.out.println("Você é um adolescente!");
        }else {
            System.out.println("Você é um adulto!");
        }
    }
}
