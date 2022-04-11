import java.util.Scanner;

public class lista1exercicio4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String frase = "";
        String palavra = "";

        System.out.println("Digite uma frase: ");
        frase = input.nextLine();

        System.out.println("Escolha uma palavra: ");
        palavra = input.next();

        int indice = frase.indexOf(palavra);

        System.out.printf("O indice da palavra é: \"%d\"  ", indice);
    }
    
}
