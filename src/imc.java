import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua peso e altura: ");
        float peso = scanner.nextFloat();
        float altura = scanner.nextFloat();
        float imc = peso / (altura * altura);

        if (imc <18.5){
            System.out.println("Peso normal! IMC: " + imc);
        }else if((imc >=18.5) && (imc <= 24.9)) {
            System.out.println("Peso normal. IMC: " + imc);
        }else {
            System.out.println("Acima do peso. IMC: " + imc);
        }
    }
}
