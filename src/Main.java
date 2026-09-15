import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 > n2){
            System.out.println("O primeiro número é maior que o segundo!");
        } else if (n2 > n1) {
            System.out.println("O segundo número é maior que o primeiro!");
        }else {
            System.out.println("Os números são iguais!");
        }
    }
    }