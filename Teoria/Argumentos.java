public class Argumentos{
	public static void main (String [] args){
		long numero = Long.parseLong ( args [0]);
		System.out.println ( "primer argumento " + args [0]); //muestra el primer argumento leido
		System.out.println ( "Valor doble " + numero * 2) ;
	}
}