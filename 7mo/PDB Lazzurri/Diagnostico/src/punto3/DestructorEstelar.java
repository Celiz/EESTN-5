package punto3;

public class DestructorEstelar extends NaveEspacial {
    private int cantidadTripulantes;
    private static final int ENERGIA_INICIAL = 1000;

    public DestructorEstelar(double posicionX, double posicionY, int cantidadTripulantes) {
        super(posicionX, posicionY);
        this.cantidadTripulantes = cantidadTripulantes;
        setEnergia(ENERGIA_INICIAL);
    }

    @Override
    public void ataca(NaveEspacial adversario) {
        adversario.setEnergia(adversario.getEnergia() - 200);
    }

    @Override
    public void mueve(double x, double y) {
        super.mueve(x / 2, y / 2); // Reduce los incrementos un 50%
    }

    @Override
    public String toString() {
        return "DestructorEstelar{" +
                "nombre='" + getNombre() + '\'' +
                ", energia=" + getEnergia() +
                ", posicionX=" + getPosicionX() +
                ", posicionY=" + getPosicionY() +
                ", cantidadTripulantes=" + cantidadTripulantes +
                '}';
    }
}