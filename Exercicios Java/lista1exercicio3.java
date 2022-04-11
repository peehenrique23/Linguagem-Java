import java.util.Scanner;

public class lista1exercicio3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String frase = "";
        String escolha = "";
        String troca = "";

        System.out.println("Digite uma frase: ");
        frase = input.next();

        System.out.println("Escolha uma palavra da frase para substituir: ");
        escolha = input.next();

        System.out.println("Qual vc deseja colocar: ");
        troca = input.next();

        String frase2 = frase.replace(escolha, troca);

        System.out.printf("Texto alterado: \"%s\"  ", frase2);
    }

}
