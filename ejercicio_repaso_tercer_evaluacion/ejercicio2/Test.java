package ejercicio_repaso_tercer_evaluacion.ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test {
	public static void main(String[] args) {
		List<Transaccion> listaTransacciones = new ArrayList<>();
		listaTransacciones.add(new Transaccion(1, 20.0, LocalDate.of(2024, 4, 16), null));
		listaTransacciones.add(new Transaccion(2, 30.9, LocalDate.of(2024, 4, 16), "Alimentos"));
		listaTransacciones.add(new Transaccion(3, 15.7, LocalDate.of(2024, 4, 16), "Transporte"));
		listaTransacciones.add(new Transaccion(4, 80.4, LocalDate.of(2024, 4, 16), "Entretenimiento"));
		listaTransacciones.add(new Transaccion(5, null, LocalDate.of(2024, 4, 16), "Entretenimiento"));
		listaTransacciones.add(new Transaccion(6, 18.4, LocalDate.of(2024, 4, 16), "Transporte"));
		
		
		for (Transaccion transaccion : listaTransacciones) {
			System.out.println(transaccion);
		}
		
		System.out.println("---------------------------------------------------------------------");
		
		Optional<Double> importeTotal = listaTransacciones.stream()
                .filter(t -> t.getCategoria() != null && t.getImporte() != null) // Filtrar por la categoría buscada
                .filter(t -> "Entretenimiento".equals(t.getCategoria()))
                .map(Transaccion::getImporte)//Muestra el importe de la clase transaccion y te lo pasa por la clase double
                .reduce((subtotal, importe) -> subtotal + importe) // Sumar los importes
				;
		System.out.println(importeTotal.orElse(null)); //orElse: método que permite manejar momentos donde el optional no tiene valor, por lo cual, el orElse da un valor predeterminado, que se usará cuando este vacío el valor.
	}
}
