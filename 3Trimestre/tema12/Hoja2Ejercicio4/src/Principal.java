
public class Principal {

	public static void main(String[] args) {
		Alumno alu=new Alumno();
		int opc;
		String usuario,clave;
		do{
			menu();
			opc=Leer.pedirEntero("Elija una opción");
			switch(opc){
			case 1:
				String claveAux;
				usuario=Leer.pedirCadena("Introduce el nombre de usuario");				
				if(alu.existeUsuario(usuario)==true){
					System.out.println("El usuario ya existe");
				}else{
					clave=Leer.pedirCadena("Introduce la clave");
					if(alu.claveValida(clave)!=true){
						System.out.println("Clave incorrecta");
					}else{
						claveAux=alu.codificarClave(clave);
						alu.crearUsuario(usuario,claveAux);
					}
					alu.verAlumno();
				}
				break;//case 2

			case 2:
				String borrar,contraseña;
				if(alu.vacio()==false){
					borrar=Leer.pedirCadena("Que usuario quiere borrar");
					if(alu.existeUsuario(borrar)==true){
						contraseña=Leer.pedirCadena("Introduzca la contraseña de "+borrar);
						if(alu.validarClaveBorrar(borrar, contraseña)==true){
							System.out.println("Usuario borrado correctamente");
						}else{
							System.out.println("La contraseña es incorrecta");
						}
					}else{
						System.out.println("El usuario no existe");
					}
				}else{
					System.out.println("No hay usuarios");
				}
				break;//case 2

			case 3:
				String modificarUsuario,claveVieja,claveNueva;
				if(alu.vacio()==false){
					modificarUsuario=Leer.pedirCadena("Que usuario desea modificar?");
					if(alu.existeUsuario(modificarUsuario)==true){
						claveVieja=Leer.pedirCadena("Introduce la actual contraseña");
						if(alu.validarClavesCorrectas(modificarUsuario, claveVieja)==true){
							claveNueva=Leer.pedirCadena("Introduzca la nueva contraseña");
							alu.modificarclave(modificarUsuario, claveNueva);
							System.out.println("Contraseña modificada correctamente");
						}else{
							System.out.println("La contraseña actual es incorrecta");
						}
					}else{
						System.out.println("El usuario no existe");
					}
				}else{
					System.out.println("No hay usuarios");
				}
				break;//case 3
			case 4:
				String validarUsuario,validarContraseña;
				if(alu.vacio()==false){
					validarUsuario=Leer.pedirCadena("Que usuario desea validar?");

					if(alu.existeUsuario(validarUsuario)==true){
						validarContraseña=Leer.pedirCadena("Introduce la contraseña");
						if(alu.validarClavesCorrectas(validarUsuario, validarContraseña)==true){
							
							System.out.println("usuario "+validarUsuario+" validado la contraseña es correcta");
						}else{
							System.out.println("La contraseña es incorrecta");
						}
					}else{
						System.out.println("El usuario no existe");
					}
				}else{
					System.out.println("No hay usuarios");
				}
				break;//case 4
			}
		}while(opc!=0);
	}//main

	public static void menu(){
		System.out.println("1 - Insertar usuario, clave");
		System.out.println("2 - Borrar usuarios");
		System.out.println("3 - Modificar claves de un usuario");
		System.out.println("4 - Validar a un usuario si su clave es correcta");
		System.out.println("0 - Salir");
	}
}//class