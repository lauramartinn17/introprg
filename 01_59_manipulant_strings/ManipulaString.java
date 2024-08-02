  /* 
 * Informe d'strings
 */
 public class ManipulaString{
    public static void main(String [] args){
        
        String sin ="";
        String sina ="";
        System.out.println("Paraula?");
        String paraula = Entrada.readLine();

        //Print longitud
        System.out.println("La longitud és " + paraula.length());
        
        //Imprimir la segona lletra
        System.out.println("La segona lletra és " + "'" + paraula.charAt(1) + "'"); 

        //Print ultima lletra
        int p = paraula.length();
        System.out.println("La darrera lletra és " + "'" + paraula.charAt(p - 1) + "'");
        
        //Print penultima
        System.out.println("La penúltima lletra és " + "'" + paraula.charAt(p - 2) +"'");

        //Print en may
        System.out.println("La paraula en majúscules és" + " \"" +paraula.toUpperCase() +"\"");

        //4 primeres
        for(int i = 0; i < p; i++){
           if(!(i == 4)){
                sin += paraula.charAt(i); 
           }
        }
        System.out.println("La composició de quatre primeres és" + " \"" + sin+"\"");

         //Moure una lletra al inici
        for(int i = 0; i < p; i++){
           if(!(i == 2)){
                sina += paraula.charAt(i); 
           }
        }
        System.out.println("La composició de quatre és " + " \"" + paraula.charAt(5)+ sina+"\"");


        System.out.print("La paraula amb les primeres tres lletres en majúscules i la resta en minúscules és "+" \"" );

        //Imprimir les tres primeres lletres en may
        for(int text=0; text<=2; text++){ 
            String lletra = String.valueOf(paraula.charAt(text));
            System.out.print(lletra.toUpperCase());
        }
    
        //Imprimir la resta de lletres en minuscula     
        for(int resta=3; resta<p; resta++){ 
            System.out.print(paraula.charAt(resta));
        }
       
    }
}
