package punto3;

public class CazaLigero extends NaveEspacial {
    private static final int ENERGIA_INICIAL = 500;

    public CazaLigero(double posicionX, double posicionY) {
        super(posicionX, posicionY);
        setEnergia(ENERGIA_INICIAL);
    }

    @Override
    public void ataca(NaveEspacial adversario) {
        adversario.setEnergia(adversario.getEnergia() - 50);
    }

    @Override
    public String toString() {
        return "CazaLigero{" +
                "nombre='" + getNombre() + '\'' +
                ", energia=" + getEnergia() +
                ", posicionX=" + getPosicionX() +
                ", posicionY=" + getPosicionY() +
                '}';
    }
}