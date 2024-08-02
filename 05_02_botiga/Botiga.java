
/*
 * Aquesta programa gestiona la botiga de vins, ens permet 
 * crear una nova botiga y buscar, afegir o eliminar vins.
 */
import java.util.ArrayList;

public class Botiga {
    private final int DEFAULT_MAX_VINS = 100;
    private Vi vins[];

    public Botiga() {
        vins = new Vi[DEFAULT_MAX_VINS];
    }

    public Botiga(int maxVins) {
        if (maxVins > 0) {
            vins = new Vi[maxVins];
        } else {
            vins = new Vi[DEFAULT_MAX_VINS];
        }
    }

    public Vi afegeix(Vi vi) {
        if (cerca(vi.getNom()) == null && vi.esValid()) {
            for (int i = 0; i < vins.length; i++) {
                if (vins[i] == null) {
                    vins[i] = vi;
                    return vi;
                }
            }
        }
        return null;
    }

    public Vi elimina(String nom) {
        if (cerca(nom) == null) {
            return null;
        } else {
            Vi vi = cerca(nom);
            Vi recorda = null;
            if (vi.getEstoc() > 0) {
                return null;
            } else {
                for (int i = 0; i < vins.length; i++) {
                    if (vins[i] != null && vins[i].getNom().equals(vi.getNom()) && vins[1].getEstoc() == 0) {
                        recorda = vins[1];
                        vins[1] = null;
                    }
                }
            }
            return recorda;
        }
    }

    public Vi cerca(String nom) {
        for (int i = 0; i < vins.length; i++) {
            if (vins[i] != null && vins[i].getNom().toUpperCase().equals(Vi.normalitzaNom(nom.toUpperCase()))) {
                return vins[i];
            }
        }
        return null;
    }
}