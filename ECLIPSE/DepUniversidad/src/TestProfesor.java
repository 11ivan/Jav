//package Ejer1;

public class TestProfesor {
	public static void main(String[] args) throws ExcepcionProfesor{
		
		Profesor p1=null;
		
		try {
			p1 = new Profesor("Manuel","Parra", new Fecha2(1,2,1980), "M", "12345678", "Programacion", new Fecha2(6,5,2010));
		} catch (ExcepcionPersona e) {
			System.out.println(e);
		} catch (ExcepcionFecha e) {
			System.out.println(e);
		}
		//Profesor p2=new Profesor("Xio", 65, 'F');
		//Profesor p3=new Profesor("Sole", 75, 'F'); 
		//Profesor p4=new Profesor("Xarli", 29, 'M');
		
		//Profesor p10=new Profesor("Xarli", 29, 'X');
		//Profesor p11=new Profesor("Xarli", 95, 'M');
		
		System.out.println(p1.toString());
	//	System.out.println(p2.toString());
	//	System.out.println(p3.toString());
	//	System.out.println(p4.toString());
		
		System.out.println("Modificamos el profesor 4 (El nombre y la edad)");
		p1.setNombre("Carlos");
		System.out.println(p1.toString());
		
	//	System.out.println("Comparamos profesor 4 con el profesor 1");
	//	System.out.println(p4.compareTo(p1));
		
	//Prueba metodo getAntiwedad
	System.out.println(p1.getAntiwedad());
		
	}
}
