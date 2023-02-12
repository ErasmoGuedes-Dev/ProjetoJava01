package Iniciante;

import javax.swing.JOptionPane;

public class EntradaDeDados {
	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoasNumero);
		double resto = carroNumero % pessoasNumero;
		
		JOptionPane.showMessageDialog(null, "Divisão de pessoas deu " + divisao + " carros e sobrou " + resto + carros);
		
		
	}
}
