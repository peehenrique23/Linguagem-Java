import java.util.Scanner;

public class lista1exercicio6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String frase = "";
        int cont=0;

        System.out.println("Digite uma frase: ");
        frase = input.nextLine();

        for(int i = 0; i < frase.length(); i++){
            if (frase.charAt(i) == ' ' ){
                cont++;
                }}
        System.out.printf("O indice da palavra é: \"%d\"  ", cont);
        }
    }