/*
 * Programa que dibuixa un quadrat de X amb el costat indicat per args[0]
 * Pressuposa que args[0] conté un valor enter vàlid
 */
public class LloroQuadrat {
    public static void main(String[] args) {
    	
    	String entrada = "hola";
    	
    	while (!entrada.isBlank()){
    		System.out.println("El lloro espera paraula:");
    		entrada = Entrada.readLine();
    		if(entrada.equals("dibuixa quadrat")) {
    		   dibuixaQuadrat();
    		} else if (entrada.equals("dibuixa rectangle")) {
    		   dibuixaRectangle();
    		} else if (!entrada.isBlank()) {
    		   System.out.println("El lloro repeteix: " + entrada);
    		}
    	   }
    	   System.out.println("Adéu");
     }
    
    public static void dibuixaQuadrat() {
        for (int linia=1; linia <= 5; linia++) {
            // dibuixa una línia
            for (int columna=1; columna <= 5; columna++) {
                // dibuixa un element de la línia
                System.out.print(" X");
            }
            System.out.println("");   // finalitza la línia
        }
    }
    
    public static void dibuixaRectangle() {
        for (int linia=1; linia <= 5; linia++) {
            // dibuixa una línia
            for (int columna=1; columna <= 10; columna++) {
                // dibuixa un element de la línia
                System.out.print(" X");
            }
            System.out.println("");   // finalitza la línia
        }
    }
}