import java.util.Scanner;

public class matrizExercicio1 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner leitor = new Scanner(System.in);
        
        // Preenche a matriz com números inteiros fornecidos pelo usuário
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leitor.nextInt();
            }
        }
        
        // Exibe a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Soma os elementos da diagonal principal
        int somaDiagonal = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonal += matriz[i][i];
        }
        
        // Exibe a soma dos elementos da diagonal principal
        System.out.println("Soma dos elementos da diagonal principal: " + somaDiagonal);
        
        // Fecha o scanner
        leitor.close();
    }
}

