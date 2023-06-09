package ClasseMacaco;

public class ProgramaMacaco {
    public static void main(String[] args) {
        Macaco macaco1 = new Macaco("RobertU");
        Macaco macaco2 = new Macaco("Edinaldo");

        String alimento1 = " Banana ";
        String alimento2 = " Pera ";
        String alimento3 = " Abobora ";
        
        macaco1.comer(alimento3);
        macaco1.comer(alimento2);
        macaco1.comer(alimento1);
        macaco1.verBucho();
        
        macaco2.comer(alimento1);

        // digestão   macaco1.digerir();

        macaco1.verBucho();
        
        macaco2.verBucho();

    }
}
