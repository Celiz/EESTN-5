package punto2;

public class Clinica {

	public static void main(String[] args) {
		Domicilio domicilioMedico = new Domicilio("Av. Principal", 123);
        ContratoMedico contratoMedico = new ContratoMedico("Contrato A", 50000);
        Medico medico = new Medico("Dr. Juan", "123456", domicilioMedico, contratoMedico, 9876);

        Domicilio domicilioEnfermero = new Domicilio("Av. Secundaria", 456);
        Enfermero enfermero = new Enfermero("Enfermera Ana", "789012", domicilioEnfermero, 3);

        System.out.println(medico);
        System.out.println(enfermero);

        Enfermero.actualizarSueldoBasico(35000); 

        System.out.println("Sueldo actualizado del enfermero: $" + enfermero.calcularSueldo());

	}

}