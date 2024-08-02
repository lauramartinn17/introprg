/* 
*Aquesta classe es una representació d'un Vi.
*Amb els seus setters i getters.
*/

public class Vi {
    private String nom;
    private int preu;
    private int estoc;

    public Vi(String nom, int preu) {
        this(nom, preu, 0);
    }

    public Vi(String nom, int preu, int estoc) {
        this.nom = normalitzaNom(nom);
        if (estoc < 0) {
            this.estoc = -1;
        } else {
            setEstoc(estoc);
        }
        if (preu < 0) {
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
        if (preu > 0) {
            this.preu = preu;
        }
    }

    // No pot ser negatiu, si l'estoc no es vàlid serà 0
    public void setEstoc(int estoc) {
        if (estoc > 0) {
            this.estoc = estoc;
        }
    }

    public void setNom(String nom) {
        this.nom = normalitzaNom(nom);
    }

    /*
     * Nom no pot ser espais en blanc o buit
     * No pot tenir espais ni davant ni darrere
     * No pot tenir més d'un espai entre paraules
     */
    public static String normalitzaNom(String nom) {

        if (nom.isEmpty() || nom.isBlank()) {
            return "NOM NO VÀLID!";
        }

        String nombre = nom.trim();
        String nomValid = "";

        for (int i = 0; i < nombre.length(); i++) {
            if (Character.isLetterOrDigit(nombre.charAt(i))) {
                nomValid += nombre.charAt(i);
            } else if (Character.isWhitespace(nombre.charAt(i))) {
                if (!Character.isWhitespace(nombre.charAt(i + 1))) {
                    nomValid += nombre.charAt(i);
                }
            }
        }
        return nomValid;
    }

    public boolean esValid() {
        if (nom.equals("NOM NO VÀLID!")) {
            return false;
        }
        if (estoc == -1) {
            return false;
        }
        if (preu == -1) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return String.format("%n    Vi: %s%n    Preu: %d%n    Estoc: %d%n",
                nom, preu, estoc);
    }
}
