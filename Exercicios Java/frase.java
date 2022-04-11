package exerciciosAC1;

import java.util.Scanner;

public class frase {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        String frase, upper, subs;

        System.out.println("Digite uma frase: ");
        frase = teclado.nextLine();

        upper = frase.toUpperCase();
        String[] palavras = frase.split(" "); 
        int nmrcarac = frase.length();
        subs = frase.replace("","-");

        System.out.printf("\n");
        System.out.printf("Frase em maiusculo: \"%s\" ", upper);
        System.out.printf("\n");
        System.out.printf("Numero de palavras na frases: \"%s\" ", palavras.length);
        System.out.printf("\n");
        System.out.printf("Numero de caracteres: \"%d\" ", nmrcarac);
        System.out.printf("\n");
        System.out.printf("Ocupando espaços em branco: \"%s\" ", subs);
    }
}
