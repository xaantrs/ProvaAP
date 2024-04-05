import java.util.Scanner;

public class Matricula {
    public static final int QUANTIDADE_DE_PESSOAS = 3;

    public static void main(String[] args) {
        int i;
        Pessoa[] pessoas = new Pessoa[QUANTIDADE_DE_PESSOAS];
        Scanner leitor = new Scanner(System.in);

        for (i = 0; i < QUANTIDADE_DE_PESSOAS; i++) {
            System.out.println("Informe os dados da pessoa: " + (i + 1));
            pessoas[i] = new Pessoa();
            pessoas[i].nome = leitor.next();
            pessoas[i].altura = leitor.nextFloat();
            pessoas[i].peso = leitor.nextFloat();
            pessoas[i].cpf = leitor.nextLong();
            pessoas[i].sexo = leitor.next();
        }

        System.out.println("Informe o CPF da pessoa: ");
        long cpfLocalizador = leitor.nextLong();
        System.out.println("\nSexo\tNome\tIMC");

        for (i = 0; i < QUANTIDADE_DE_PESSOAS; i++) {
            if (cpfLocalizador == pessoas[i].cpf) {
                float imc = pessoas[i].peso / (pessoas[i].altura * pessoas[i].altura);
                System.out.println("Peso: " + pessoas[i].peso);
                System.out.println("Nome: " + pessoas[i].nome);
                System.out.println("IMC: " + imc);
                break;
            }
        }

        leitor.close();
    }

    static class Pessoa {
        String nome;
        String sexo; // 'm': masculino, 'f': femino
        float peso;
        float altura;
        long cpf;
    }
}