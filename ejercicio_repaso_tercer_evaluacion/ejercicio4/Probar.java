package ejercicio_repaso_tercer_evaluacion.ejercicio4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Probar {
	public static void main(String[] args) {
		List<Empleado> listaEmpleado = new ArrayList<>();
		listaEmpleado.add(new Empleado(1, "Juan", "Ventas", 2000.0)); // ---- 1
		listaEmpleado.add(new Empleado(2, "María", "Recursos Humanos", 3500.0));
		listaEmpleado.add(new Empleado(3, "Pedro", "Desarrollo", 4000.0));
		listaEmpleado.add(new Empleado(4, "Laura", "Marketing", 3200.0));
		listaEmpleado.add(new Empleado(5, "Carlos", "Desarrollo", 3800.0));
		listaEmpleado.add(new Empleado(6, "Ana", "Ventas", 3600.0));// ---- 3
		listaEmpleado.add(new Empleado(7, "Miguel", "Recursos Humanos", 3700.0));
		listaEmpleado.add(new Empleado(8, "Sara", "Marketing", 3300.0));
		listaEmpleado.add(new Empleado(9, "Luis", "Desarrollo", 3900.0));
		listaEmpleado.add(new Empleado(10, "Elena", "Ventas", 1500.0));// ---- 2
		
		listaEmpleado.forEach(e -> System.out.println(e));
		
		System.out.println("---------------------------------------------------------------------------------------");
		String departamentoEspecifico = "Ventas";
		List<String> listaEmpleadoEspecifico = listaEmpleado.stream()					
					.filter(e -> departamentoEspecifico.equals(e.getDepartamento()))
					//.sorted(Comparator.comparingDouble(Empleado::getSalario))//Ascendiente
					.sorted(Comparator.comparingDouble(Empleado::getSalario).reversed())//Descendiente 
					.map(e -> e.getNombre().toUpperCase() + " - " + e.getSalario()) //Si queremos la información al completo sería así: (e.getId(), e.getNombre().toUpperCase(), e.getDepartamento(), e.getSalario()))
					.collect(Collectors.toList())
					
					;
					listaEmpleadoEspecifico.forEach(e-> System.out.println(e));
		
	}
}
