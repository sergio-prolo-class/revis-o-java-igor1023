import java.util.Scanner;
import java.lang.Math;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner inEntrada = new Scanner(System.in);
		float proj1, proj2;
		float participacao;
		
		System.out.printf("Entre com a nota do projeto 1: ");
		proj1 = inEntrada.nextFloat();
		
		System.out.printf("Entre com a nota do projeto 2: ");
		proj2 = inEntrada.nextFloat();
		
		System.out.printf("Entre com a participacao: ");
		participacao = inEntrada.nextFloat();
		
		float somatorio_proj = (float) ((proj1 * 2.0) + (proj2 * 3.0));
				
		float cf = (float) Math.round((((somatorio_proj / 5.0) * 0.9) + (participacao * 0.1)));
		
		String aprovado = cf >= 6.0 ? "APROVADO" : "REPROVADO";
		System.out.println(cf + ": " + aprovado);
	}

}
