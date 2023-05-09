package ProjetoPOO;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String senha) {
        super(senha);
        
    }

    @Override
    public double saca(double valor) {
        if (valor > getSaldo()) {
            System.out.println("Seu saldo é insuficiente");
            System.out.println("Saldo atual: " + getSaldo());

        }else{
            double saldoAtual = getSaldo() - valor;
            setSaldo(saldoAtual);
            System.out.println("Valor sacado com sucesso.");
            getExtrato().add(new Extrato("Saque", valor));
        }
        return getSaldo();

    }

    @Override
    public double deposita(double valor) {
        if (valor<0) {
            throw new IllegalArgumentException("Voce tentou depositar um valor inválido");
        }else{
            double saldoAtual = getSaldo() + valor;
            setSaldo(saldoAtual);
            getExtrato().add(new Extrato("Deposito", valor));
            return getSaldo();
        }
    }

    @Override
    public boolean validarIdade(int idade){
        if (idade>=18) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void extrato(){
        System.out.println("======   EXTRATO   =====");
        for (int i = 0; i < getExtrato().size(); i++) {
            System.out.println(getExtrato().get(i).getTipoOperacao() +" ---------- R$" + getExtrato().get(i).getValor());
        }
        System.out.println("Saldo ---------R$" + getSaldo());
    }

    
    
}