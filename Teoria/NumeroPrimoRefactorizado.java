public class NumeroPrimoRefactorizado{
	public static void main (String [] args){
		
		long posibleNumeroPrimo = 11;
		
		long valorEnteroRaizCuadrada = calcularEnteroRaizCuadrada (posibleNumeroPrimo);
		
		boolean segundaVerificacion = valorEnteroRaizCuadrada * valorEnteroRaizCuadrada == posibleNumeroPrimo;
		
		System.out.println ( posibleNumeroPrimo  + " es primo? " + !(verificarDivisibilidad2o3o5(posibleNumeroPrimo)	|| segundaVerificacion || verificarDivisibilidadPrimos (valorEnteroRaizCuadrada) ));
	}	
		public static boolean verificarDivisibilidad2o3o5 ( long numero ){
		return (numero % 2 == 0) || (numero % 3 == 0) || (numero % 5 == 0);
	}
	public static int calcularEnteroRaizCuadrada (long numero){
		return (int) Math.sqrt (numero);
	}
	public static boolean verificarDivisibilidadPrimos ( long numero ){
		boolean resultado = false;
		for ( long divisor = 7; divisor <= numero / 2 ; divisor ++){
			resultado = numero % divisor == 0;	
			if (resultado )
				break;
		} 
		return resultado;
	}
}