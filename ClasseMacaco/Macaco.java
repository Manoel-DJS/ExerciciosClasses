package ClasseMacaco;

public class Macaco {
    private String nome;
    private String bucho;

    public Macaco(String nome){
        this.nome = nome;
        this.bucho = "";
    }
    
    public void comer(String alimentarMacaco){
        this.bucho += alimentarMacaco;
    }

    public void digerir(){
        this.bucho = "";
        System.out.println("Digestão realizada!");
    }

    public void verBucho(){
        System.out.println("Olhando Bucho do Macaco: " + getBucho());
    }

    public String getNome() {
        return nome;
    }

    public String getBucho() {
        return bucho;
    }
}
