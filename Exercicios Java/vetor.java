package exerciciosAC1;
import java.util.Scanner;


public class vetor {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int n1, i=0, a=0;

        System.out.println("Digite o tamanho do vetor: ");
        n1 = teclado.nextInt();

        int[] v1 = new int[n1];

        for(i=0; i<n1; i++){
            System.out.printf("%2do. nota: ", (i+1));
            v1[i] = teclado.nextInt();
        }

        a = recebev1(v1, n1);

        System.out.printf("Maior nmr: %d", a);

    }

    public static int recebev1(int v1[], int n1){
        int i=0;
        int maior = 0 ;

        for(i=0; i<n1; i++){
            if(v1[i] >= maior){
                maior = v1[i];
            }
        }
        return maior;
    }
}
