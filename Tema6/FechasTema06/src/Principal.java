import java.util.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar fecha=new GregorianCalendar();
		int mes;
		 mes=fecha.get(Calendar.MONTH)+1;
		System.out.println(mes);
		System.out.println(Fecha.esBisiesto());
		System.out.println(Fecha.esCorrecta());
	}

}
