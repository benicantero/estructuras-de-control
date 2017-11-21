public class Formateo{
	public static void main (String [] args){
		//mostrar el numero 1.22 en un ancho de campo 10 caracteres
		// y con dos decimales
		System.out.printf("%10.2f%n",1.22) ;
		
		//mostrar la cadena "Tota", con un ancho de 10 caracters y alineada a 
		//la izquierda
		System.out.printf("%-10s%d%n","Total:",12);
		
		
		System.out.printf("%8d%8s%8.1f%n", 1234, "Java", 5.6);
		
		System.out.printf("%-8d%-8s%-8.1f%n", 1234, "Java", 5.6);
	}
	
}