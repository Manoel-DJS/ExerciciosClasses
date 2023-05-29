package ClasseBichinhoVirtual;

public class ProgramaBichinhoVirtual {
    public static void main(String[] args) {
        Tamagushi bichinho = new Tamagushi();
        bichinho.alterarNome("Venonim");
        bichinho.setIdade(10);
        bichinho.verificarsaude(90);
        bichinho.alterarFome(90);

        System.out.println("O nome de seu bichinho é " + bichinho.getNome());
        System.out.println("Idade: " + bichinho.getIdade());
        System.out.println("A saúde de seu bichinho está: " + bichinho.getSaude() + "%");
        System.out.println("Nível de fome do bichinho " + bichinho.getFome() + "%");

    }
}
