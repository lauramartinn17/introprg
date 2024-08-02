
/* Llibreria externa
 * esEnter: comprova un número
 */ 
public class UtilString {
    public static boolean esEnter(String text){
        int digit =0;
        for (int i = 0; i < text.length(); i++){
            char caracter = text.charAt(i);

            if (Character.isDigit(caracter)){
                digit=1;
            }else {
                digit = 0;
            }
            if (text.startsWith("-") || text.startsWith("+")){
                digit=1;
            }
            if (text.startsWith(" ")){
                return false;
            }
            if (Character.isLetter(caracter)){
                return false;
            }
        }
        if (digit==1){
            return true;
        }else {
            return false;
        }
    }
}