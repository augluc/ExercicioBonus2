import java.util.Scanner;
public class E07 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int feijao=0;
		int tentativas=0;
		
		System.out.println("Para no castelo da princesa dormir\nOs feijões voce precisa descobrir");
		
		while(feijao!=1238 && tentativas <5) {
			
			//Pedir para o usuário digitar novamente
			System.out.println("Quantos feijões existem no pote?");
			feijao = leitor.nextInt();
			
			tentativas = tentativas + 1;
			}
			
		if (feijao==1238) {
			System.out.println("Parabéns! Você ganhou uma noite no castelo da princesa Javarella!");
			System.out.println("Você precisou de " + tentativas + " tentativas para acertar!");
			}else {
			System.out.println("Não foi dessa vez!");
		}

		leitor.close();
	}

}
