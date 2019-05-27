package Problemas;

public class Problema1 extends Problema {
	public void setResultado(int i) {
		sumaNumerosNaturales(i);
	}

	private static void sumaNumerosNaturales(int i) {
		int suma = 0;

		for (int a = 1; a < i; a++) {
			if ((a % 3 == 0) || (a % 5 == 0)) {
				suma = suma + a;
			}
		}
		System.out.println("PROBLEMA 001 || La suma es: " + suma);

	}

}
