/*
 * Classe UsaGatRenat: Demana posicio, diu les vides inicials, Posicio inicial, demana una nova posició i diu la posició final.
 */

public class UsaGatRenat{
    public static void main(String[] args){
        
        GatRenat renat = new GatRenat();
        System.out.printf("Vides inicials: %d%n", renat.getVides());
        System.out.printf("Posició inicial: %s%n", renat.getPosicio());
        System.out.println("Introdueix nova posició:");
        String resposta = Entrada.readLine();
        renat.setPosicio(resposta);
        
        System.out.printf("Posició final: %s%n", renat.getPosicio());
        
    }
}
