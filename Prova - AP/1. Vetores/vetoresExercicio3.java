import java.util.Scanner;

public class vetoresExercicio3 {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        int novosNumeros[] = new int[10];
        Scanner leitor = new Scanner(System.in);
        
        // Lê os 10 números inteiros do usuário e realiza operações com eles
        System.out.println("Digite os 10 números inteiros:");
        for (int i = 0; i <= 9; i++) {
            numeros[i] = leitor.nextInt();
            if (numeros[i] % 2 == 0) {
                novosNumeros[i] = numeros[i] * 10;
            } else {
                novosNumeros[i] = numeros[i] + 5;
            }
        }
        
        // Exibe o conteúdo do vetor de novos números
        for (int i = 0; i <= 9; i++) {
            System.out.println("A posição " + i + " do vetor, contém o número: " + novosNumeros[i]);
        }
        
        // Fecha o scanner
        leitor.close();
    }
}
