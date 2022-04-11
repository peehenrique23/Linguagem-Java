import java.util.Scanner;

public class lista1exercicio2 {
    

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    String txt1 = "";
    String txt2 = "";

    System.out.println("Digite um texto :");
    txt1 = input.next();

    String txt1p = txt1.toLowerCase();

    System.out.printf("O texto \"%s\" em minusculo: \"%s\"", txt1, txt1p);

    System.out.println("\nDigite outro texto: ");
    txt2 = input.next();

    String txt2g = txt2.toUpperCase();

    System.out.printf("O texto \"%s\" em MAIUSCULO: \"%s\"", txt2, txt2g);

    }
}

