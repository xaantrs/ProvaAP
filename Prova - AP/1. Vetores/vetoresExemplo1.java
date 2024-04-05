import java.util.Scanner;

public class vetoresExemplo1 {
    public static void main(String[] args) {
        double[] nota = new double[5];
        double soma = 0.0, media;
        int i;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite os valores das cinco notas:");
        for (i = 0; i < 5; i++) {
            nota[i] = leitor.nextDouble();
            soma = soma + nota[i];
        }
        
        media = soma / 5;
        System.out.println("Média das notas: " + media);
    }
}

/**
 * Exemplo 1:
 * Programa que lê e calcula a média de 5 notas de um aluno
 */
