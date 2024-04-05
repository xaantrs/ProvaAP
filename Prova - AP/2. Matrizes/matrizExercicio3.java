import java.util.Scanner;

public class matrizExercicio3 {
    public static void main(String[] args) {
        float[][] notas = new float[5][4];
        Scanner leitor = new Scanner(System.in);
        int aprovados = 0, reprovados = 0;
        
        // Preenche a matriz com notas reais fornecidas pelo usuário
        System.out.println("Digite as notas dos alunos (5x4):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                notas[i][j] = leitor.nextFloat();
                if (notas[i][j] >= 7) {
                    aprovados++;
                } else {
                    reprovados++;
                }
            }
        }
        
        // Exibe a matriz
        System.out.println("Matriz de notas:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(notas[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Exibe a quantidade de alunos aprovados e reprovados
        System.out.println("Alunos aprovados: " + aprovados);
        System.out.println("Alunos reprovados: " + reprovados);
        
        // Fecha o scanner
        leitor.close();
    }
}
