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

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divis�o dos carros para cada pessoa deu " + divisao);
		} else {
			System.out.println("N�o quis ver o resultado");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divis�o");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divi�o � " + resto);
		} else {
			System.out.println("N�o quis ver a divis�o");
		}

	}
}
