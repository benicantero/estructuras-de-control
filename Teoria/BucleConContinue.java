public class BucleConContinue{
	
	public static void main (String [] args ){
		
		for (int i = 0; i < 20; i++){
			System.out.println ("El valor de i es: " + i );
			if ( i % 2 != 0){
				continue; // salta todas las lineas de abajo y continua el bucle
			}
			System.out.println ("Numero Par");
		}
	}
}