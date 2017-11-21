public class ContarVocales{
	
	public static void main (String [] args){
	
	String palabra = args[0].toLowerCase();
	int contador = 0;
	for ( int i=0; i < palabra.length(); i++){
		if (palabra.charAt(i) =='a'  || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt (i) == 'u'){
			contador++;
		}
	}
	System.out.printf("La cadena \"%s\" tiene %d vocales",palabra,contador);
}
}