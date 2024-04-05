public class matrizExercicio5 {
    public static void main(String[] args) {
        int[][] matriz = {
            {12, 55, 6, 34, 77},
            {98, 66, 43, 32, 7},
            {21, 45, 53, 20, 11}
        };
        int menorValor = matriz[0][0];
        int linhaMenor = 0, colunaMenor = 0;
        
        // Encontra o menor valor na matriz e sua posição
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] < menorValor) {
                    menorValor = matriz[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                }
            }
        }
        
        // Exibe a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Exibe o menor valor e sua posição na matriz
        System.out.println("Menor valor da matriz: " + menorValor);
        System.out.println("Posição (linha, coluna): (" + linhaMenor + ", " + colunaMenor + ")");
    }
}