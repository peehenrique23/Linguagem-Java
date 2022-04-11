import java.util.Scanner;

public class lista1exercicio9 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int escolha;
        int cont=0, cont1=0, cont2=0, cont3=0, cont4=0;
        int a=18, b=21, c=22, d=19, e=21;
        int continua;
        int total=0;
    
        System.out.println("Cachorro Quente - [Cod: 100] - [18.00R$]");
        System.out.println("Bauru Simples - [Cod: 101] - [21.50R$]");
        System.out.println("Bauru com Ovo - [Cod: 102] - [22.50R$]");
        System.out.println("Hamburguer - [Cod: 103] - [19.00R$]");
        System.out.println("CheeseBurguer - [Cod: 104] - [21.00R$]");

        do{
        System.out.println("Cod= ");
        escolha = input.nextInt();
        switch(escolha){
            case 100:
            cont++;
            break;
            case 101:
            cont1++;
            break;
            case 102:
            cont2++;
            break;
            case 103:
            cont3++;
            break;
            case 104:
            cont4++;
            break;
            default:
            System.out.println("Código inválido");}
        System.out.println("Deseja continuar? [1] - SIM / [2] - NÃO = ");
        continua = input.nextInt();
        }while (continua == 1);
        
        System.out.printf("Pedido: [\"%d\"] Cod:100\n", cont);
        System.out.printf("Pedido: [\"%d\"] Cod:101\n", cont1);
        System.out.printf("Pedido: [\"%d\"] Cod:102\n", cont2);
        System.out.printf("Pedido: [\"%d\"] Cod:103\n", cont3);
        System.out.printf("Pedido: [\"%d\"] Cod:104\n", cont4);
        total = ((cont*a) + (cont1*b) + (cont2*c) + (cont3*d) + (cont4*e));
        System.out.printf("Total do pedido: [\"%d\"]", total);
    }
}



