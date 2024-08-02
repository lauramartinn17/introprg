/*
*Programa que repeteix paraules que començen per vocals en minuscules
*/
public class LloroVocalMinuscules{
    public static void main(String [] args){
        
        String paraula = "hola";  
        
        while (!(paraula.isBlank())){
            System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
            paraula = Entrada.readLine();
            if(!(paraula.isBlank())){
                char lletra = paraula.charAt(0);
                if (lletra == 'a'|| lletra == 'e' || lletra == 'i'|| lletra == 'o'|| lletra == 'u'){
                    System.out.println("El lloro diu: " + paraula);
                }
           }
        }
        System.out.println("Adéu");
   }
}
