package ejercicio_repaso_tercer_evaluacion.ejercicio3;

public class Prueba {
	public static void main(String[] args) {
		   Producto[] listaProducto = {
		            new Producto(1, "Camisa", 10),
		            new Producto(2, "Pantalón", 5),
		            new Producto(3, "Zapatos", 3)
		        };
		   
		   for (Producto producto : listaProducto) {
			System.out.println(producto);
		}
	}
}
