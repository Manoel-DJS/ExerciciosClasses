package ClasseContaCorrente;

public class ContaCorrente {
    private int nConta;
    private String nomePessoa;
    private double saldo;

    public ContaCorrente(int numeroConta, String nomeC){
        this.nConta = numeroConta;
        this.nomePessoa = nomeC;
        this.saldo = 0;
    }

    public ContaCorrente(int numeroConta, String nomeC, double saldo){
        this.nConta = numeroConta;
        this.nomePessoa = nomeC;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public String getNomePessoa() {
        return nomePessoa;
    }
    public int getnConta() {
        return nConta;
    }

    public void alterarNome(String nome){
        this.nomePessoa = nome;
    }

    public void depositar(double deposito){
        this.saldo += deposito;
    }

    public void sacar(double saque){
        if(this.saldo <= 0 || this.saldo < saque){
            System.out.println("Saldo insuficiente para saque");
        } else{
            this.saldo -= saque;
        }
    }
}
