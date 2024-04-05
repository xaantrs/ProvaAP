import java.util.Scanner;

public class vetoresExercicio2 {
    public static void main(String[] args) {
        float notas[] = new float[10];
        int acumAp = 0, acumRep = 0;
        Scanner leitor = new Scanner(System.in);
        
        // Lê as 10 notas do usuário e conta quantas estão aprovadas e reprovadas
        System.out.println("Digite as 10 notas:");
        for (int i = 0; i <= 9; i++) {
            notas[i] = leitor.nextFloat();
            if (notas[i] >= 7) {
                acumAp++;
            } else {
                acumRep++;
            }
        }
        
        // Exibe as notas e a quantidade de alunos aprovados e reprovados
        for (int i = 0; i <= 9; i++) {
            System.out.println("A posição " + i + " do vetor, contém a nota " + notas[i]);
        }
        System.out.println(acumAp + " estudantes foram aprovados!");
        System.out.println(acumRep + " estudantes foram reprovados!");
        
        // Fecha o scanner
        leitor.close();
    }
}


