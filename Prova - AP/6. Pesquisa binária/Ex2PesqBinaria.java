import java.util.Scanner;

public class Ex2PesqBinaria {
    static final int TAMANHO = 5;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int vet[] = new int[TAMANHO];
        int opcao, pos, procura;

        // Lê o vetor
        LeVetor(vet);

        // Ordena o vetor
        OrdenaVetor(vet);

        do {
            opcao = MontaMenu();
            System.out.println("");

            // Monta o menu com as opções
            if (opcao == 1) { // imprime vetor
                ImprimeVetor(vet);
            } else if (opcao == 2) { // busca binária
                System.out.println("\nDigite um valor para pesquisar: ");
                procura = in.nextInt();
                pos = PesquisaBinaria(vet, procura);
                if (pos == -1) {
                    System.out.println("\nValor não encontrado no vetor!");
                } else {
                    System.out.println("\nValor encontrado na posição " + (pos + 1) + "\n");
                }
            }
        } while (opcao != 0);
    }

    // Efetua a leitura do vetor
    static void LeVetor(int vet[]) {
        int i;
        for (i = 0; i < TAMANHO; i++) {
            System.out.println("Informe o valor " + (i + 1) + ":");
            vet[i] = in.nextInt();
        }
    }

    // Imprime o vetor na tela
    static void ImprimeVetor(int vet[]) {
        int i;
        for (i = 0; i < TAMANHO; i++) {
            System.out.println(vet[i]);
        }
    }

    // Ordena o vetor utilizando o método Bubble Sort
    static void OrdenaVetor(int v[]) {
        int i, j, aux;
        for (i = 0; i < TAMANHO - 1; i++) {
            for (j = i + 1; j < TAMANHO; j++) {
                if (v[i] > v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
    }

    // Algoritmo de Busca Binária como parâmetro recebe o vetor e o valor a ser procurado
    static int PesquisaBinaria(int v[], int pesq) {
        int intComeco = 0; // Limite inferior
        int intFinal = TAMANHO - 1; // Limite superior

        int meio;
        while (intComeco <= intFinal) {
            meio = (intComeco + intFinal) / 2;
            if (pesq == v[meio])
                return meio;
            else if (pesq < v[meio])
                intFinal = meio - 1;
            else
                intComeco = meio + 1;
        }
        return -1; // não encontrado
    }

    // Exibe o menu de opções na tela
    static int MontaMenu() {
        int opcao;
        System.out.println("\nBUSCA BINÁRIA");
        System.out.println("_____________\n");
        System.out.println("Digite a opção desejada:\n");
        System.out.println("[1] Ver o vetor ordenado\n");
        System.out.println("[2] Pesquisar um valor\n");
        System.out.println("[0] Sair\n\n");
        opcao = in.nextInt();
        return opcao;
    }
}
