package ejercicio_repaso_tercer_evaluacion.ejercicio2;

import java.time.LocalDate;

public class Transaccion {
	//PROPIEDADES
	private int id;
	private Double importe;
	private LocalDate fecha;
	private String categoria;
	
	//CONTRUCTOR
	public Transaccion(int id, Double importe, LocalDate fecha, String categoria) {
		this.id = id;
		this.importe = importe;
		this.fecha = fecha;
		this.categoria = categoria;
	}
	
	//GETTER
	public int getId() {
		return id;
	}
	public Double getImporte() {
		return importe;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public String getCategoria() {
		return categoria;
	}

	//ToStrinf
	@Override
	public String toString() {
		return String.format("Id:%d, "
				+ "Importe:%.2f, "
				+ "Fecha:%s y " //La fecha va con %S, con %d da error.
				+ "Categoría:%s",
				id,importe, fecha, categoria);
	}	
}
