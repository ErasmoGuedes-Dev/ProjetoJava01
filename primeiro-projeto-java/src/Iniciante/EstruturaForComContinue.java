package Iniciante;

public class EstruturaForComContinue {
	public static void main(String[] args) {

		/* Estrutura de repetição com for e Continue */
	
	for (int numero = 0; numero <= 10; numero++) {
			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("Oba, encontrei o número " + numero);
				continue;

			}

		}
	}
}
