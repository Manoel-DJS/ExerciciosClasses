package ClasseContaCorrente;

public class ProgramaContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(0234213,"Indefinido");

        conta.alterarNome("Snorlax");
        conta.depositar(300);
        conta.sacar(50);

        System.out.println("Nome do Correntista: " + conta.getNomePessoa() 
        + " \n" + "Saldo da conta: "  + conta.getSaldo());
    }
}
