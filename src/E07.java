import java.util.Scanner;
public class E07 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int feijao=0;
		int tentativas=0;
		
		System.out.println("Para no castelo da princesa dormir\nOs feij�es voce precisa descobrir");
		
		while(feijao!=1238 && tentativas <5) {
			
			//Pedir para o usu�rio digitar novamente
			System.out.println("Quantos feij�es existem no pote?");
			feijao = leitor.nextInt();
			
			tentativas = tentativas + 1;
			}
			
		if (feijao==1238) {
			System.out.println("Parab�ns! Voc� ganhou uma noite no castelo da princesa Javarella!");
			System.out.println("Voc� precisou de " + tentativas + " tentativas para acertar!");
			}else {
			System.out.println("N�o foi dessa vez!");
		}

		leitor.close();
	}

}
