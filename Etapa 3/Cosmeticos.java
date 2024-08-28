
public class Cosmeticos extends Loja {

    private double taxaComercializacao;

    public Cosmeticos(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return this.taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return "";
    }

}
