public class P006_Main {
    public static void main(String[] args) {
        P006_Pessoa pessoa1 = new P006_Pessoa(1234567, "senha@01", true);
        P006_Pessoa pessoa2 = new P006_Pessoa(7654321, "s2", true);

        pessoa1.exibirDados();
        System.out.println("Acesso pertmitido: " + pessoa1.AcessoLiberado());

        pessoa2.exibirDados();
        System.out.println("Acesso pertmitido: " + pessoa2.AcessoLiberado());
    }
}
