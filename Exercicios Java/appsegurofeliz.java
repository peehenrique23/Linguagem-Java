public class appsegurofeliz {
    public static void main(String[] args){

        segurofeliz apolice = new segurofeliz("Pedro", 21, 200);

        System.out.printf("Dados:");
        System.out.println("\n");
        System.out.printf("Nome do segurado: %s", apolice.getNomesegurado());
        System.out.println("\n");
        System.out.printf("Idade: %d", apolice.getIdade());
        System.out.println("\n");
        System.out.printf("Valor do premio: %d$", apolice.getValorpremio());
        System.out.println("\n");

        System.out.println("====================");
        double bonus = apolice.calculapremio();
        System.out.printf("Dados c/ acrescimo de idade:");
        System.out.println("\n");
        System.out.printf("Nome do segurado: %s", apolice.getNomesegurado());
        System.out.println("\n");
        System.out.printf("Idade: %d", apolice.getIdade());
        System.out.println("\n");
        System.out.printf("Valor do premio: %d$", apolice.getValorpremio());
        System.out.println("\n");
        System.out.printf("Valor premio com acrescimo: %.2f$", bonus);
        System.out.println("\n");

        System.out.println("====================");
        String nomecidade = "Belo Horizonte";
        double descontoporcidade1 = apolice.descontoporcidade(nomecidade);
        System.out.printf("Dados c/ desconto por cidade:");
        System.out.println("\n");
        System.out.printf("Nome do segurado: %s", apolice.getNomesegurado());
        System.out.println("\n");
        System.out.printf("Idade: %d", apolice.getIdade());
        System.out.println("\n");
        System.out.printf("Valor do premio: %d$", apolice.getValorpremio());
        System.out.println("\n");
        System.out.printf("Valor premio com desconto: %.2f$", descontoporcidade1);
    }
}
