package ejercicio_repaso_tercer_evaluacion.ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import ejercicio_repaso_tercer_evaluacion.ejercicio5.Coche.EstadoCoche;

public class Prueba {
	public static void main(String[] args) {
		List<Coche> listaCoche = new ArrayList<>();
		listaCoche.add(new Coche("Toyota Corolla", 20000.0, EstadoCoche.NUEVO)); // ----
		listaCoche.add(new Coche("Ford Mustang", 35000.0, EstadoCoche.USADO));
		listaCoche.add(new Coche("Honda Civic", 15000.0, EstadoCoche.NUEVO));// ----
		listaCoche.add(new Coche("BMW Serie 3", 30000.0, EstadoCoche.NUEVO));// ----
		listaCoche.add(new Coche("Chevrolet Tahoe", 40000.0, EstadoCoche.EN_REPARACION));
		listaCoche.add(new Coche("Volkswagen Golf", 18000.0, EstadoCoche.NUEVO));// ----
		listaCoche.add(new Coche("Volkswagen Golf", 18000.0, EstadoCoche.NUEVO));// ----
		listaCoche.add(new Coche("Audi A4", 32000.0, EstadoCoche.USADO));
		listaCoche.add(new Coche("Ford F-150", 25000.0, EstadoCoche.EN_REPARACION));
		listaCoche.add(new Coche("Toyota Camry", 28000.0, EstadoCoche.USADO));
		
		listaCoche.forEach(System.out::println);
		System.out.println("  * Cantidad de coches en total: " + listaCoche.stream().count());
		
		System.out.println("---------------------------------------------------------------------");
		EstadoCoche estadoCocheEspecifico = EstadoCoche.NUEVO;
		List<String> listaCocheEspecifico = listaCoche.stream()
				.filter(c -> estadoCocheEspecifico.equals(c.getEstado())) // Solo aparece los coches con el estado "Nuevo".				
				.peek(c -> System.out.println("Coche: " + c.getModelo() + " --> " +c.getEstado()))  // Muestra el contenido sin alterar ningun dato.
				.map(c -> c.getModelo() + " - " + c.getPrecio() + "€") // Muestra el modelo y precio del coche.
				
				.sorted((c1,c2) -> c2.compareTo(c1)) //Ordenados por nombre.
				
				.collect(Collectors.toList())
				
				;
		listaCocheEspecifico.forEach(System.out::println);//Imprime la información.
	
		System.out.println("*********************************************************************");
		Optional<String> listaCocheEspecifico2 = listaCoche.stream()
                .map(c -> c.getModelo() + " - " + c.getPrecio() + "€\n")
                
                .limit(8) //Muestra los 7 primeros.
                
                .skip(2)//Salta a los primeros, es decir, los dos primeros no los muestra porque se lo salta.
                .distinct()//elimina los dos iguales, es decir, hay dos "Volkswagen Golf - 18000.0€" y como hay dos iguales elimina uno.
                
                .reduce((cadena1, cadena2) -> cadena1 + cadena2)
                
                ;
		 System.out.println(listaCocheEspecifico2.orElse(null));
		 
	}
}
