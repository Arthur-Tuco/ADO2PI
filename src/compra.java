import java.util.Scanner;

public class compra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o produto e seu valor: ");
        String produto = scanner.nextLine();
        float valor = scanner.nextFloat();
        float valorfinal;

        if (valor >= 500){
            valorfinal = (valor * 0.90f);
            System.out.println("O valor de " + produto + ", que era: R$" + valor + " foi para: R$" + valorfinal + "!");
        }
        else {
            System.out.println("O valor de " + produto + " não é maior que R$500,00, portanto, não haverá desconto. Valor final: " + valor);
        }
    }
}
