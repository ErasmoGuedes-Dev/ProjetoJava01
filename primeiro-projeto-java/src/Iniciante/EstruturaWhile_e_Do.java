package Iniciante;

public class EstruturaWhile_e_Do {
	public static void main(String[] args) {

		/* while - Verifica e depois executa */

		int numero = 0;

		while (numero <= 20) {
			System.out.println("O número atual é: " + numero);
			numero++;
		}

		/* do - Primeiro executa e depois verifica */

		int numero2 = 0;
		

		do {
			System.out.println("O número atual é: " + numero2);
			numero2++;
		} while (numero2 <= 30);
	}
}
