package Problemas;

public class Problema2 extends Problema {
	public void setResultado(int NFibos) {
		int a = 0, b = 1, fibo, sumaPares = 0;

		while (a < NFibos) {
			fibo = a + b;
			a = b;
			b = fibo;

			if (fibo % 2 == 0) {
				sumaPares += fibo;
			}
		}
		System.out.println("PROBLEMA " + getId()
				+ " || La suma de los primeros 4.000.000 numeros es: "
				+ sumaPares);
	}
}
