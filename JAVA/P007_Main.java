public class P007_Main {
    
    public static void main(String[] args) {
    P007_Funcionario funcionario1 = new P007_Funcionario("trabalhador01", "João", true);
    P007_Funcionario funcionario2 = new P007_Funcionario("traba", "Gustavo", true);

    funcionario1.exibirDados();
    System.out.println("Acesso pertmitido: " + funcionario1.trabalhoLiberado());
    System.out.println();

    funcionario2.exibirDados();
    System.out.println("Acesso pertmitido: " + funcionario2.trabalhoLiberado());
    }

}
