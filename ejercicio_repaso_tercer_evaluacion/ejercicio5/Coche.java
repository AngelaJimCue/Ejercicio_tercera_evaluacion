package ejercicio_repaso_tercer_evaluacion.ejercicio5;

public class Coche {
	private int id;
	private String modelo;
	private Double precio;
	private EstadoCoche estado;
	
	//ENUM
	public enum EstadoCoche{
		NUEVO, USADO, EN_REPARACION,;
	}
	
	
	public Coche(String modelo, Double precio, EstadoCoche estado) {
		this.modelo = modelo;
		this.precio = precio;
		this.estado = estado;
	}

	//getter
	public String getModelo() {
		return modelo;
	}
	public Double getPrecio() {
		return precio;
	}
	public EstadoCoche getEstado() {
		return estado;
	}


	//tostring
	@Override
	public String toString() {
		return "Modelo:" + modelo + ", precio:" + precio + " y estado:" + estado;
	}
	
	
	
	
}
