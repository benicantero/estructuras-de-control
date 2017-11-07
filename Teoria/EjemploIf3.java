public class ejemploIfElse{
	public static void main(String [] args){ 
		int numero = (int) (Math.random() * 4);    // De la libreria Math de java la funcion random
		if ( numero == 0 ){
			System.out.println ( numero + " es el cero");
		} else if ( numero == 1 ) {
			System.out.println ( numero + " es el uno");
		} else if ( numero == 2 ) {
			System.out.println ( numero + " es el dos");
		} else {
			System.out.println ( numero + " es el tres");
	}
}
}