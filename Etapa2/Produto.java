
public class Produto {

    //atributos
    private String nome;
    private float preco;
    private Data dataDeValidade;

    //metodo construtor
    public Produto(String nome, float preco, Data dataDeValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataDeValidade = dataDeValidade;
    }

    //metodo getters e setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return this.dataDeValidade;
    }

    public void setDataValidade(Data dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public boolean estaVencido(Data dataNova) {
        if (dataNova.getAno() > dataDeValidade.getAno()) {
            return true;
        } else if (dataNova.getAno() == dataDeValidade.getAno() && dataNova.getMes() > dataDeValidade.getMes()) {
            return true;
        } else if (dataNova.getAno() == dataDeValidade.getAno() && dataNova.getMes() == dataDeValidade.getMes() && dataNova.getDia() > dataDeValidade.getDia()) {
            return true;
        } else {
            return false;
        }

    }
}
