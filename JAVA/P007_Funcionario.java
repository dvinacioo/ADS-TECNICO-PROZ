public class P007_Funcionario {

    private String matricula;
    private String nome;
    private boolean ativo;

    public P007_Funcionario(String matricula, String nome, boolean ativo){
        this.matricula = matricula;
        this.nome = nome;
        this.ativo = ativo;
    }

    public void exibirDados(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
    }

    public boolean trabalhoLiberado(){
        return ativo && String.valueOf(matricula).length() >= 6;
    }
}
