package ProjetoPOO;
import java.util.*;

public abstract class ContaBancaria {
    //private Cliente cliente;
    private String senha;
    private int numero;
    private double saldo;
    private ArrayList<Extrato> extrato = new ArrayList<Extrato>();

    public ContaBancaria(){
        
    }
    public ContaBancaria(String senha){
        this.senha = senha;
    }
    
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void alteraSenha(String senha){
            setSenha(senha);
            System.out.println("Nova senha: " + getSenha());
    }

    public ArrayList<Extrato> getExtrato() {
        return extrato;
    }

    public void setExtrato(ArrayList<Extrato> extrato) {
        this.extrato = extrato;
    }
    // public Cliente getCliente() {
    //     return cliente;
    // }

    // public void setCliente(Cliente cliente) {
    //     this.cliente = cliente;
    // }

    public abstract boolean validarIdade(int idade);
    public abstract double saca(double valor);
    public abstract double deposita(double valor);
    public abstract void extrato();    
}
