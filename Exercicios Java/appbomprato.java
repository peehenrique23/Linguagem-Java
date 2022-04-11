public class appbomprato {
    public static void main(String[] args) {

        //1) Criar 2 mesas;
        bomprato bomprato0  = new bomprato(23, 2, 0);
        bomprato bomprato1  = new bomprato(22, 3, 0);

         //2) Imprimir todas as mesas;
         System.out.printf("Dados das Mesas:");
         System.out.println("\n");
         System.out.printf("Número da mesa: %d", bomprato0.getNmrmesa());
         System.out.println("\n");
         System.out.printf("Número da mesa: %d", bomprato1.getNmrmesa());
         System.out.println("\n");

         //3) Efetuar 2 pedidos para cada mesa;
        double pedido = bomprato0.pedido(2, 2);
        double pedido2 = bomprato0.pedido(1, 2);
        double pedido3 = bomprato1.pedido(3, 1);
        double pedido4 = bomprato1.pedido(1, 2);

        //4) Calcular e imprimir o valor final da conta e por pessoa;
        double valordesconto1 = bomprato0.desconto(1);
        double valormesa1 = ((pedido + pedido2) - (valordesconto1));
        double porcabeca1 = bomprato0.valorporcabeca(valormesa1);
        double valordesconto2 = bomprato1.desconto(3);
        double valormesa2 = ((pedido3 + pedido4) - (valordesconto2));
        double porcabeca2 = bomprato1.valorporcabeca(valormesa2);

        System.out.println("====================");
        System.out.printf("Fechamento da conta mesa: %d", bomprato0.getNmrmesa());
        System.out.println("\n");
        System.out.printf("Valor da conta: %f", valormesa1);
        System.out.println("\n");
        System.out.printf("Valor por pessoa: %f", porcabeca1);
        System.out.println("\n");

        System.out.println("====================");
        System.out.printf("Fechamento da conta mesa: %d", bomprato1.getNmrmesa());
        System.out.println("\n");
        System.out.printf("Valor da conta: %f", valormesa2);
        System.out.println("\n");
        System.out.printf("Valor por pessoa: %f", porcabeca2);
        System.out.println("\n");

        //5) Imprimir a mesa com o maior valor gasto por pessoa
        
        if(porcabeca1 > porcabeca2){
            System.out.printf("Maior valor pago individualmente foi da mesa: >%d<", bomprato0.getNmrmesa());
        }
            else{
                System.out.printf("Maior valor pago individualmente foi da mesa: >%d<", bomprato1.getNmrmesa());
            }
    }
}
