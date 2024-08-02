/*Aquest programa defineix el pis inicial del ascensor i la posicio inicial*/

public class Ascensor {
    private int pis = -1;
    private int temp;
    
    private String moviment = ("aturat");          
    
    public int getPis() {
		return pis;
	}
	public void setPis(int nouPis) {
		if (nouPis < 11 && nouPis > -2) {
			pis = nouPis;
		} else{
			System.out.println("escriu un numero");
		}
    }
    public String getMoviment() {
		return moviment;
	}
	public void setMoviment(String nouMoviment) {
		if (nouMoviment.equals("pujant") || nouMoviment.equals("baixant") || nouMoviment.equals("aturat")) {
			moviment = nouMoviment;
		}else{
			return;
		}	
	}
		
}

