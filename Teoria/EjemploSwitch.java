public class EjemploSwitch{
	public static void main (String [] args){
		char diaDeLaSemana = 'j';
		switch (diaDeLaSemana){
			case 'l':
				System.out.println ("Hoy es Lunes");
				break;
			case 'm':
				System.out.println ("Hoy es Martes");
				break;
			case 'x':
				System.out.println ("Hoy es Miercoles");
				break;
			case 'j':
				System.out.println ("Hoy es Jueves");
				break;
			case 'v':
				System.out.println ("Hoy es Viernes");
				break;
			case 's':
				System.out.println ("Hoy es Sabado");
				break;
			case 'd':
				System.out.println ("Hoy es Domingo");
				break;
			default :
				System.out.println ("No corresponde esa letra " + diaDeLaSemana);
		}
	}
	
}