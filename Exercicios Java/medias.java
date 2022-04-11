package exerciciosAC1;
import java.util.Scanner;


public class medias {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        
        int media = 3;
        int array[] = new int [media]; 
        int i = 0;
        int soma = 0;
        int escolha;

        for (i=0; i<media; i++) {
            System.out.printf("%2do. nota: ", (i+1));
            array[i] = teclado.nextInt();
            soma += array[i];
        }

        System.out.println("\nEscolha a operação que deseja para a notas");
        System.out.println("1 - Aritmetica\n");
        System.out.println("2 - Ponderada\n");

        System.out.println("OPÇÃO= ");
        escolha = teclado.nextInt();
        switch(escolha){
            case 1:
            mediaritmetica(soma);
            break;
            case 2:
            mediaponderada(array);
            break;
            default:
            System.out.println("Código inválido");}

    }

    public static void mediaritmetica(int soma){
        int calcula;

        calcula = (soma) / 3;

        System.out.printf("Media Aritmetica: %d", calcula);

    }

    public static void mediaponderada(int array[]){
        int i=0;
        int calcula = 0;

        for(i=0; i<3; i++){
            calcula = ((array[i])*2+(array[i])*2+(array[i])*4)/8;
        }
        System.out.printf("Media Ponderada: %d", calcula);
    }
}

