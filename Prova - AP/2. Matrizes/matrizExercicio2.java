import java.util.Scanner;

public class matrizExercicio2 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        Scanner leitor = new Scanner(System.in);
        int impares = 0;
        
        // Preenche a matriz com números inteiros fornecidos pelo usuário
        System.out.println("Digite os elementos da matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = leitor.nextInt();
                if (matriz[i][j] % 2 != 0) {
                    impares++;
                }
            }
        }
        
        // Exibe a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Exibe a quantidade de números ímpares e quais são eles
        System.out.println("Quantidade de números ímpares: " + impares);
        System.out.println("Números ímpares:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] % 2 != 0) {
                    System.out.println(matriz[i][j]);
                }
            }
        }
        
        // Fecha o scanner
        leitor.close();
    }
}

