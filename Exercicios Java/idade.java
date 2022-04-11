package exerciciosAC1;
import java.util.Scanner;

public class idade {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int idade1, meses1, dias1;
        int total;

        System.out.println("Digite sua idade: ");
        idade1 = teclado.nextInt();

        System.out.println("Digite seus meses de vida: ");
        meses1 = teclado.nextInt();

        System.out.println("Digite seus dias de vida: ");
        dias1 = teclado.nextInt();

        total = ((idade1*365) + (meses1*30) + (dias1));

        System.out.printf("Total de dias de vida: \"%d\"  ", total);
    }
}
