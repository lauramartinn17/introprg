//Aquest programa defineix el pis inicial del ascensor i la posicio inicial amb les respectives condiccions, getters i setters i l'estat en que es troba

public class Ascensor {
    private int pis = -1;
    private int temp;
    private boolean abaix = false;
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
	public boolean estaAturat() {
		if (aturat == false) {
			movent = false;
			aturat = true;
			moviment = ("aturat");
			pujant = false;
			baixant = false;
			
			return aturat;
			
		} else {
			
			return aturat;	
		}
	}	
	public boolean estaPujant() {
		if (aturat == true) {
			movent = true;
			aturat = false;
			moviment = ("pujant");
			pujant = true;
			baixant = false;
			
			return pujant;
			
		} else {
			
			return pujant;	
		}
	}
	public boolean estaBaixant() {
		if (aturat == true) {
			movent = true;
			aturat = false;
			moviment = ("baixant");
			baixant = true;
			pujant = false;
			
			return baixant;
			
		} else {
			
			return baixant;	
		}
	}
	public int seguentPis() {
		if (pujant == true) {
			if (pis > -2 && pis < 10) {
				pis = pis + 1;
				return pis;
			} else if (pis == 10) {
				pujant = false;
				baixant = true;
				moviment = ("baixant");
				pis = pis -1;
				return pis;
			} else {
				return pis;
			}
		} else if (baixant == true) {
			if (pis > -1 && pis < 11) {
				pis = pis - 1;
				return pis;
			} else if (pis == -1) {
				baixant = false;
				pujant = true;
				moviment = ("pujant");
				pis = pis + 1;
				return pis;
			} else {
				return pis;
			}
		} else {
			return pis;
		}
	}
}

