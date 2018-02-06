
public class Principal {

	public static void main(String[] args) {
		Empleado emple[];//declaro la referencia 
		Jefe jefe[];//declaro la referencia 
		int numEmple,numJefe;
		String nombre,apellido,titulo,departJefe;
		double sueldo;
		int añosExperiencia;
		
		numEmple=Leer.pedirEntero("Cuantos Empleados quiere crear?");
		numJefe=Leer.pedirEntero("Cuantos Jefes quiere crear");
		emple=new Empleado[numEmple];//inicializo el vector con tantos empleados quiera el usuario
		jefe=new Jefe[numJefe];//inicializo el vector con tantos jefes quiera el usuario
		for(int i=0;i<emple.length;i++){//repetira tantas veces como empleados quiera crear
			Leer.mostrarEnPantalla("INTRODUCE LOS DATOS DEL EMPLEADO "+(i+1)+"\n");
			nombre=Leer.pedirCadena("Introduzca el nombre del empleado");
			apellido=Leer.pedirCadena("Introduzca el apellido del empleado");
			sueldo=Leer.pedirDouble("Introduce el sueldo del empleado");
			emple[i]=new Empleado(nombre,apellido,sueldo);//introduzco la informacion del empleado con posicion i
		}
		for(int i=0;i<jefe.length;i++){//repetira tantas veces como jefes quiera crear
			Leer.mostrarEnPantalla("INTRODUCE LOS DATOS DEL JEFE "+(i+1)+"\n");
			nombre=Leer.pedirCadena("Introduzca el nombre del jefe");
			apellido=Leer.pedirCadena("Introduzca el apellido del jefe");
			sueldo=Leer.pedirDouble("Introduce el sueldo del jefe");
			titulo=Leer.pedirCadena("Introduzca el titulo que tiene el jefe");
			departJefe=Leer.pedirCadena("Introduzca el nombre del departamento dond ee sjefe");
			añosExperiencia=Leer.pedirEntero("Introduzca cuantos años de experiencia tiene el jefe");
			jefe[i]=  new Jefe(nombre,apellido,sueldo,titulo,departJefe,añosExperiencia);//introduzco la informacion del jefe con posicion i
		}
		for(int k=0;k<emple.length;k++){
			System.out.println("Informacion del empleado "+(k+1));
			emple[k].verInfoEmple();
		}
		for(int k=0;k<jefe.length;k++){
			System.out.println("Informacion del jefe "+(k+1));
			jefe[k].verInfoJefe();
		}
	}//main

}//class