package ClasseTV;
import java.util.Scanner;
public class ProgramaTV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TV controle = new TV();
        
        System.out.println("Programa para TV \n");
        
        System.out.println("A TV ligou!");
        System.out.println("Número do canal: " + controle.getNumeroCanal());
        System.out.println("Volume da TV: " + controle.getVolume());
        System.out.println("\n" + "Digite o canal: ");
        int canal = scanner.nextInt();
        System.out.println("Se desejar aumentar o volume, digite o número: ");
        int aumentaVolume = scanner.nextInt();
        System.out.println("Se desejar diminuir o volume, digite o número: ");
        int diminuiVolume = scanner.nextInt();

        controle.aumentarVolume(aumentaVolume);
        controle.diminuirVolume(diminuiVolume);
        controle.mudarCanal(canal);

        System.out.println("Número do canal: " + controle.getNumeroCanal());
        System.out.println("Volume da TV: " + controle.getVolume());

        scanner.close();
    }    

}
