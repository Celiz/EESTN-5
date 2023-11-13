package modelo;

public class AtaqueImposibleException extends Exception {
    
	private static final long serialVersionUID = 2L;
	private Personaje atacante;
    private Personaje atacado;

    public AtaqueImposibleException(Personaje atacante, Personaje atacado) {
        this.atacante = atacante;
        this.atacado = atacado;
    }

    public Personaje getAtacante() {
        return atacante;
    }

    public Personaje getAtacado() {
        return atacado;
    }
}

