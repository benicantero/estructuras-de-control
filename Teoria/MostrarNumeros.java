



public class MostrarNumeros{
	
	public static void main (String [] args){
		mostrarNumeros ( 20 );
		mostrarRangoNumeros ( 3 , 7);
		mostrarNumeros2 ( 5 , 50 , 'P' );
	}	
	public static void mostrarNumeros( int numero){
		int contador = 0;
		while (contador <= numero){
			System.out.println(contador);
			contador++;
			}
	}
	public static void mostrarRangoNumeros ( int numero1, int numero2){
		int contador = numero1;
		if (numero1 > numero2)
			System.out.println ( "No podemos mostrar rango de numeros porque el primer numero introducido es mayor que el segundo");
		else {
			System.out.println ();
			System.out.println ("RANGO DE NUMEROS");
			while (contador <= numero2){
				System.out.println (contador);
				contador++;
			}
		}
 	}
	public static void mostrarNumeros2 ( int numero1, int numero2, char letra){
		if (numero1 > numero2)
			System.out.println (  "No podemos mostrar rango de numeros porque el primer numero introducido es mayor que el segundo");
		else{
			if ((letra == 'p') || (letra == 'P')) {
				if (numero1 % 2 == 0){
					int contador = numero1;
					System.out.println ();
					System.out.println( " Los numeros pares entre " + numero1 + " y " + numero2 + " son: ");
					while (contador <= numero2){
						System.out.println (contador);
						contador=contador + 2;
					}		
				}else {
					int contador = ( numero1 + 1);
					System.out.println ();
					System.out.println( " Los numeros pares entre " + numero1 + " y " + numero2 + " son: ");
					while (contador <= numero2){
						System.out.println (contador);
						contador=contador + 2;
					}								
				}
			} else {
				if ((letra == 'i') || (letra == 'I')) {
				if (numero1 % 2 == 0){
					int contador = (numero1 + 1);
					System.out.println ();
					System.out.println( " Los numeros impares entre " + numero1 + " y " + numero2 + " son: ");
					while (contador <= numero2){
						System.out.println (contador);
						contador=contador + 2;
					}		
				}else {
					int contador = numero1;
					System.out.println ();
					System.out.println( " Los numeros impares entre " + numero1 + " y " + numero2 + " son: ");
					while (contador <= numero2){
						System.out.println (contador);
						contador=contador + 2;
						}								
					}
				}
			}		
		}
	}
}
