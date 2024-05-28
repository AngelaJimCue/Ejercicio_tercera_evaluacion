package ejercicio_repaso_tercer_evaluacion.ejercicio1;
// Ejercicio lambdas e interfaces funcionales, excepciones, opcional y stream.

public class Estudiante {
	//PROPIEDADES
	private String nombre;
	private String apellido;
	private int edad;
	private Double promedio;//Porque los primitivos no aceptan null, por lo tanto el double lo tengo que poner como clase.
	
	//CONSTRUCTOR
	public Estudiante(String nombre, String apellido, int edad, Double promedio) { 
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.promedio = promedio;
	}
	
	
	//GETTER
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	public double getPromedio() {
		return promedio;
	}


	//TOSTRING
	@Override
	public String toString() {
		return String.format("Nombre: %s, "
				+ "apellido: %s, "
				+ "edad: %d y "
				+ "promedio: %.2f ", 
					nombre,apellido,edad,promedio);
	}
	
	
}
