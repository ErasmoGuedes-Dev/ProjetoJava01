package Iniciante;

import javax.swing.JOptionPane;

public class CalculoDeMedia {
	public static void main(String[] args) {

		String nota1 = JOptionPane.showInputDialog("Informe a nota 1");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4");

		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota3);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);

		double media = media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;

		/* A m�dia para aprova��o � 70 */

		if (media >= 70) {
			JOptionPane.showMessageDialog(null, "Aluno est� APROVADO com a m�dia de : " + media);
		} else if (media >= 51) {
			JOptionPane.showMessageDialog(null, "O aluno est� de RECUPERA��O com a m�dia de: " + media);
		} else {
			JOptionPane.showMessageDialog(null, "REPROVADO, sua m�dia � " + media);
		}
	}
}
