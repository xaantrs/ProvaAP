import java.util.Scanner;

public class Cadastro {
    public static final int QUANTIDADE_DE_PRODUTOS = 3;

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Produto[] produtos = new Produto[QUANTIDADE_DE_PRODUTOS];

        // Cadastro dos produtos
        for (int i = 0; i < QUANTIDADE_DE_PRODUTOS; i++) {
            System.out.println("Informe os dados do produto " + (i + 1) + ":");
            produtos[i] = new Produto();
            System.out.print("Código: ");
            produtos[i].codigo = leitor.nextInt();
            System.out.print("Nome: ");
            produtos[i].nome = leitor.next();
            System.out.print("Preço: ");
            produtos[i].preco = leitor.nextDouble();
        }

        // Impressão da lista de produtos
        System.out.println("\nLista de Produtos:");
        for (int i = 0; i < QUANTIDADE_DE_PRODUTOS; i++) {
            System.out.println("Código: " + produtos[i].codigo + ", Nome: " + produtos[i].nome);
        }

        // Consulta de preço de um produto por código
        System.out.print("\nInforme o código do produto para consultar o preço: ");
        int codigoConsulta = leitor.nextInt();
        double precoConsultado = buscarPrecoPorCodigo(produtos, codigoConsulta);
        if (precoConsultado != -1) {
            System.out.println("O preço do produto com código " + codigoConsulta + " é: " + precoConsultado);
        } else {
            System.out.println("Produto não encontrado.");
        }

        leitor.close();
    }

    static double buscarPrecoPorCodigo(Produto[] produtos, int codigo) {
        for (Produto produto : produtos) {
            if (produto.codigo == codigo) {
                return produto.preco;
            }
        }
        return -1;
    }

    static class Produto {
        int codigo;
        String nome;
        double preco;
    }
}
