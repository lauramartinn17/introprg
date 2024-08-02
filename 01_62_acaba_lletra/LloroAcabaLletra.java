/* 
*Programa que repeteix paraules que comencen per vocals i acaben amb una lletra
*/
public class LloroAcabaLletra{
    public static void main(String [] args){
        
        String paraula = "hola";  
        
        while (!(paraula.isBlank())){
            System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
            paraula = Entrada.readLine();
            
            if(!paraula.isBlank()){
                char lletra = paraula.charAt(0);
                int lon = paraula.length();
                char fin = paraula.charAt(lon - 1);
                
                if (Character.isLetter(fin) == true && (fin == 'a'|| fin == 'e' || fin == 'i'|| fin == 'o'|| fin == 'u')){
              
               return;
                }else{
                System.out.println("El lloro diu: " + paraula);
            }    
        }
   }System.out.println("Adéu");
}
}
            
