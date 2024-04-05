import java.util.Scanner;

public class vetoresExemplo4 {
    public static void main(String[] args) {
        int valor[] = {0, 0, 0, 0, 0};
        Scanner leitor = new Scanner(System.in);
        
        // Lê os 5 valores inteiros do usuário
        System.out.println("Digite os 5 valores inteiros:");
        for (int i = 0; i < 5; i++) {
            valor[i] = leitor.nextInt();
        }
        
        // Exibe os valores em ordem crescente pelo índice
        System.out.println("Valores em ordem crescente pelo índice:");
        for (int i = 0; i < 5; i++) {
            System.out.println("A posição " + i + " do vetor, contém o valor " + valor[i]);
        }
        
        // Exibe os valores em ordem decrescente pelo índice
        System.out.println("Valores em ordem decrescente pelo índice:");
        for (int i = 4; i >= 0; i--) {
            System.out.println("A posição " + i + " do vetor, contém o valor " + valor[i]);
        }
        
        // Fecha o scanner
        leitor.close();
    }
}

/**
 * Exemplo 4:
 * Este programa considera um vetor que pode armazenar 5 valores inteiros e realiza as seguintes operações:
 * - Cria o vetor.
 * - Solicita ao usuário que digite os valores.
 * - Armazena os valores no vetor.
 * - Exibe os valores armazenados no vetor, mostrando os valores em ordem crescente pelo índice.
 * - Exibe os valores armazenados no vetor, mostrando os valores em ordem decrescente pelo índice.
 */
