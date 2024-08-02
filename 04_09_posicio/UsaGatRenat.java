/*
*Usa GatRenat que diu les vides que te al inici, la posició Inicial y la posició final.
*/
public class UsaGatRenat{
    public static void main(String[] args){
        
        GatRenat renat = new GatRenat();
        System.out.printf("Vides inicials: %d%n", renat.vides);
        System.out.printf("Posició inicial: %s%n", renat.posicio);
        
        renat.setPosicio("assegut");
        
        System.out.printf("Posició final: %s%n", renat.posicio);
        System.out.println();
        
    }
}
