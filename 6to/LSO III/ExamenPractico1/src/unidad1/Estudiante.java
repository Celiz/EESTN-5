package unidad1;

public class Estudiante extends Persona {
	
	private String curso;
	private int anio;
	
	
    public Estudiante(String apellido, String nombre, int edad, int dni, String curso, int anio) {
		super(apellido, nombre, edad, dni);
		this.curso = curso;
		this.anio = anio;
	}


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String misDatos() {
        return super.misDatos() + "\nCurso: " + curso + "\nAnio: " + anio + "\n";
    }
}
