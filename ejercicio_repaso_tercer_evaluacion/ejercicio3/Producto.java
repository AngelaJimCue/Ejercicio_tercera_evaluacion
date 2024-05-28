package ejercicio_repaso_tercer_evaluacion.ejercicio3;

public class Producto {
	//PROPIEDADES
	private int id;
	private String nombre;
	private int cantidad;
	
	//CONSTRUCTOR
	public Producto(int id, String nombre, int cantidad) { 
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	//GETTER
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public int getCantidad() {
		return cantidad;
	}

	//TOSTRING
	@Override
	public String toString() {
		return String.format("Id:%d, "
				+ "Nombre:%s y "
				+ "Cantidad:%d",
				id,nombre,cantidad);
	}
}
