/* 
*Class Botiga que fa diferents accions.
*Com pot ser Afegir un vi, eliminar un vi, cercar i modificar.
*/

import java.io.BufferedReader;

public class Botiga {
    private int DEFAULT_MAX_VINS;
    private Vi[] vins;
    private int recorregut = 0;

    public Botiga() {
        this(100);
    }

    public Botiga(int maxVins) {
        DEFAULT_MAX_VINS = maxVins;
        vins = new Vi[DEFAULT_MAX_VINS];
    }

    /*
     * Afegeix vi
     * Comprova que no hi hagi vi amb el mateix nom
     * Si hi ha, no fa res (retorna null)
     * Si no hi ha, buscara entrada array = null
     * Afegira alla el vi
     * Retornara el vi introduït
     */
    public Vi afegeix(Vi vino) {

        if (!vino.esValid()) {
            return null;
        }

        if (cerca(vino.getNom()) == null) {
            for (int i = 0; i < vins.length; i++) {
                if (vins[i] == null) {
                    vins[i] = vino;
                    return vins[i];
                }
            }
        }
        return null;
    }

    /*
     * Busca el vi --> no: retorna null
     * sí --> posicio posara null i retorna el vi
     * si hi ha estoc, no l'elimina, retornara null
     */
    public Vi elimina(String nom) {
        Vi vi = cerca(nom);
        if (vi == null) {
            return null;
        }
        if (vi.getEstoc() > 0) {
            return null;
        }
        for (int i = 0; i < vins.length; i++) {
            if (vins[i].equals(vi)) {
                vins[i] = null;
                return vi;
            }
        }
        return null;
    }

    /*
     * Si troba el vi, retorna el vi
     * Cas contrari, torna null
     */
    public Vi cerca(String nom) {

        String nombre = Vi.normalitzaNom(nom);
        nombre = nombre.toLowerCase();
        for (Vi vi : vins) {
            if (vi != null) {
                if (vi.getNom().toLowerCase().equals(nombre)) {
                    return vi;
                }
            }
        }
        return null;
    }

    public Vi modifica(Vi vino) {
        Vi viantic = cerca(vino.getNom());
        if (viantic == null) {
            return null;
        } else {
            viantic.setPreu(vino.getPreu());
            viantic.setEstoc((vino.getEstoc()));
            return viantic;
        }
    }

    public void iniciaRecorregut() {
        this.recorregut = 0;
    }

    public Vi getSeguent() {
        for (int i = recorregut; i < vins.length; i++) {
            Vi vi = vins[recorregut];
            recorregut = recorregut + 1;
            if (vi == null)
                continue;
            return vi;
        }
        return null;
    }
}
