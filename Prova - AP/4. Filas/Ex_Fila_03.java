public class Ex_Fila_03 {
    public static void main(String[] args) {
        FilaInteiro fila = new FilaInteiro(10);
        fila.enqueue(10);
        fila.ExibirFila();
        fila.dequeue();
        fila.ExibirFila();
        fila.enqueue(103);
        fila.ExibirFila();
        fila.enqueue(120);
        fila.ExibirFila();
        fila.enqueue(150);
        fila.ExibirFila();
        fila.dequeue(); //SAI O 103
        fila.enqueue(110);
        fila.ExibirFila();
    }
}

class FilaInteiro {
    private static int[] vetorEstrutura;
    private int quantidade;
    private int inicio;
    private int fim;

    public FilaInteiro(int tamanhoFila) {
        vetorEstrutura = new int[tamanhoFila];
        quantidade = 0;
        inicio = -1;
        fim = -1;
    }

    public void enqueue(int value) {
        if (isEmpty()) {
            inicio++;
            fim++;
            vetorEstrutura[inicio] = value;
            quantidade++;
        } else {
            if (!isFull()) {
                fim++;
                vetorEstrutura[fim] = value;
                quantidade++;
            } else {
                System.out.println("Fila Cheia!");
            }
        }
    }

    public int dequeue() {
        int valorRetorno = 0;
        if (isEmpty()) {
            System.out.println("Fila Vazia!");
        } else {
            valorRetorno = vetorEstrutura[inicio];
            if (inicio == fim) {
                inicio = -1;
                fim = -1;
                quantidade--;
            } else {
                inicio++;
                Reorganizar();
            }
        }
        return valorRetorno;
    }

    public boolean isEmpty() {
        return inicio == -1;
    }

    public boolean isFull() {
        return fim == vetorEstrutura.length - 1;
    }

    public int size() {
        return quantidade;
    }

    private void Reorganizar() {
        for (int i = inicio; i <= fim; i++) {
            vetorEstrutura[i - 1] = vetorEstrutura[i];
        }
        inicio--;
        fim--;
    }

    public void ExibirFila() {
        if (!isEmpty()) {
            for (int i = inicio; i <= fim; i++) {
                System.out.print(vetorEstrutura[i] + " ");
            }
        } else {
            System.out.println("\nFila vazia!");
        }
        System.out.println("");
    }
}
