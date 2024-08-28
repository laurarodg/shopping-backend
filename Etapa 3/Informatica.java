public class Informatica extends Loja{
    private double seguroEletronicos;


public Informatica(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, double seguroEletronicos){
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao);
    this.seguroEletronicos = seguroEletronicos;
}

public double getSeguroEletronicos(){
return this.seguroEletronicos;
}

public void setSeguroEletronicos(double seguroEletronicos){
    this.seguroEletronicos = seguroEletronicos;
}

    @Override
    public String toString(){
        return "";
    }

}
