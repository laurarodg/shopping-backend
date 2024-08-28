
public class Data {

    //atributos
    private int dia;
    private int mes;
    private int ano;

    //metodo construtor
    public Data(int dia, int mes, int ano) {
        this.ano = ano;
        validarData(dia, mes, ano);
        this.dia = dia;
        this.mes = mes;
    }

    public String validarData(int dia, int mes, int ano) {
        String dataPadrao = "1/1/2000";

        if (verificaAnoBissexto()) {
            if (dia > 0 && dia <= 31) {
                return dia + "/" + mes + "/" + ano;
            } else if (mes == 2 && dia <= 29) {
                System.out.println("O ano informado é bissexto: " + dia + "/" + mes + "/" + ano);
            } else if (mes <= 12) {
                return dia + "/" + mes + "/" + ano;
            } else if (ano > 0) {
                return dia + "/" + mes + "/" + ano;
            } else {
                System.out.println("Erro! Formatando para data padrão...");
                return dataPadrao;
            }
        }
        return dataPadrao;
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

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public boolean verificaAnoBissexto() {
        if (this.ano % 4 == 0 || this.ano % 400 == 0 && this.ano % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
