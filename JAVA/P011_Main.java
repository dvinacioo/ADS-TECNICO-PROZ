import java.util.Scanner;
import javax.swing.JOptionPane;

public class P011_Main {
    public static void main(String[] args){

        JOptionPane.showMessageDialog(null,
            "Bem vindo(a) ao Sistema de Estoque!");

        Scanner entrada = new Scanner(System.in);

        // PRODUTO 1
        System.out.println("=== PRODUTO 1 ===");
        System.out.print("Código: ");
        int codigoProduto1 = entrada.nextInt();
        entrada.nextLine(); // limpa o Enter que ficou pendente

        System.out.print("Nome do Produto: ");
        String nomeProduto1 = entrada.nextLine();

        System.out.print("Categoria: ");
        String categoriaProduto1 = entrada.nextLine();

        System.out.print("Preço: ");
        double precoProduto1 = entrada.nextDouble();

        System.out.print("Quantidade em Estoque: ");
        int estoqueProduto1 = entrada.nextInt();

        System.out.print("Produto disponível (true/false): ");
        boolean disponinilidadeProduto1 = entrada.nextBoolean();
        System.out.println("");

        // PRODUTO 2
        System.out.println("=== PRODUTO 2 ===");
        System.out.print("Código: ");
        int codigoProduto2 = entrada.nextInt();
        entrada.nextLine(); // limpa o Enter que ficou pendente

        System.out.print("Nome do Produto: ");
        String nomeProduto2 = entrada.nextLine();

        System.out.print("Categoria: ");
        String categoriaProduto2 = entrada.nextLine();

        System.out.print("Preço: ");
        double precoProduto2 = entrada.nextDouble();

        System.out.print("Quantidade em Estoque: ");
        int estoqueProduto2 = entrada.nextInt();

        System.out.print("Produto disponível (true/false): ");
        boolean disponinilidadeProduto2 = entrada.nextBoolean();
        System.out.println("");


        // CRIAÇÃO DAS VARIAVEIS DOS PRODUTOS
        P011_Produto produto1 = new P011_Produto(codigoProduto1, nomeProduto1, categoriaProduto1, precoProduto1, estoqueProduto1, disponinilidadeProduto1);
        P011_Produto produto2 = new P011_Produto(codigoProduto2, nomeProduto2, categoriaProduto2, precoProduto2, estoqueProduto2, disponinilidadeProduto2);


        // EXIBIÇÃO DOS DADOS

        // EXIBINDO DADOS DO PRODUTO 1
        System.out.println("=== DADOS DO PRODUTO 1 ===");
        produto1.exibirDados();
        System.out.println("Produto disponível? " + produto1.produtoDisponivel());
        System.out.println("Aceita desconto? " + produto1.aceitaDesconto());
        System.out.println("Nível do estoque: " + produto1.nivelEstoque());
        

        // EXIBINDO DADOS DO PRODUTO 2
        System.out.println("=== DADOS DO PRODUTO 2 ===");
        produto2.exibirDados();
        System.out.println("Produto disponível? " + produto2.produtoDisponivel());
        System.out.println("Aceita desconto? " + produto2.aceitaDesconto());
        System.out.println("Nível do estoque: " + produto2.nivelEstoque());
        

        entrada.close(); // fecha o objeto scanner
    }
}