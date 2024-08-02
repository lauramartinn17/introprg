/*
 * Aquesta programa ens mostrarà els diferents tipus de vi de la botiga, el 
 * preu i el seu estoc
 */
class Vi{
    private String nom;
    private int preu;
    private int estoc = 0;
    public Vi(String nom, int preu) {
        this.nom = normalitzaNom(nom);
        setPreu(preu);
    }
    public Vi(String nom, int preu, int estoc) {
        this.nom = normalitzaNom(nom);
        setPreu(preu);
        setEstoc(estoc);
    }

    public String getNom(){ return nom; }

    public int getPreu(){ return preu; }
    public void setPreu(int preu){
        if(preu < 0 && this.preu <= 0) {
            this.preu = -1; 
        } else if (preu < 0 && this.preu > 0){ 
	    this.preu = this.preu; 
	}else {
            this.preu = preu;
	}
    }
    public int getEstoc(){ return estoc; }
    public void setEstoc(int estoc){
        if(estoc < 0 && this.estoc <= 0) {
            this.estoc = -1; 
        } else if (estoc < 0 && this.estoc > 0){ 
	    this.estoc = this.estoc; 
	}else {
            this.estoc = estoc;
	}
    }
    public static String normalitzaNom(String nom){
        if(nom == null || nom.isEmpty() || nom.isBlank()) {
            return "NOM NO VÀLID!";
        }else{
            return nom.trim().replaceAll("\\s+"," ");
            //return nom.replaceAll("[^A-Za-z0-9]+", " ").trim();
        }
    }
    public boolean esValid(){
        if(nom.equals("NOM NO VÀLID!") || this.estoc < 0 || this.preu < 0) {
            return false;
        }else { 
	    return true; 
	}
    }
    @Override
    public String toString() {
        return String.format("%n    Vi: %s%n    Preu: %d%n    Estoc: %d%n", nom, preu, estoc);
    }
}