/* 
*Aquesta classe es una representació d'un Vi.
*Amb els seus setters i getters.
*/
public class Vi {
    private String nom;
    private int preu;   
    private int estoc;
    
    public Vi (String nom, int preu){
        this(nom, preu, 0);
    }
    public Vi (String nom, int preu, int estoc){
        this.nom = normalitzaNom(nom);
        if(estoc < 0){
            this.estoc = -1;
        } else {
            setEstoc(estoc);
        }
        if(preu < 0){
            this.preu = -1;
        } else {
            setPreu(preu);
        }
    }

    public String getNom() {  
        return nom;
    }    
    public int getPreu() {  
        return preu;
    }
    public int getEstoc() {  
        return estoc;
    }  
    
    // No pot ser negatiu 
    public void setPreu(int preu) { 
        if(preu > 0){
            this.preu = preu;
        }
    } 
    // No pot ser negatiu, si l'estoc no es vàlid serà 0
    public void setEstoc(int estoc) {
        if(estoc > 0){
            this.estoc = estoc;
        }
    } 
    public void setNom(String nom) {
        this.nom = normalitzaNom(nom);
    }
    
    /* Nom no pot ser espais en blanc o buit
     * No pot tenir espais ni davant ni darrere
     * No pot tenir més d'un espai entre paraules */     
    public static String normalitzaNom(String nom) {

        if(nom.isEmpty() || nom.isBlank()){
            return "NOM NO VÀLID!";
        }

        String nombre = nom.trim();
        String nomValid = "";

        for(int i = 0; i < nombre.length(); i++){
            if(Character.isLetterOrDigit(nombre.charAt(i))|| nombre.charAt(i)=='\''){
                nomValid += nombre.charAt(i); 
            } else if(Character.isWhitespace(nombre.charAt(i))){    
                if(!Character.isWhitespace(nombre.charAt(i+1))){
                    nomValid += nombre.charAt(i);
                } 
            }
        }
        return nomValid;
    }

    public boolean esValid(){
        if(nom.equals("NOM NO VÀLID!")){
            return false;
        }
        if(estoc == -1){
            return false;
        } 
        if(preu == -1){
            return false;
        }

        return true;
    }
    
    @Override
    public String toString() {
        return String.format("%n    Vi: %s%n    Preu: %d%n    Estoc: %d%n",
                         nom, preu, estoc);
    }
    public String[] aArrayString(){
        String nom = getNom();
        int preu = getPreu();
        int estoc = getEstoc();

        String[] vino = {nom, String.valueOf(preu), String.valueOf(estoc)};
        return vino;
    }
    public static Vi deArrayString(String[] vins){
        // vins [0] = nom
        // vins [1] = preu
        // vins [2] = estoc
        int p = 0;
        int e = 0;
        if(vins.length != 3){
            return null;
        }

        if(UtilString.esEnter(vins[1])){
            p = Integer.valueOf(vins[1]);
            if(p < 0){
                return null;
            }
        } else {
            return null;
        }  
        if(UtilString.esEnter(vins[2])){
            e = Integer.valueOf(vins[2]);
            if(e < 0){
                return null;
            }
        } else {
            return null;
        }   

        Vi vi = new Vi(vins[0], p, e);
        if(vi.esValid()){
            return vi;
        }
        return null;
    }
}
    
//Roura blanc;1234;24