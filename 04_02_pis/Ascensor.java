/*
*Modifiquem els pisos amb un enter i inicialment l'ascensor es trobarà a la planta -1
*/
public class Ascensor {
    public int pis = -1;
    public static void main(String[] args) {
        Ascensor ascensor;
        ascensor = new Ascensor();
        System.out.println("L'ascensor està a la planta "+ ascensor.pis);
    }
}