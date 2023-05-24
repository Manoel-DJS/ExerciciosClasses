package ClasseRetangulo;

public class Retangulo{
    private double base;
    private double altura;

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double calcularArea(){
        return base*altura;
    }

    public double calcularPerimetro(){
        return base*2 + altura*2;
    }
}