public class Alimentacao extends Loja{
    private Data dataAlvara;


public Alimentacao(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, Data dataAlvara){
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao);
    this.dataAlvara = dataAlvara;
}

public Data getDataAlvara(){
return this.dataAlvara;
}

public void setDataAlvara(Data dataAlvara){
    this.dataAlvara = dataAlvara;
}

    @Override
    public String toString(){
        return "";
    }

}
