//Aquest programa defineix el pis inicial del ascensor i la posicio inicial amb les respectives condiccions, getters i setters i l'estat en que es troba

public class Ascensor {
    private int pis = -1;
    private int temp;
    private boolean abaix = true;
    private boolean amunt = false;
    private boolean aturat = true;
    private boolean movent = false;
    private boolean pujant = false;
    private boolean baixant = false;
    private String estat;
    private String moviment = ("aturat");          
    
    public int getPis() {
		return pis;
	}
	public void setPis(int nouPis) {
		if (nouPis < 11 && nouPis > -2) {
			pis = nouPis;
		} 		
    }
    public String getMoviment() {
		return moviment;
	}
	public void setMoviment(String nouMoviment) {
		if (nouMoviment.equals("pujant") || nouMoviment.equals("baixant") || nouMoviment.equals("aturat")) {
			moviment = nouMoviment;
		}	
	}
	public boolean estaAbaix()  {
		if (pis == -1) {
			abaix = true;
		}else {
			abaix = false;
		}
		return abaix;
	}
	public boolean estaAmunt()  {
		if (pis == 10) {
			amunt = true;
		}else {
			amunt = false;
		}
		return amunt;
	}
	public boolean estaMovent() {
		if (moviment.equals("pujant") || moviment.equals("baixant")) {
			movent = true;
			aturat = false;
		} else {
			movent = false;
			aturat = true;
		}
		return movent;
	}	
	public String getEstat() {
		estat = (moviment + " al pis " + pis);
		return estat;
	}		
}

