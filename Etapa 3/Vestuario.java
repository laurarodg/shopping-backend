public class Vestuario extends Loja{
    private boolean produtosImportados;


public Vestuario(String nome, int quantidadeFuncionarios, float salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, boolean produtosImportados){
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao);
    this.produtosImportados = produtosImportados;
}

public boolean IsProdutosImportados(){
return this.produtosImportados;
}

public void setProdutosImportados(boolean produtosImportados){
    this.produtosImportados = produtosImportados;
}

    @Override
    public String toString(){
        return "";
    }

}
