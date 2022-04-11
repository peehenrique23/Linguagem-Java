package exerciciosAC1;
import java.util.Scanner;

public class operacao {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double n1, n2;
        int escolha;

        System.out.println("Digite um numero: ");
        n1 = teclado.nextDouble();

        System.out.println("Digite o segundo numero: ");
        n2 = teclado.nextDouble();

        System.out.println("\nEscolha a operação que deseja para os nmrs");
        System.out.println("1 - Média entre os números digitados\n");
        System.out.println("2 - Diferença entre os números\n");
        System.out.println("3 - Produtos entre os números digitados\n");
        System.out.println("4 - Divisão do primeiro pelo segundo\n");

        System.out.println("Cod= ");
        escolha = teclado.nextInt();
        switch(escolha){
            case 1:
            media(n1,n2);
            break;
            case 2:
            diferenca(n1,n2);
            break;
            case 3:
            produto(n1,n2);
            break;
            case 4:
            divisao(n1, n2);
            break;
            default:
            System.out.println("Código inválido");}
    }

    public static void media(double n1, double n2){
        double media1;

        media1 = (n1 + n2) / 2;

        System.out.printf("Media dos numeros: \"%f\"  ", media1);
    }

    public static void diferenca(double n1, double n2){
        double diferenca1;

        if(n1>n2){
            diferenca1 = n1 - n2;
        }
        else{
            diferenca1 = n2 - n1;
        }

        System.out.printf("Diferença dos nmrs: \"%f\"  ", diferenca1);
    }

    public static void produto(double n1, double n2){
        double produto1;

        produto1 = (n1) * (n2);

        System.out.printf("Produto dos nmrs: \"%f\"  ", produto1);
    }

    public static void divisao(double n1, double n2){
        double divisao1;

        divisao1 = (n1) / (n2);

        System.out.printf("Divisão dos nmrs: \"%f\"  ", divisao1);
    }
}
