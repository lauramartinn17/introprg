/*
*Modifiquem els pisos amb un enter i inicialment l'ascensor es trobarà a la planta -1
*/
public class Ascensor {
    public int pis = -1;
    public static void pujaPis(Ascensor ascensor) {
        ascensor.pis = ascensor.pis +1;
    }
    public static void main(String[] args) {
        Ascensor ascensor;
        ascensor = new Ascensor();
        System.out.println("L'ascensor inicialment està a la planta "+ ascensor.pis);
        pujaPis(ascensor);
        System.out.println("L'ascensor finalment està a la planta "+ ascensor.pis);
    }
}