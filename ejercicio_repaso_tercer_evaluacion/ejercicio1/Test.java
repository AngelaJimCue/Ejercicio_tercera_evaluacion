package ejercicio_repaso_tercer_evaluacion.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Estudiante> listaEstudiante = new ArrayList<>();
		listaEstudiante.add(new Estudiante("Eric", "Pérez", 25, 8.9));
		listaEstudiante.add(new Estudiante("Ángela", "Cuevas", 24, 7.5));
		listaEstudiante.add(new Estudiante("Fran", "Gil", 26, 9.9));
		listaEstudiante.add(new Estudiante("Teresa", "Antúnez", 25, 2.1));
		listaEstudiante.add(new Estudiante("Rocío", "Rente", 50, 2.1));
		//listaEstudiante.add(new Estudiante("Rocío", "Rente", 50, null));//Si descomento este estudiante, me salta la excepcion y me devuelve el syso.
		
		for (Estudiante estudiante : listaEstudiante) {
			System.out.println(estudiante);
		}
		
		System.out.println("-----------------------------------------------------------------------");
		
		try {
			List<String> listaEstudianteString /*<-- Ponemos esto porque pide una lista de string*/= listaEstudiante.stream()
					.filter(e -> e.getPromedio()>=8.0)
					.sorted((e1, e2) -> e1.getApellido().compareTo(e2.getApellido()))
					.map(e -> e.getNombre() + " " + e.getApellido() + " - " + e.getPromedio())
					.collect(Collectors.toList())
					;
	listaEstudianteString.forEach(System.out::println); //ES LO MISMO QUE "e -> System.out.println(e)";
		}catch (NullPointerException e) {
			System.out.println("Hay un null en el promedio");
		}
		
	}
}
