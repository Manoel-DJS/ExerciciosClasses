package ClassePessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public void envelhecer(int idade){
        this.idade += idade;
        if(this.idade < 21){
            this.altura += 0.05 * idade;
        }

    }

    public void engordar(int peso){
        this.peso += peso;
    }
    public void emagrecer(int peso){
        this.peso -= peso;
    }
    public void crescer(double altura){
        this.altura += altura;
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
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }


}
