import java.util.Scanner;

public class lista1exercicio1 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        String nome = "";

        System.out.println("Digite o seu nome: ");
        nome = input.next();

        int tam = nome.length();

        System.out.printf("O nome \"%s\" tem \"%d\" letras", nome, tam);
        
    }
}

