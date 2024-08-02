/*Aquest programa crea un ascensor des d'un altre fitxer i mostra l'estat (pujant, o aturat) i el pis inicial i se li ha d'indicar el pis de desti i quina accio es vol fer*/
public class UsaAscensor {
    // XXX considera si et cal algun mòdul d'ajut
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
        System.out.println("Estat de l'ascensor: " + ascensor.getEstat());
    }
}
