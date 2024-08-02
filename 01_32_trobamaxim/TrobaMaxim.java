/*
*Programa que mostra el maximo maxim dels nombres introduits abans del negatiu
*/
public class TrobaMaxim {
    public static void main(String[] args) {
    System.out.println("Introdueix un valor");

 	int valor = Integer.parseInt(Entrada.readLine());
    int maxim = 0;   
        if (valor < 0){
            maxim = 0;
        }
        
     
        while (valor >= 0)  {
            if (valor >= maxim){
                maxim=valor;
                System.out.println("Introdueix un valor");
     		    valor = Integer.parseInt(Entrada.readLine());  
  	        } else if (valor <= maxim){
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());  

            }   
        }
        System.out.println("El màxim és " + maxim);
    }
}