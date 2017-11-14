/**Fichero BuclesConBreak2.java
utilizamos break en los bucles
@author Beni
@version 1.0
*/

public class BuclesConBreak2 {
    public static void main (String[] args) {

        long posibleNumeroPrimo =  84979;
        boolean resultado = false;
 
       
     
        System.out.println("Es numero primo " + posibleNumeroPrimo + "? " + !resultado);

        System.out.println("Es numero primo " + posibleNumeroPrimo + "? " + esNumeroPrimo (posibleNumeroPrimo ) );
    }
	/** metodo que nos devuelve si un numero es primo o no, pasando este por argumento
	@param numero el digito que se comprobara si es primo o no
	@return true o false dependiendo si es o no primo
	*/
    public static boolean esNumeroPrimo (long numero) {
		boolean resultado = false;
		for (long divisor = 2 ; divisor < numero / 2 ; divisor++ ) {
         
			resultado = numero % divisor == 0;
            if ( resultado ) {
                break;
			}
		}
		return !resultado;
	}	
}
