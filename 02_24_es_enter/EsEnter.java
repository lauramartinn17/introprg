//* Funció que comprova si es enter un número

public class EsEnter{
    public static void main (String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text = "x";
        while (text.isBlank()==false && text.isEmpty()==false){
            text = Entrada.readLine();
            text = text.strip();
            text = text.trim();
            boolean comprovaEnter = UtilString.esEnter(text);
            if (comprovaEnter==true){
                System.out.println("És enter");
            }else if (comprovaEnter== false && text.isBlank()==false){
                System.out.println("No és enter");
            }
        }
        System.out.println("Adéu");
    }
}
