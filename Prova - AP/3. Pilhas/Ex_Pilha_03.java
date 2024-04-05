import java.util.Scanner;

public class Ex_Pilha_03 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número:");
        int valor = entrada.nextInt();
        
        Pilha novaPilha = new Pilha();
        novaPilha.push(valor);
        novaPilha.push(70);
        novaPilha.push(88);
        
        System.out.println("Item de valor " + novaPilha.pop() + " retirado da pilha");
        System.out.println("Item restante: " + novaPilha.peek());
        System.out.println("Item de valor " + novaPilha.pop() + " retirado da pilha");
        System.out.println("Item restante: " + novaPilha.peek());
    }
}

class Pilha {
    static final int MAX = 10;
    int top;
    int a[] = new int[MAX]; // Define tamanho máximo da pilha
    
    // Construtor
    Pilha() {
        top = -1;
    }
    
    // Métodos da pilha
    
    boolean isEmpty() {
        return (top < 0);
    }
    
    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Estouro de Pilha!");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }
    
    int pop() {
        if (top < 0) {
            System.out.println("Pilha Vazia!");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }
    
    int peek() {
        if (top < 0) {
            System.out.println("Pilha Vazia!");
            return 0;
        } else {
            return a[top];
        }
    }
}

//Este código implementa uma pilha em Java com os métodos push (empilhar), pop (desempilhar), peek (visualizar o elemento do topo da pilha) e isEmpty (verificar se a pilha está vazia). O programa Ex_Pilha_03 demonstra o uso desses métodos ao empilhar alguns valores, desempilhar e visualizar o elemento do topo da pilha.