/*
 * GatRenat: provant els Setter i els Getters de Vides, posició, estaViu, estaAssegut, estaDret...
 */

public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    
    public int getVides() {  //  retorna el nombre de vides
        return vides;
    }
    public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
        if (novesVides >= 0) {
            vides = novesVides;
        }
    }
    public String getPosicio(){
        return posicio;
    }
    public void setPosicio(String novaPosicio){
         posicio = novaPosicio;
    }
    public boolean estaViu(){
        if(vides > 0) return true;
        return false;    
    }
    public boolean estaAssegut(){
        if(posicio.equals("assegut")) return true;
        return false;    
    }
    public boolean estaDret(){
        if(posicio.equals("dret")) return true;
        return false;    
    }
    public boolean estaEstirat(){
        if(posicio.equals("estirat")) return true;
        return false;    
    }
    public String aixecat(){
        String posicioFinal = "dret";
        if(posicioFinal.equals(posicio)){
            return "no faig res";
        }
        posicio = "dret";
        return "m'aixeco";
    }
    public String seu(){
        String posicioFinal = "assegut";
        if(posicioFinal.equals(posicio)){
            return "no faig res";
        }
        posicio = "assegut";
        return "m'assec";
    }
    public String estirat(){
        String posicioFinal = "estirat";
        if(posicioFinal.equals(posicio)){
            return "no faig res";
        }
        posicio = "estirat";
        return "m'estiro";
    }
    
}
