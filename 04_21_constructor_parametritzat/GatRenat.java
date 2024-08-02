/*
 * Protegint la posicio
 * Per accedir a la posició des de fòra de la classe
 * s'ha d'utilitzar els setters
*/

public class GatRenat {
    private int vides;
    private String posicio;
    public GatRenat(int novesVides) {
        vides = novesVides;
    }
    public GatRenat(int novesVides, String novaPosicio){
        setVides(novesVides);
        setPosicio(novaPosicio);
    }
    public int getVides() { return vides; }
    public String getPosicio(){
        return posicio;
    }
    public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
        if (novesVides >= 0) {
            vides = novesVides;
        }
    }
    public void setPosicio(String novaPosicio){
         if (novaPosicio.equals("estirat") ||
             novaPosicio.equals("dret") ||
             novaPosicio.equals("assegut")) {
                    posicio = novaPosicio;
         } else {
            posicio = "estirat";
         }
    }
    
    
    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }
    public static void main(String[] args) {
        System.out.println(new GatRenat(7, "estirat"));
    }
}