import java.util.Scanner;

public class E08 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double mediaAluno=0, mediaTotal;
		int totalAlunos, nAluno=0, acima=0, abaixo=0;
		
		System.out.println("Qual � o n�mero total de alunos?");
		totalAlunos = leitor.nextInt();
		
		System.out.println("Qual a m�dia da turma?");
		mediaTotal = leitor.nextDouble();
		
		while (nAluno < totalAlunos) {
			System.out.println("Qual a nota do " + (nAluno +1) + "� aluno?");
			mediaAluno = leitor.nextDouble();
			nAluno = nAluno + 1;
			
			if(mediaAluno>=mediaTotal) {
				acima = acima +1;
			}else {
				abaixo=abaixo+1;
			}
			}
		
		System.out.println("Voce teve " + acima + " alunos acima da m�dia e " + abaixo + " abaixo da m�dia.");
		
		
		
		
		
		
		
		
		
		leitor.close();

	}

}
