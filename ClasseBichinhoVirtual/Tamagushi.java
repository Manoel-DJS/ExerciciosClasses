package ClasseBichinhoVirtual;

public class Tamagushi {
    // Tamagushi é um Bichinho Eletrônico / Virtual

    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public void AlimentarBichinho(String AlimentaTamagushi){
        if (AlimentaTamagushi.equalsIgnoreCase("S")){
            this.fome += 25;
        } else if(AlimentaTamagushi.equalsIgnoreCase("N")){
            this.fome -= 20;
        }
    }

    public void verificarsaude(int Novasaude){
        this.saude = Novasaude;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}
