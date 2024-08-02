/*
*Classe entorn "menu" per a les diferents opcions
*Opcio: ajuda, afegeix, cerca, modifica, elimina
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class Entorn {
    private final Botiga botiga = new Botiga();
    public static void main(String[] args) throws IOException{
        Entorn entorn = new Entorn();
        mostraBenvinguda();
        entorn.carregaVins();
        while (true) {
            mostraPrompt();
            String comanda = Entrada.readLine().strip();
            if (comanda.isEmpty()) continue;
            if (comanda.equals("surt")) break;
            switch (comanda) {
                case "ajuda": mostraAjuda();
                             break;
                case "afegeix": entorn.processaAfegeix();
                           break;
                case "cerca": entorn.processaCerca();
                             break;
                case "modifica": entorn.processaModifica();
                            break;
                case "elimina": entorn.processaElimina();
                           break;
                default: mostraErrorComandaDesconeguda();
            }
        }
        entorn.guardaVins();
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
        if(nom.isEmpty()){
            return;
        }
        Vi vi = botiga.cerca(nom);
        if(vi != null){
            System.out.println("A eliminar:"+ vi);
                System.out.print("Segur?> ");
                String r = Entrada.readLine();
                if(UtilString.respostaABoolean(r)){
                   Vi vino = botiga.elimina(nom);
                   if(vino != null){
                   System.out.println("Eliminat");
                   }else{
                    System.out.println("ERROR: no s'ha pogut eliminar");
                   }
                }else{
                    System.out.println("No eliminat");
                }
        }else{
            System.out.println("No trobat");
        }
    }
    private void processaModifica() {
        int p = 0;
        int e = 0;
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if(nom.isEmpty()){
            return;
        }
        Vi vi = botiga.cerca(nom);
        if(vi == null){
            System.out.println("No trobat");
            return;
        }
        System.out.print("preu (enter "+vi.getPreu()+")> ");
        String preu = Entrada.readLine();
        if(!preu.isEmpty() || !preu.isBlank()){
            if(UtilString.esEnter(preu)){
                p = Integer.valueOf(preu);
                if(p < 0){
                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                    return;
                }
            }     
        }else{
                p=vi.getPreu();
            }
        System.out.print("estoc (enter "+vi.getEstoc()+")> ");
        String estoc = Entrada.readLine();
        if(!estoc.isEmpty() || !estoc.isBlank()){
            if(UtilString.esEnter(estoc)){
                e = Integer.valueOf(estoc);
                if(e < 0){
                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                    return;
                }
            }     
        }else{
            e=vi.getEstoc();
        }   
        Vi vino = botiga.modifica(new Vi(nom, p, e));
        if(vino != null){
            System.out.println("Modificat:\n"+vino);
        }/*else{
            System.out.println("ERROR: no s'ha pogut afegir");
        }*/
    }
    private void processaCerca() {
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if(nom.isEmpty()){
            return;
        }
        Vi vi = botiga.cerca(nom);
        if(vi != null){
            System.out.println("Trobat:\n"+vi);
        }else{
            System.out.println("No trobat");
        }
    }
    private void processaAfegeix() {
        int p = 0;
        int e = 0;
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if(nom.isEmpty()){
            return;
        }
        System.out.print("preu (en cèntims)> ");
        String preu = Entrada.readLine();
        if(!preu.isEmpty() || !preu.isBlank()){
            if(UtilString.esEnter(preu)){
                p = Integer.valueOf(preu);
                if(p < 0){
                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                    return;
                }
            }     
        }
        System.out.print("estoc (enter sense estoc)> ");
        String estoc = Entrada.readLine();
        if(!estoc.isEmpty() || !estoc.isBlank()){
            if(UtilString.esEnter(estoc)){
                e = Integer.valueOf(estoc);
                if(e < 0){
                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                    return;
                }
            }     
        }
        Vi vi = botiga.afegeix(new Vi(nom, p, e));
        if(vi != null){
            System.out.println("Introduït:\n"+vi);
        }else{
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
    public void carregaVins() throws IOException{
        int contador = 0;
        int preu;
        int estoc;
        Vi vino;
        
        // Si no existe el fichero, devuelve la referencia a 0
        File fitxer = new File("botiga.csv");
        if (! fitxer.exists()) {
            System.out.println("Referències llegides: " + contador);
            return;
        }
        
        // Si existe, abre el fichero y empieza a leerlo. 
        FileReader fileReader = new FileReader("botiga.csv");
        BufferedReader input = new BufferedReader(fileReader);      
        while (true) {
            String linia = input.readLine();                       
            if (null == linia) break;   
            String[] introdueix = linia.split(";");       //Agafa la linia i ho converteix en un String[]
            vino = Vi.deArrayString(introdueix);  // Transforma a un vi
            if (vino == null) { continue; }          // Si retorna null, es que no compleix requisits.
            vino = botiga.afegeix(vino);          
            if (vino != null) contador++;       //Si retorna no null, es que compleix requisits --> suma una referencia
        }
        input.close();
        System.out.println("Referències llegides: " + contador);
    }
    
    public void guardaVins() throws IOException{
        int contador = 0;
        String cami = "botiga.csv";
        BufferedWriter sortida = new BufferedWriter(new FileWriter(cami));


        botiga.iniciaRecorregut();
        while (true) {
            Vi vi = botiga.getSeguent();
            if (vi == null) break;
            String[] arrayVi = vi.aArrayString();
            String introdueix = String.join(";", arrayVi) + System.lineSeparator();
            sortida.write(introdueix);  
            contador++;
        } 
        sortida.close(); 
        System.out.println("Referències guardades: " + contador);
    }
}
