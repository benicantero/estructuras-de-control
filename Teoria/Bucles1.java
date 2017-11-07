public class Bucles1{
	public static void main (String [] args){
		int numero = 10;
		int suma = 0;
		int contador = 1;
		
		while (contador <= numero ){
			System.out.println ("Suma vale: " + suma + ", contador vale: " + contador);
			suma += contador;
			contador++;
		}
		if (numero >= 0){
		System.out.println ("la suma de los " + numero + " primeros numeros vale " + suma);
		} else {
			System.out.println ("No sumo numeros negativos");
		}
	}
}