import java.util.Scanner;

public class exercicio1 {

	public static void main (String [] args){
	
		Scanner inTeclado = new Scanner(System.in);
		String nome;
		int ano_nascimento, ano_atual;
		
		System.out.printf("Entre com o seu nome: ");
		nome = inTeclado.nextLine();
		
		System.out.printf("Entre com o ano que nasceu: ");
		ano_nascimento = inTeclado.nextInt();
		
		System.out.printf("Entre com o ano atual: ");
		ano_atual = inTeclado.nextInt();
		
		System.out.printf("%s, possui %d anos.\n", nome, ano_atual - ano_nascimento);
		
	}
}
