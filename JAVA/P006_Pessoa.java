public class P006_Pessoa {

    private int login;
    private String senha;
    private boolean acesso;

    public P006_Pessoa(int login, String senha, boolean acesso){
        this.login = login;
        this.senha = senha;
        this.acesso = acesso;
    }

    public void exibirDados(){
        System.out.println("Login: " + login);
        System.out.println("Senha: " + senha);
    }

    public boolean AcessoLiberado(){
        return senha.length() >= 7 && acesso;
    }
}