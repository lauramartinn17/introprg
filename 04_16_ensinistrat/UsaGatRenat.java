/*
 * Classe UsaGatRenat: El renat diu....i diu si s'aixeca, si s'asseu, si s'estira..
 */

public class UsaGatRenat{
    public static void main(String[] args){
        
        GatRenat renat = new GatRenat();
        
        System.out.println("El Renat diu: "+ renat.aixecat());
        System.out.println("El Renat diu: "+ renat.seu());
        System.out.println("El Renat diu: "+ renat.estirat());
        System.out.println("El Renat diu: "+ renat.estirat());   
        
    }   
}
