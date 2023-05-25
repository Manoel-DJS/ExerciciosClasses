package ClassePessoa;

public class ProgramaPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Arlindo");
        p.setIdade(15);
        p.crescer(1.50);
        p.engordar(50);
        p.envelhecer(3);

        System.out.println(p.getPeso());

        System.out.println("Nome: " + p.getNome());
        System.out.println("A sua altura é: " + p.getAltura());
        System.out.println("Seu peso é: " + p.getPeso());
        System.out.println("Sua idade é: " + p.getIdade());

        p.envelhecer(2);

        System.out.println("A nova altura é: " + p.getAltura());

    }
}
