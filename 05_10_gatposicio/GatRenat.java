/*
 * Clase GatRenat on es declaren els getters & setters de posicio tant per String, per int o GatPosicio.
 */
public class GatRenat {
    private GatPosicio posicio = GatPosicio.ESTIRAT;

    public GatRenat() {
    }

    public GatRenat(GatPosicio posicio) {
        setPosicio(posicio);
    }

    public GatRenat(String posicio) {
        setPosicio(posicio);
    }

    public GatPosicio getPosicio() {
        return posicio;
    }

    public void setPosicio(GatPosicio posicio) {
        this.posicio = posicio;
    }

    public void setPosicio(String posicioString) {
        GatPosicio posicio = GatPosicio.fromString(posicioString);
        this.posicio = posicio;
    }

}
