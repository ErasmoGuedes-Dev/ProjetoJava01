package Iniciante;

import javax.swing.JOptionPane;

public class CaixasDeConfirmacao {
	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");

		double carroNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoasNumero);

		double resto = carroNumero % pessoasNumero;

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão dos carros para cada pessoa deu " + divisao);
		} else {
			System.out.println("Não quis ver o resultado");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divisão");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divião é " + resto);
		} else {
			System.out.println("Não quis ver a divisão");
		}

	}
}
