/*
* Programa que retorna la taula de multiplicar demanada.
*/
public class TaulaMultiplicar {
    public static void main(String[] args) {
    int primer = Integer.parseInt(args[0]); 
    int segon = Integer.parseInt(args[1]); 
    int tercer = Integer.parseInt(args[2]); 
    int quart = Integer.parseInt(args[3]); 
    int multiplicacio;
        for (int i=primer; i<=segon; i++){
            for (int j=tercer; j<=quart; j++){
            multiplicacio = i * j; 
            System.out.println( i + " x " + j + " = " + multiplicacio);
            }
        }
    }
}  