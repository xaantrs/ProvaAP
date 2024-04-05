public class Ex_Pilha_02 {
    public Object[] pilha;
    public int posicaoPilha;

    public Ex_Pilha_02() {
        // Indica que a pilha está vazia, pois posição -1 indica que não contém informação
        this.posicaoPilha = -1;
        // Criando uma pilha com 10 posições
        this.pilha = new Object[10];
    }

    public static void main(String args[]) {
        Ex_Pilha_02 p = new Ex_Pilha_02();
        p.empilhar("Portuguesa");
        p.empilhar("Frango com catupiry");
        p.empilhar("Calabresa");
        p.empilhar("Quatro queijos");
        p.empilhar(10);

        while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }
    }

    public boolean pilhaVazia() {
        // Verifica se a pilha está vazia
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        // Retorna o tamanho da pilha
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    public Object exibeUltimoValor() {
        // Retorna o último valor da pilha sem removê-lo
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }

    public Object desempilhar() {
        // Remove e retorna o elemento do topo da pilha
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }

    public void empilhar(Object valor) {
        // Adiciona um novo elemento no topo da pilha
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }
}

//Este programa demonstra como criar uma pilha em Java e realizar operações básicas como empilhar (empilhar), desempilhar (desempilhar), verificar se a pilha está vazia (pilhaVazia), obter o tamanho da pilha (tamanho) e exibir o último valor da pilha sem removê-lo (exibeUltimoValor).