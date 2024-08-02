/*Aquest programa mostra l'estat i el pis inicial*/
public class UsaAscensor {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        System.out.println("Pis inicial: " + ascensor.pis);
        System.out.println("Moviment inicial: " + ascensor.moviment);
        ascensor.moviment = ("pujant");
        System.out.println("Moviment final: " + ascensor.moviment);
    }
}
