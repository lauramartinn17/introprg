/*
*Classe UsaHora que diu si les hores introduides son valides o no.
*/

public class UsaHora {
    public static void main(String[] args) {
        System.out.println("Intentarem crear una hora amb valors no vàlids");
        try {
            Hora hora = new Hora(-1, 1, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Argument il·legal!");
        }
    }
}