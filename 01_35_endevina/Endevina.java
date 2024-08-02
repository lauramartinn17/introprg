/*
*Programa que pensa un numero i el usuari l'ha d'endevinar
*/
public class Endevina{
    public static void main(String [] args){
        
        boolean encertat = false;
        int numero =42;
        
        int entrada;
        
        while (!encertat){ //*Mentres sigui fals 
            System.out.println("Introdueix un nombre entre el 1 i el 100");
            entrada = Integer.parseInt(Entrada.readLine()); 
            if (entrada <= 0) { 
                System.out.println("Com a mínim 1"); 
              
            }else if (numero>entrada){
                System.out.println("És més gran que " + entrada); 
               
            }else if (entrada >= 100) { 
                System.out.println("Com a màxim 100");  //*La resta esta fora de rang
          
            } else if (numero<entrada) {
                System.out.println("És més petit que "+ entrada); 

            } else if (numero==entrada) {
                encertat = true;
            }
        }
        System.out.println("Has encertat!");
   }
}