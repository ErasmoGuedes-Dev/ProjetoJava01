package Iniciante;

public class ComandoSwitchCase {
	public static void main(String[] args) {

		/* SWITCH CASE: OPRACAÇÕES EXATAS */

		int dia = 2;

		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		default:
			System.out.println("Qualquer dia");
			break;
			
		}
	}
}