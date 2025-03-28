import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
                
        Scanner inTeclado = new Scanner(System.in);

        System.out.printf("Entre com a quantidade de alunos: ");
        int qtd_alunos = inTeclado.nextInt();

        System.out.printf("Entre com a nota dos alunos separadas por espaços: ");
        int[] notas = new int[11]; //notas de 0 a 10

        for(int i = 0; i < qtd_alunos; i++){
            byte nota_aluno = inTeclado.nextByte();
            notas[nota_aluno]++;
        }

        // Agora que já obtemos as N notas, vamos contar as notas de cada faixa
        // e imprimi-las por partes, conforme a saída esperada do enunciado

        // Em cada parte, eu calculei a quantidade de notas de cada faixa, realizei a soma
        // e atribui para a variável "imprimi_asterisco", a qual cada bloco inicia com ZERO

        // Faixa (0 - 2)
        byte imprimi_asterisco = 0; 
        for(int i = 0; i <= 2; i++)
            imprimi_asterisco += notas[i];

        // Vai imprimir os X asteriscos de cada faixa de notas
        System.out.printf("0 - 2    | ");
        for(int i = 0; i < imprimi_asterisco; i++)
            System.out.printf("*");
        
        // Faixa (3 - 5)
        imprimi_asterisco = 0;
        for(int i = 3; i <= 5; i++)
            imprimi_asterisco += notas[i];

        System.out.printf("\n3 - 5    | ");
        for(int i = 0; i < imprimi_asterisco; i++)
            System.out.printf("*");

        // Faixa (6 - 8)
        imprimi_asterisco = 0;
        for(int i = 6; i <= 8; i++)
            imprimi_asterisco += notas[i];

        System.out.printf("\n6 - 8    | ");
        for(int i = 0; i < imprimi_asterisco; i++)
            System.out.printf("*");

        // Faixa (9 - 10)
        imprimi_asterisco = 0;
        for(int i = 9; i <= 10; i++)
            imprimi_asterisco += notas[i];

        System.out.printf("\n9 - 10   | ");
        for(int i = 0; i < imprimi_asterisco; i++)
            System.out.printf("*");

        System.out.println(""); //quebra de linha
    }

}
