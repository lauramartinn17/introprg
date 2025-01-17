/*Aquest programa crea un ascensor des d'un altre fitxer i mostra l'estat i el pis inicial*/
public class UsaAscensor {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        System.out.println("Pis inicial: " + ascensor.getPis());
        System.out.println("Moviment inicial: " + ascensor.getMoviment());
        
        System.out.println("Introdueix nou pis:");
        ascensor.setPis(Integer.parseInt(Entrada.readLine()));
        
        System.out.println("Introdueix nou moviment:");
        ascensor.setMoviment(Entrada.readLine());
        
        System.out.println("Pis final: " + ascensor.getPis());
        System.out.println("Moviment final: " + ascensor.getMoviment());
    }
}
