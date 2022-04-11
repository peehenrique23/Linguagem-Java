import java.util.Scanner;

public class lista1exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String recebe = "";

        System.out.println("Digite um numero: ");
        recebe = input.next();

        double d = Double.valueOf(recebe).doubleValue();

        System.out.printf("O indice da palavra é: \"%f\"  ", d);
    }
}
