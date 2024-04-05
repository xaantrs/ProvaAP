public class Ex_FCircular01 {
    
    static final int MAX = 4; // numero maximo de elementos na fila
    static int comeco = 0; // comeco da fila
    static int tamanho = 0; // tamanho da fila (numero de elementos)
    static int queue[] = new int[MAX]; // vetor da fila

    public static void main(String[] args) {
        inserir(1);
        inserir(10);
        inserir(100);
        inserir(1000);
        System.out.println("");
        remover();
        inserir(6);
        remover();
        inserir(60);
        remover();
        inserir(80);
        System.out.println("");
        // mostra fila na tela
        for (int i = 0; i < MAX; i++)
            System.out.println("fila[" + i + "] = " + queue[i]);
    }

    static void inserir(int elemento) {
        // checa se a fila esta cheia
        if (tamanho == MAX)
            System.out.println("\nfila cheia\n");
        else {
            // Para tornar a fila circular
            queue[(comeco + tamanho) % MAX] = elemento;
            System.out.println("Valor " + elemento + " inserido no índice " + ((comeco + tamanho) % MAX) + " da fila");
            // incrementa tamanho da fila (elemento foi inserido)
            tamanho++;
        }
    }

    static void remover() {
        // checa se a fila esta vazia
        if (tamanho == 0)
            System.out.println("\nfila vazia\n");
        else {
            // Apaga o primeiro elemento da fila deslocando o ponteiro do comeco para proximo elemento
            comeco++;
            // decrementa o contador de tamanho (um valor foi removido)
            tamanho--;
        }
    }
}
