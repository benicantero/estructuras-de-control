public class Ejercicio1ApiJava{
	
	public static void main(String [] args){
		
		String cadena = "puede ser una frase";
		
		//METODO contains
		boolean contiene = cadena.contains ("coser");
		System.out.printf("La cadena %s contiene %s?? %b%n", cadena,"coser",contiene);
	
		// METODO endsWith
		boolean terminaen =  cadena.endsWith ("aser");
		System.out.printf("La cadena %s termina en %s?? %b%n", cadena,"aser",terminaen);
	
		//METODO equalsIgnoreCase
		String comparable = "PUEDE SER UNA FRASE";
		boolean mayusculasyminusculas = cadena.equalsIgnoreCase (comparable);
		System.out.printf("La cadena %s en minuscula es igual que la cadena %s?? %b%n", cadena,comparable,mayusculasyminusculas);
	
		//METODO isEmpty
		System.out.printf("La cadena %s esta vacia? %b%n", cadena,cadena.isEmpty()); 
		
		//METODO startsWith
		String comienzo = "pued";
		System.out.printf("La cadena %s comienza por %s ? %b%n",cadena,comienzo,cadena.startsWith ( comienzo ));
		
		//METODO charAt
		int indice = 0;
		char caracter = cadena.charAt (indice);
		System.out.printf("La cadena %s tiene en el indice %d tiene como caracter %c%n",cadena,indice,caracter);
		
		//METODO length
		System.out.printf("La longitud de la cadena \"%s\" es %d %n",cadena,cadena.length());
		
		//METODO replace
		System.out.println("hola mundo".replace (' ','_'));
		
		//METODO toUpperCase
		String cadenaMinuscula = "hello world";
		String cadenaMayuscula = cadenaMinuscula.toUpperCase();
		System.out.printf("Cadena \"%s\" en mayusculas es \"%s\" %n", cadenaMinuscula,cadenaMayuscula);
		
		//METODO toLowerCase
		System.out.printf("Cadena \"%s\" en minusculas es \"%s\" %n",cadenaMayuscula,cadenaMayuscula.toLowerCase());
		
		//METODO substring
		System.out.println("Subcadena de la cadena anterior: " + cadenaMayuscula.substring(6));
	}
}