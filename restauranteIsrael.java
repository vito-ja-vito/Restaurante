package Restaurante;



/**
 * La clase restaurante Israel gestiona el stock de comida y numero de comensales a los que puede servir.
 * @author daw1xx
 *@version 1.0
 */
public class restauranteIsrael {
	/**
	 * Representa el numero de patatas que hay en el stock
	 */
	public int p;
	/**
	 * Representa el numero de calamares que hay en el stock
	 */
	public int c;
/**
 * Constructor de la clase documetnacionRestaurante para la gestoin del restaurante
 * @param a Indica el numer o de patatas que hay en stock
 * @param b Indica el numero de calamares que hay en stock
 */
	public restauranteIsrael(int a, int b) {
		this.p = a;
		this.c = b;
	}
//metodo por el que se calcula el numero de comensales. Por cada patata salen 3 raciones

	int cantP() {
		int a = this.p * 3;
		return a;
	}
	
//metodo por el que se calcula el numero de comensales. Por cada calamar salen 3 raciones
	int cantC() {
		int ch = this.c * 6;
		return ch;
	}
/**
 * Metodo por el cual se añade una cantidad de calamares al stock del restaurante
 * @param c Cantidad de calamares a añadir al stock
 */
	public void addCalamares(int c) {
		this.c = this.c + c;
	}
/**
  * Metodo por el cual se añade una cantidad de patatas al stock del restaurante
 * @param d  Cantidad de patatas a añadir al stock
 */
	public void addPatatas(int d) {
		this.p = this.p + d;
	}
/**
 * 
 * @hidden
 */
	public static void main(String[] args) {
		restauranteIsrael r1 = new restauranteIsrael(50, 60);
		System.out.println("Cantidad de calamares: " + r1.c);
		System.out.println("Cantidad de patatas: " + r1.p);
		if (r1.cantP() <= r1.cantC()) {
			System.out.println(
					"\nIsrael puede dar de comer a " + r1.cantP() + " personas con raciones de patatas máximo");
		} else {
			System.out.println(
					"\nIsrael puede dar de comer a " + r1.cantC() + " personas con raciones de calamares máximo");
		}
		r1.addCalamares(1);
		r1.addPatatas(80);
		System.out.println("\nPedido Recibido!! Stock actual: ");
		System.out.println(r1.p + " patatas.\n" + r1.c + " calamares");
		if (r1.cantP() <= r1.cantC()) {
			System.out.println(
					"\nIsrael puede dar de comer a " + r1.cantP() + " personas con raciones de patatas máximo");
		} else {
			System.out.println(
					"\nIsrael puede dar de comer a " + r1.cantC() + " personas con raciones de calamares máximo");
		}
	}
}
