import java.util.Scanner;

public class matrizExercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        // Solicita ao usuário o tamanho da matriz quadrada
        System.out.println("Digite o tamanho da matriz quadrada:");
        int tamanho = leitor.nextInt();
        
        // Cria a matriz quadrada de acordo com o tamanho informado
        int[][] matriz = new int[tamanho][tamanho];
        
        // Preenche a matriz com valores inteiros fornecidos pelo usuário
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = leitor.nextInt();
            }
        }
        
        // Exibe a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Calcula e exibe a soma dos valores da matriz
        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                soma += matriz[i][j];
            }
        }
        System.out.println("Soma dos valores da matriz: " + soma);
        
        // Fecha o scanner
        leitor.close();
    }
}
