public class P008_Funcionario {

    private int matricula;
    private String nome;
    private String cargo;
    private double salario;
    private boolean ativo;

    public P008_Funcionario(int matricula, String nome, String cargo, double salario, boolean ativo){
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = ativo;
    }

    public void exibirDados(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }

    public boolean trabalhoLiberado(){
        return ativo && String.valueOf(matricula).length() >= 6;
    }

    public boolean recebeBonus(){
        return salario < 5000;
    }
}