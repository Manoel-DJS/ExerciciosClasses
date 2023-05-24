package ClasseRetangulo;
import java.util.Scanner;

public class ProgramaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Retangulo R1 = new Retangulo();

        System.out.println("Digite as medidas!");
        System.out.println("Digite a altura: ");
        double altura = scanner.nextInt();
        System.out.println("Digite a base: ");
        double base = scanner.nextInt();

        R1.setBase(base);
        R1.setAltura(altura);

        scanner.close();

        double area = R1.calcularArea();
        double perimetro = R1.calcularPerimetro();

        double quantidadePisos = area / 0.25;  // Cada piso tem 0.25 metros quadrados
        double quantidadeRodapes = perimetro / 0.5;  // Cada rodapé tem 0.5 metros

        System.out.println("Quantidade de pisos necessários: " + quantidadePisos);
        System.out.println("Quantidade de rodapes necessários: " + quantidadeRodapes);

    }
}
