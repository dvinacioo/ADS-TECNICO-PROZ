public abstract class usuario {
    private String email;
    private String nome;
    private String senha;

    public usuario(String email, String nome, String senha) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }
    
    public String getSenha() {
        return senha;
    }

    public abstract void exibirDados();

}