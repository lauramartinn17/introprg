 /*
  * Clase que considera iguals dos EnvoltaString quan els seus valors coincideixen 
  * sense tenir en compte majuscules y minuscules
  */
 public class EnvoltaString {
    private String valor;

    public EnvoltaString(String valor) { this.valor = valor; }

    public String toString() { return String.format("ENVOLTAT(\"%s\")", valor); }

    public boolean equals(EnvoltaString altre) {
        return valor.toUpperCase().equals(altre.valor.toUpperCase());
    }
 }
