public class bomprato {
    private int nmrmesa;
    private int qtdpessoas;
    private int totalconta = 0;

 //recebe todos os parametros
 public bomprato(int nmrmesa, int qtdpessoas, int totalconta){
    this.nmrmesa = nmrmesa;
    this.qtdpessoas = qtdpessoas;
    this.totalconta = totalconta;
}

    public int getNmrmesa(){
        return this.nmrmesa;
    }

    public void setNmrmesa(int nmrmesa){
        this.nmrmesa = nmrmesa;
    }

    public int getQtdpessoas(){
        return this.qtdpessoas;
    }

    public void setQtdpessoas(int qtdpessoas){
        this.qtdpessoas = qtdpessoas;
    }

    public int getTotalconta(){
        return this.totalconta;
    }

    public void setTotalconta(int totalconta){
        this.totalconta = totalconta;
    }


    public int pedido(int codproduto, int qtdproduto){
        int contatotal=0;
        
        if(codproduto == 1){
            contatotal = 5*qtdproduto;
            return contatotal;
        }
            else if(codproduto == 2){
                contatotal = 15*qtdproduto;
                return contatotal;
            }
                else if(codproduto == 3){
                    contatotal = 6*qtdproduto;
                    return contatotal;
                }
        return contatotal;
    }

    public double desconto(int codesconto){
        double descontototal = 0;
        if(codesconto == 1){
            double recebe = this.totalconta * 0.10;
            descontototal -= recebe;
            return descontototal;
        }
            else if(codesconto == 2){
                double recebe = this.totalconta * 0;
                descontototal -= recebe;
                return descontototal;
            }
                else if(codesconto == 3){
                    double recebe = this.totalconta * 0.15;
                    descontototal -= recebe;
                    return descontototal;
                }
        return descontototal;
    }

    public double valorporcabeca(double valortotalmesa){
        double totalporcabeca = valortotalmesa/this.qtdpessoas;
        return totalporcabeca;
    }

}
