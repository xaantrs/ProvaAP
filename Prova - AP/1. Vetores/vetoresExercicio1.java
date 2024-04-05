import java.util.Scanner;

public class vetoresExercicio1 {
    public static void main(String[] args) {
        float notas[] = new float[10];
        Scanner leitor = new Scanner(System.in);
        
        // Lê as 10 notas do usuário
        System.out.println("Digite as 10 notas:");
        for (int i = 0; i <= 9; i++) {
            notas[i] = leitor.nextFloat();
        }
        
        // Imprime as notas das posições 7 e 9 do vetor
        for (int i = 0; i <= 9; i++) {
            if (i == 7 || i == 9) {
                System.out.println("A posição " + i + " do vetor, contém a nota " + notas[i]);
            }
        }
        
        // Fecha o scanner
        leitor.close();
    }
}