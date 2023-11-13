package modelo;

public abstract class Personaje implements Movible {
    private String nombre;
    private int vitalidad;
    protected Posicion posicion;

    public Personaje(String nombre, int vitalidad, Posicion posicion) {
        this.nombre = nombre;
        this.vitalidad = vitalidad;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public void recibeDanio(int cantidad) {
        if (cantidad > 0) {
            this.vitalidad -= cantidad;
        }
    }

    public void ataca(Personaje adversario) throws AtaqueImposibleException {
        double distancia = this.posicion.distancia(adversario.posicion);
        if (distancia <= getAlcanceAtaque()) {
            adversario.recibeDanio(getDañoAtaque());
        } else {
            throw new AtaqueImposibleException(this, adversario);
        }
    }

    protected abstract double getAlcanceAtaque();

    protected abstract int getDañoAtaque();

    
}

