package ClasseBichinhoVirtual;

public class Tamagushi {
    // Tamagushi é um Bichinho Eletrônico / Virtual

    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public Tamagushi(){
        this.fome = 80;
        this.saude = 100;
    }

    public void alterarNome(String novoNome){
        this.nome = novoNome;
    }

    public void alterarFome(int novaFome){
        this.fome = novaFome;
        
    }

    public void AlimentarBichinho(String AlimentaTamagushi){
        if (AlimentaTamagushi.equalsIgnoreCase("S")){
            this.fome += 25;
        } else if(AlimentaTamagushi.equalsIgnoreCase("N")){
            this.fome -= 20;
        }
        if (this.fome > 100){
            System.out.println("Seu bichinho tá de buxo cheio");
        }
    }

    public void verificarsaude(int Novasaude){
        this.saude = Novasaude;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSaude() {
        return saude;
    }
    public int getFome() {
        return fome;
    }
    
}
