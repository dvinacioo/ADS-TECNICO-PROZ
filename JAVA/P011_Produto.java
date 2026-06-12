public class P011_Produto {
    
    private int codigo;
    private String nome;
    private String categoria;
    private double preco;
    private int qntEstoque;
    private boolean disponivel;


    public P011_Produto(int codigo, String nome, String categoria, double preco, int qntEstoque, boolean disponivel){
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.qntEstoque = qntEstoque;
        this.disponivel = disponivel;
   
    }

public void exibirDados(){
    System.out.println("Código: " + codigo);
    System.out.println("Nome: " + nome);
    System.out.println("Categoria: " + categoria);
    System.out.println("Preço : " + preco);
    System.out.println("Quantidade em Estoque: " + qntEstoque);
}

    public boolean produtoDisponivel(){
        return disponivel && qntEstoque >= 1;
    }

    public String nivelEstoque(){
        if(qntEstoque > 10){
            return "ESTOQUE ADEQUADO";
        } else{
            return "ESTOQUE BAIXO";
        }
    }

    public boolean aceitaDesconto(){
        return preco > 200.00;
    }
}
