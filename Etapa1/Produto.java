
public class Produto {

    //atributos
    private String nome;
    private float preco;

    //metodo construtor
    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
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

    public String toString() {
        return "Nome do produto: " + this.nome + "\nPreço do produto: " + this.preco;
    }
}
