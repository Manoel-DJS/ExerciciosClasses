package ClasseQuadrado;

public class ProgramaQuadrado {
    public static void main(String[] args) {
        Quadrado Q1 = new Quadrado();
        
        Q1.mudarValorL(5);

        System.out.println("Valor do lado: " + Q1.retornaValor());
        System.out.println("Area do quadrado: " + Q1.calcularArea());
    }
}
