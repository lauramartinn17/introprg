/*
*Classe entorn "menu" per a les diferents opcions
*Opcio: ajuda, afegeix, cerca, modifica, elimina
*/
public class Entorn {
    private final Botiga botiga = new Botiga();

    public static void main(String[] args) {
        Entorn entorn = new Entorn();
        mostraBenvinguda();
        while (true) {
            mostraPrompt();
            String comanda = Entrada.readLine().strip();
            if (comanda.isEmpty())
                continue;
            if (comanda.equals("surt"))
                break;
            switch (comanda) {
                case "ajuda":
                    mostraAjuda();
                    break;
                case "afegeix":
                    entorn.processaAfegeix();
                    break;
                case "cerca":
                    entorn.processaCerca();
                    break;
                case "modifica":
                    entorn.processaModifica();
                    break;
                case "elimina":
                    entorn.processaElimina();
                    break;
                default:
                    mostraErrorComandaDesconeguda();
            }
        }
        mostraComiat();

    }

    private static void mostraComiat() {
        System.out.println("adéu");
    }

    private static void mostraErrorComandaDesconeguda() {
        System.out.println("ERROR: comanda no reconeguda. Escriviu help per ajuda");
    }

    private void processaElimina() {
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if (nom.isEmpty()) {
            return;
        }
        Vi vi = botiga.cerca(nom);
        if (vi != null) {
            System.out.println("A eliminar:" + vi);
            System.out.print("Segur?> ");
            String r = Entrada.readLine();
            if (UtilString.respostaABoolean(r)) {
                Vi vino = botiga.elimina(nom);
                if (vino != null) {
                    System.out.println("Eliminat");
                } else {
                    System.out.println("ERROR: no s'ha pogut eliminar");
                }
            } else {
                System.out.println("No eliminat");
            }
        } else {
            System.out.println("No trobat");
        }
    }

    private void processaModifica() {
        int p = 0;
        int e = 0;
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if (nom.isEmpty()) {
            return;
        }
        Vi vi = botiga.cerca(nom);
        if (vi == null) {
            System.out.println("No trobat");
            return;
        }
        System.out.print("preu (enter " + vi.getPreu() + ")> ");
        String preu = Entrada.readLine();
        if (!preu.isEmpty() || !preu.isBlank()) {
            if (UtilString.esEnter(preu)) {
                p = Integer.valueOf(preu);
                if (p < 0) {
                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                    return;
                }
            }
        } else {
            p = vi.getPreu();
        }
        System.out.print("estoc (enter " + vi.getEstoc() + ")> ");
        String estoc = Entrada.readLine();
        if (!estoc.isEmpty() || !estoc.isBlank()) {
            if (UtilString.esEnter(estoc)) {
                e = Integer.valueOf(estoc);
                if (e < 0) {
                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                    return;
                }
            }
        } else {
            e = vi.getEstoc();
        }
        Vi vino = botiga.modifica(new Vi(nom, p, e));
        if (vino != null) {
            System.out.println("Modificat:\n" + vino);
        } /*
           * else{
           * System.out.println("ERROR: no s'ha pogut afegir");
           * }
           */
    }

    private void processaCerca() {
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if (nom.isEmpty()) {
            return;
        }
        Vi vi = botiga.cerca(nom);
        if (vi != null) {
            System.out.println("Trobat:\n" + vi);
        } else {
            System.out.println("No trobat");
        }
    }

    private void processaAfegeix() {
        int p = 0;
        int e = 0;
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if (nom.isEmpty()) {
            return;
        }
        System.out.print("preu (en cèntims)> ");
        String preu = Entrada.readLine();
        if (!preu.isEmpty() || !preu.isBlank()) {
            if (UtilString.esEnter(preu)) {
                p = Integer.valueOf(preu);
                if (p < 0) {
                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                    return;
                }
            }
        }
        System.out.print("estoc (enter sense estoc)> ");
        String estoc = Entrada.readLine();
        if (!estoc.isEmpty() || !estoc.isBlank()) {
            if (UtilString.esEnter(estoc)) {
                e = Integer.valueOf(estoc);
                if (e < 0) {
                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                    return;
                }
            }
        }
        Vi vi = botiga.afegeix(new Vi(nom, p, e));
        if (vi != null) {
            System.out.println("Introduït:\n" + vi);
        } else {
            System.out.println("ERROR: no s'ha pogut afegir");
        }
    }

    private static void mostraAjuda() {
        System.out.println("Comandes disponibles:\najuda\ncerca\nafegeix\nmodifica\nelimina\nsurt");
    }

    private static void mostraPrompt() {
        System.out.print("botiga> ");
    }

    private static void mostraBenvinguda() {
        System.out.println("Celler La Bona Estrella. Escriviu ajuda per veure opcions.");
    }
}
