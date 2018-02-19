import utilidades.Leer;
import utilidades.Fecha;

public class Principal {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha fechaActual;
		String nombre,departamento,especialidad;
		Fecha fechaNac,fechaIng;
		Integer dia,mes,año;
		float bono;
		int personasACargo, opcion, indice;
		fechaActual=new Fecha(19,2,2018);
		Empleado empleados[]=new Empleado[20];

		pedirJefe(empleados, 0);

		//System.out.println(empleados[0].edadEmpleado(fechaActual));


		do {
			opcion = Leer.pedirEntero("Que quieres hacer?\n"+ menu());
		}while(opcion >= 10 || opcion < 0);

		do {
			switch (opcion) {
			case 1://crear responsable
				pedirJefe(empleados, empleados[0].getSiguiente());//pasa algo por llamarle con el empleados 0? O hago public el static? 
				break;
			case 2://crear administrativo
				pedirAdministrativo(empleados, empleados[0].getSiguiente());
				break;
			case 3://crear tecnico
				pedirTecnico(empleados, empleados[0].getSiguiente());
				break;
			case 4://listar toda la plantilla

				for(indice = 0; indice < empleados.length && empleados[indice] != null; indice++) {
					listarEmpleados(empleados, indice, fechaActual);
					System.out.println("--------------------------");
				}//for
				break;
			case 5://calcular la nomina de la plantilla. (Por empleado mostrandola en cada empleado y sumando el importe total)
				listarNominas(empleados, fechaActual);
				break;
			case 6://Cambiar el salario base de los empleados\n"
				float nuevoSueldo;

				nuevoSueldo = Leer.pedirFloat("Cual va a ser el nuevo sueldo?");
				empleados[0].setSalario_base(nuevoSueldo);
				break;
			case 7://Cambiar el plus de responsabilidad de los jefes\n"
				float nuevoPlus;
				nuevoPlus = Leer.pedirFloat("Cual va a ser el nuevo plus?");
				for(int i=0;i <  empleados.length;i++){
					if (empleados[i] instanceof Responsable){
						Responsable resp;
						resp=(Responsable) empleados [i];
						resp.setPlusResponsabilidad(nuevoPlus);
					}
				}
				break;
			case 8://Cambiar el plus de antiguedad de los administrativos\n"
				float nuevoPlus2;
				nuevoPlus2 = Leer.pedirFloat("Cual va a ser el nuevo plus?");
				for(int i=0;i <  empleados.length;i++){
					if (empleados[i] instanceof Administrativo){
						Administrativo admi;
						admi=(Administrativo) empleados [i];
						admi.setPlusAntiguedad(nuevoPlus2);
					}
				}
				//setPlusAntiguedad(nuevoPlus);
				break;
			case 9:// Cambiar el plus de especialidad de los tecnicos\n"
				float nuevoPlus3;
				nuevoPlus3 = Leer.pedirFloat("Cual va a ser el nuevo plus?");
				//setPlusEspecialidad(nuevoPlus3);
				for(int i=0;i< empleados.length;i++){
					if(empleados[i] instanceof Tecnico){
						Tecnico tec;
						tec=(Tecnico) empleados[i];
						tec.setPlusEspecialidad(nuevoPlus3);
					}
				}
				//porque no puedo usar el metodo estatico publico?
				break;
			}
			System.out.println(menu());
			opcion = Leer.pedirEntero("");

		}while(opcion != 0);
	}//main

	public static void listarNominas(Empleado [] empleados, Fecha fechaActual) {

		double importeTotal = 0;

		for(int indice = 0; indice < empleados.length && empleados[indice] != null; indice++) {
			if (empleados[indice] instanceof Responsable) {
				Responsable aux;
				aux = (Responsable)empleados[indice];
				aux.visualizarDatos();				
				importeTotal = importeTotal + aux.calculoNomina();

			}else if (empleados[indice] instanceof Administrativo) {
				Administrativo aux;
				aux = (Administrativo)empleados[indice];
				aux.visualizarDatos();				
				importeTotal = importeTotal + aux.calculoNomina();
			}else {
				Tecnico aux;
				aux = (Tecnico)empleados[indice];
				aux.visualizarDatos();

				importeTotal = importeTotal + aux.calculoNomina();
			}//if

			System.out.println("-----------------------------------------");
		}//for
		System.out.println("El importe total es: " + importeTotal);
	}//listarNominas

	public static void listarEmpleados(Empleado empleados [], int indice, Fecha fechaActual) {
		if (empleados[indice] instanceof Responsable) {
			Responsable aux;
			aux = (Responsable)empleados[indice];
			aux.visualizarDatos();

		}else if (empleados[indice] instanceof Administrativo) {
			Administrativo aux;
			aux = (Administrativo)empleados[indice];
			aux.visualizarDatos();

		}else {
			Tecnico aux;
			aux = (Tecnico)empleados[indice];
			aux.visualizarDatos();
		}
	}//listarEmpleados


	public static void pedirJefe(Empleado [] empleados, int indiceVector) {
		String nombre,departamento,especialidad;
		Fecha fechaNac,fechaIng;
		Integer dia,mes,año;
		float bono;
		int personasACargo;
		nombre=Leer.pedirCadena("Introduzca el nombre del jefe");
		fechaNac=pedirFechaNac();
		fechaIng=pedirFechaIng();
		bono = Leer.pedirFloat("Introduce el bono del jefe.");
		departamento = Leer.pedirCadena("Introduce el departamento del jefe");
		empleados[indiceVector]=new Responsable(nombre,fechaNac,fechaIng,bono,departamento);	
	}

	public static void pedirAdministrativo(Empleado [] empleados, int indiceVector) {
		String nombre, nombreJefe, departamento, especialidad;
		Fecha fechaNac,fechaIng;
		Integer dia,mes,año;
		Responsable jefe;
		nombre=Leer.pedirCadena("Introduzca el nombre del administrativo");
		fechaNac=pedirFechaNac();
		fechaIng=pedirFechaIng();
		departamento = Leer.pedirCadena("Introduce el departamento del administrativo");

		/*do{
			nombreJefe = Leer.pedirCadena("Introduce el nombre del responsable de este administrativo");
		}while(buscarResponsable(empleados, nombreJefe) == -1);//O lo hacemos con un do while o salimos del metodo sin crearlo
		//cuando nos den uun nombre incorrecto.
		 */
		nombreJefe=Leer.pedirCadena("Introduce el nombre del responsable de este administrativo");
		if(buscarResponsable(empleados, nombreJefe) == -1) {
			System.out.println("No se ha encontrado el jefe, no se creara el administrativo");
		}else {
			String respuesta;
			respuesta = Leer.pedirCadena("Los datos introducidos son correctos: (s/n)" + nombre + " " + fechaNac + " "  
					+ fechaIng + " " + departamento + " " + nombreJefe
					);
			if (respuesta.equalsIgnoreCase("s")) {
				empleados[indiceVector]=new Administrativo(nombre, fechaNac, fechaIng, departamento, (Responsable)empleados[buscarResponsable(empleados, nombreJefe)]);
				Responsable aux;
				int numero;

				aux = (Responsable)empleados[buscarResponsable(empleados, nombreJefe)];
				numero = aux.getPersonasACargo();
				numero++;
				aux.setPersonasACargo(numero);
			}else {
				System.out.println("No se creara al administrativo");
			}
		}
	}

	public static void pedirTecnico(Empleado [] empleados, int indiceVector) {

		String nombre, nombreJefe, especialidad;
		Fecha fechaNac,fechaIng;
		Integer dia,mes,año;
		Responsable jefe;
		nombre=Leer.pedirCadena("Introduzca el nombre del tecnico");
		fechaNac=pedirFechaNac();
		fechaIng=pedirFechaIng();
		especialidad = Leer.pedirCadena("Introduce la especialidad del tecnico");

		/*do{
			nombreJefe = Leer.pedirCadena("Introduce el nombre del responsable de este administrativo");
		}while(buscarResponsable(empleados, nombreJefe) == -1);//O lo hacemos con un do while o salimos del metodo sin crearlo
		//cuando nos den uun nombre incorrecto.
		 */

		nombreJefe = Leer.pedirCadena("Introduce el nombre del responsable de este tecnico");
		if(buscarResponsable(empleados, nombreJefe) == -1) {
			System.out.println("No se ha encontrado el jefe, no se creara el tecnico");
		}else {
			String respuesta;
			respuesta = Leer.pedirCadena("Los datos introducidos son correctos: (s/n)" + nombre + " " + fechaNac + " "  
					+ fechaIng + " " + especialidad + " " + nombreJefe
					);
			if (respuesta.equalsIgnoreCase("s")) {
				empleados[indiceVector]=new Tecnico(nombre, fechaNac, fechaIng, especialidad, (Responsable)empleados[buscarResponsable(empleados, nombreJefe)]);	

				Responsable aux;
				int numero;

				aux = (Responsable)empleados[buscarResponsable(empleados, nombreJefe)];
				numero = aux.getPersonasACargo();
				numero++;
				aux.setPersonasACargo(numero);
			}else {
				System.out.println("No se creara al tecnico");
			}

		}


	}

	public static Integer buscarResponsable(Empleado [] empleados, String nombre) {
		Responsable jefe;
		Integer i;
		boolean encontrado=false;

		for(i=0; i < empleados.length && empleados[i] != null && encontrado == false; i++) {
			/*if(empleados[i] instanceof Responsable) {
				Empleado aux = (Responsable)empleados[i];//POLIMORFISMO
				if(nombre.equals(aux.getNombre())) {
					encontrado = true;
				}
			}//if instance of*/
			if(empleados[i] instanceof Responsable) {
				if (nombre.equals(empleados[i].getNombre())) {
					encontrado = true;
				}
			}
		}//for

		if(encontrado) {
			i--;
			return i; 
		}else {
			i = -1;
			return i;
		}
	}

	public static String menu() {
		return "1. Crear Responsable.\n"
				+ "2. Crear Administrativo\n"
				+ "3. Crear Tecnico\n"
				+ "4. Listar toda la plantilla\n"
				+ "5. Calcular la nomina de la plantilla\n"
				+ "6. Cambiar el salario base de los empleados\n"
				+ "7. Cambiar el plus de responsabilidad de los jefes\n"
				+ "8. Cambiar el plus de antiguedad de los administrativos\n"
				+ "9. Cambiar el plus de especialidad de los tecnicos\n"
				+ "0. Salir";
	}

	public static Fecha pedirFechaNac(){

		Fecha fechaNac;
		Integer dia,mes,año;
		dia=Leer.pedirEntero("Introduce el dia de nacimiento");
		mes = Leer.pedirEntero("Introduce el mes de nacimiento");
		año = Leer.pedirEntero("Introduce el año de nacimiento");
		fechaNac = new Fecha (dia, mes, año);

		return fechaNac;

	}

	public static Fecha pedirFechaIng(){

		Fecha fechaIng;
		Integer dia, mes, año;
		dia=Leer.pedirEntero("Introduce el dia de ingreso");
		mes = Leer.pedirEntero("Introduce el mes de ingreso");
		año = Leer.pedirEntero("Introduce el año de ingreso");
		fechaIng = new Fecha (dia, mes, año);

		return fechaIng;

	}


}
