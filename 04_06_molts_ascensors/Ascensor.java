/*
*Modifiquem els pisos amb un enter i inicialment l'ascensor es trobarà a la planta -1
*/
public class Ascensor {
    public int pis = 0;
    public static Ascensor[] creaAscensors(int quants) {
        Ascensor[] ascensors = new Ascensor [quants];
        for(int i=0; i < ascensors.length; i++){
            ascensors[i] = new Ascensor();
            ascensors[i].pis = i;
        }
        return ascensors;
    }
    public static void main(String[] args) {
        if(!esEnter(args[0])||args[0].equals("0")){
            System.out.println("Cap ascensor");
        }else{
            int quants = Integer.parseInt(args[0]);
            Ascensor[] ascensors = creaAscensors(quants);
            for (int i=0; i < ascensors.length; i++){
                System.out.printf("Ascensor %d al pis %d%n", i, ascensors[i].pis);
            }
        }
    }
    public static boolean esEnter(String num){
        boolean esEnter = true;
        for (int i=0; i < num.length()-1; i++){
            if((!Character.isDigit(num.charAt(i)))){
                esEnter=false;
                break;
            }
        }
        return esEnter;
    }
}