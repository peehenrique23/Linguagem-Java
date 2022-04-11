public class segurofeliz {
    private String nomesegurado;
    private int idade;
    private int valorpremio;

    //recebe todos os parametros
    public segurofeliz(String nomesegurado, int idade, int valorpremio){
        this.nomesegurado = nomesegurado;
        this.idade = idade;
        this.valorpremio = valorpremio;
    }

     //construtor para n receber nada
     public segurofeliz(){
        this.nomesegurado = "Default";
        this.idade = 0;
        this.valorpremio = 0;
    }

    public String getNomesegurado(){
        return this.nomesegurado;
    }

    public void setNomesegurado(String nomesegurado){
        this.nomesegurado = nomesegurado;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getValorpremio(){
        return this.valorpremio;
    }

    public void setValorpremio(int valorpremio){
        this.valorpremio = valorpremio;
    }

    public double calculapremio(){
        double valorfinal=0;

        if(this.idade >= 18 && this.idade <= 28){
            double recebe = this.valorpremio * 0.25;
            valorfinal = recebe + this.valorpremio;
            return valorfinal;
        }
            else if(this.idade > 28 && this.idade <= 38){
                double recebe = this.valorpremio * 0.18;
                this.valorpremio += recebe;
                valorfinal = recebe + this.valorpremio;
                return valorfinal;
            }
                else if(this.idade > 38){
                    double recebe = this.valorpremio * 0.05;
                    this.valorpremio += recebe;
                    valorfinal = recebe + this.valorpremio;
                    return valorfinal;
                }
        return valorfinal;
    }

    public double descontoporcidade(String nomecidade){
        double descontoporcidade1 = 0;

        if(nomecidade == "Curitiba"){
            double recebe = this.valorpremio * 0.25;
            this.valorpremio -= recebe;
            descontoporcidade1 = this.valorpremio - recebe;
            return descontoporcidade1;
        }
            else if(nomecidade == "Rio de janeiro"){
                double recebe = this.valorpremio * 0.20;
                this.valorpremio -= recebe;
                descontoporcidade1 = this.valorpremio - recebe;
                return descontoporcidade1;
            }
                else if(nomecidade == "Belo Horizonte"){
                    double recebe = this.valorpremio * 0.15;
                    this.valorpremio -= recebe;
                    descontoporcidade1 = this.valorpremio - recebe;
                    return descontoporcidade1;
                }
                    else if(nomecidade == "São paulo" || nomecidade == "Sao paulo"){
                        double recebe = this.valorpremio * 0.10;
                        this.valorpremio -= recebe;
                        descontoporcidade1 = this.valorpremio - recebe;
                        return descontoporcidade1;
                    }
        return descontoporcidade1;
    }
}
