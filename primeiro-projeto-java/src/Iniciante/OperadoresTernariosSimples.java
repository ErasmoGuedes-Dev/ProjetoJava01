package Iniciante;

public class OperadoresTernariosSimples {
	public static void main(String[] args) {
		
			int nota1 = 70;
			int nota2 = 10;
			int nota3 = 10;
			int nota4 = 10;
			int media = 0;
				
			media = (nota1 + nota2 + nota3 + nota4) / 4;
			
			String saidaResultado = media >= 70 ? "Aluno aprovado" : 
			(media >= 40 && media <= 69) ? "Aluno está de recuperaçao" : 
			"Aluno reprovado";
			
			System.out.println(saidaResultado);

	}
}

