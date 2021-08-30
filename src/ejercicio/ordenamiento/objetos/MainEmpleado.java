package ejercicio.ordenamiento.objetos;

import java.util.Arrays;

public class MainEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10 empleados
		Empleado amy = new Empleado();
		amy.setNombre("Amy");
		amy.setApellido("Adams");
		amy.setEdad(47);
		amy.setSalario(10550.50d);
		// 2
		Empleado quentin = new Empleado();
		quentin.setNombre("Quentin");
		quentin.setApellido("Tarantino");
		quentin.setEdad(58);
		quentin.setSalario(10600.40d);
		// 3
		Empleado uma = new Empleado();
		uma.setNombre("Uma");
		uma.setApellido("Torman");
		uma.setEdad(51);
		uma.setSalario(10550.55d);
		// 4
		Empleado zoe = new Empleado();
		zoe.setNombre("Zoe");
		zoe.setApellido("Bell");
		zoe.setEdad(42);
		zoe.setSalario(9500.41d);
		// 5
		Empleado michael = new Empleado();
		michael.setNombre("Michael");
		michael.setApellido("Fox");
		michael.setEdad(60);
		michael.setSalario(9500.40d);
		// 6
		Empleado christopher = new Empleado();
		christopher.setNombre("Christopher");
		christopher.setApellido("Lloyd");
		christopher.setEdad(82);
		christopher.setSalario(8989.90d);
		// 7
		Empleado kate = new Empleado();
		kate.setNombre("Kate");
		kate.setApellido("Siegel");
		kate.setEdad(39);
		kate.setSalario(9500.00d);
		// 8
		Empleado manuela = new Empleado();
		manuela.setNombre("Manuela");
		manuela.setApellido("Velasco");
		manuela.setEdad(45);
		manuela.setSalario(9000.00d);
		// 9
		Empleado natalie = new Empleado();
		natalie.setNombre("Natalie");
		natalie.setApellido("Pérez");
		natalie.setEdad(34);
		natalie.setSalario(9500.00d);
		// 10
		Empleado mon = new Empleado();
		mon.setNombre("Monserrat");
		mon.setApellido("Laferte");
		mon.setEdad(38);
		mon.setSalario(10000.55d);

		Empleado nominaEmpleados[] = new Empleado[10];
		nominaEmpleados[0] = amy;
		nominaEmpleados[1] = quentin;
		nominaEmpleados[2] = uma;
		nominaEmpleados[3] = zoe;
		nominaEmpleados[4] = michael;
		nominaEmpleados[5] = christopher;
		nominaEmpleados[6] = kate;
		nominaEmpleados[7] = manuela;
		nominaEmpleados[8] = natalie;
		nominaEmpleados[9] = mon;

		System.out.println("          ---------- GPF ----------");
		System.out.println("Nómina de empleados: GPF");
		System.out.println("Ordenamiento por salario actual");

		// vector antes de ordenar
		System.out.println();
		System.out.println("Nómina antes de ordenar");
		System.out.println(Arrays.toString(nominaEmpleados));
		// Ordenamiento por edad
		Arrays.sort(nominaEmpleados);
		System.out.println();
		System.out.println("Nómina despues de ordenar");
		System.out.println(Arrays.toString(nominaEmpleados));

	}

}
