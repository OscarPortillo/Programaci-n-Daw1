import java.util.TreeMap;

public class Alumno {
	TreeMap<String,String> alu=new TreeMap<String,String>();
	@SuppressWarnings("unused")
	private String usuario;
	private String clave;

	public void crearUsuario(String usuario,String clave){
		this.usuario = usuario;
		this.clave=clave;
		alu=new TreeMap<String,String>();
		if(alu.containsKey(usuario)){
			System.out.println("El usuario ya existe");
		}else{
			alu.put(usuario, clave);
		}//if
	}//crearUsuario
	public boolean existeUsuario(String usuario){
		boolean existe= false;
		if(alu.containsKey(usuario)){
			existe=true;
		}
		return existe;
	}
	public String codificarClave(String claveCod){
		char caracter;
		String claveAux ="";
		for(int i=0;i<claveCod.length();i++){
			caracter=claveCod.charAt(i);
			caracter=(char) (caracter+2);
			claveAux+=""+caracter;
		}
		return claveAux;
	}//codificarClave

	public boolean claveValida(String clave){
		for(int i=0;i<clave.length();i++){
			if(!(clave.charAt(i)>=48 && clave.charAt(i)<=57 ||
					clave.charAt(i)>=65 && clave.charAt(i)<=90 ||
					clave.charAt(i)>=97 && clave.charAt(i)<=122)){				
				return false;				
			}		
		}
		return true;
	}//claveValida
	public void verAlumno(){
		System.out.println(alu.toString());
	}
	public boolean vacio(){
		boolean vacio=false;
		if(alu.isEmpty()){
			vacio=true;
		}
		return vacio;
	}

	public boolean validarClaveBorrar(String usu,String clave){
		boolean correcto=false;
		if(alu.get(usu).contains(codificarClave(clave))){
			alu.remove(usu);
			correcto=true;
		}
		return correcto;
	}
	public boolean validarClavesCorrectas(String usu,String clave){
		boolean correcto=false;
		if(alu.get(usu).contains(codificarClave(clave))){
			correcto=true;
		}
		return correcto;
	}//validarClaveBorrar
	public boolean modificarclave(String usuario,String claveNueva){
		boolean modificar=false;
		if(existeUsuario(usuario)==true){
			if(alu.get(usuario).contains(codificarClave(clave))){
				alu.put(usuario, codificarClave(claveNueva));
			}
		}
		return modificar;
	}//modificarclave
}//class
