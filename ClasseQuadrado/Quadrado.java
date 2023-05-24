package ClasseQuadrado;

public class Quadrado {
    private int tamanhoLado;

    public void mudarValorL(int novoLado){
        tamanhoLado = novoLado;
    }
    
    public int retornaValor(){
        return tamanhoLado;
    }

    public int calcularArea(){
        return tamanhoLado*tamanhoLado;
    }
}
