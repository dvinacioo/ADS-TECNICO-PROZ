public class P005_Main {
    public static void main(String[] args) {
        P005_Pessoa pessoa1 = new P005_Pessoa("João", 25);
        P005_Pessoa pessoa2 = new P005_Pessoa("Maria", 17);

        pessoa1.exibirDados();
        System.out.println("É maior de idade? " + pessoa1.MaiorDeIdade());

        pessoa2.exibirDados();
        System.out.println("É maior de idade? " + pessoa2.MaiorDeIdade());
    }
}