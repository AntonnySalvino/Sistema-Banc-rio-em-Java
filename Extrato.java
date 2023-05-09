package ProjetoPOO;

public class Extrato {
    private String tipoOperacao;
    private double valor;

    public Extrato(String tipoOperacao, double valor){
        this.tipoOperacao = tipoOperacao;
        this.valor = valor;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
