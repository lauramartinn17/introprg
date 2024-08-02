/*
 * Clase GatPosicio que mitjançant enum indica la posició de GatRenat
 */
public enum GatPosicio {
    DRET,
    ASSEGUT,
    ESTIRAT;

    public static GatPosicio fromString(String posicioString) {
        for (GatPosicio posicio : GatPosicio.values()) {
            if (posicio.name().equalsIgnoreCase(posicioString)) {
                return posicio;
            }
        }
        throw new IllegalArgumentException(String.format("Valor \"%s\" no suportat per GatPosicio", posicioString));
    }

}
