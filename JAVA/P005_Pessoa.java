public class P005_Pessoa {
    private String nome;
    private int idade;

    public P005_Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public boolean MaiorDeIdade(){
        return idade >= 18;
    }
}
