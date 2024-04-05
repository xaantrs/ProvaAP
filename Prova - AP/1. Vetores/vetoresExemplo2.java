import java.util.Scanner;

public class vetoresExemplo2 {
    public static void main(String[] args) {
        final int TAM = 5; // Definindo o tamanho da quantidade de notas
        double[] nota = new double[TAM];
        double soma = 0.0, media;
        int i;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite os valores das cinco notas:");
        for (i = 0; i < TAM; i++) {
            nota[i] = leitor.nextDouble();
            soma += nota[i]; // Adicionando a nota à soma
        }
        
        System.out.println("Notas digitadas:");
        for (i = 0; i < TAM; i++) {
            System.out.println(nota[i]);
        }
        
        media = soma / TAM; // Calculando a média
        System.out.println("Média das notas: " + media);
    }
}

/**
 * Exemplo 2:
 * Este programa lê 5 notas de alunos, mostra as 5 notas,
 * calcula e mostra a média.
 */
