package Restaurante;

public class restauranteIsrael {
	public int p;
	public int c;

	public restauranteIsrael(int a, int b) {this.p = a;this.c = b;}

	int cantP() {
		int a = this.p * 3;
		return a;
	}

	int cantC() {
		int ch = this.c * 6;
		return ch;
	}

	public void addCalamares(int c) {
		this.c = this.c + c;
	}

	public void addPatatas(int d) {
		this.p = this.p + d;
	}

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
