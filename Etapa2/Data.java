
public class Data {

    //atributos
    private int dia;
    private int mes;
    private int ano;

    //metodo construtor
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean verificaAnoBissexto() {
        if (this.ano % 4 == 0 || this.ano % 400 == 0 && this.ano % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
