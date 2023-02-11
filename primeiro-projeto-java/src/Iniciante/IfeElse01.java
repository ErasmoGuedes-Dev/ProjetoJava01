package Iniciante;

public class IfeElse01 {
	public static void main(String[] args) {

		int mediaAluno = 70;
		String nome = "Erasmo";

		if (mediaAluno >= 70 && nome.equals("Erasmo")) {
			System.out.println("Parabéns você está aprovado");
		} else if (mediaAluno < 70) {
			System.out.println("Você está reprovado");
		} else {
			System.out.println("Aluno não encontrado");

		}
	}
}
