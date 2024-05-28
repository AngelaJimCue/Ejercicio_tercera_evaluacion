package ejercicio_repaso_tercer_evaluacion.ejercicio4;

public class Empleado {
	//PROPIEDADES
	private int id;
	private String nombre;
	private String departamento;
	private Double salario;
	
	//CONSTRUCTOR
	public Empleado(int id, String nombre, String departamento, double salario) {
		this.id = id;
		this.nombre = nombre;
		this.departamento = departamento;
		this.salario = salario;
	}

	//GETTER
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDepartamento() {
		return departamento;
	}
	public double getSalario() {
		return salario;
	}

	//TOSTRING
	@Override
	public String toString() {
		return String.format("ID:%d, "
				+ "Nombre:%s, "
				+ "Departamento:%s y "
				+ "Salario:%.2f",id,nombre,departamento,salario);
	}
}
