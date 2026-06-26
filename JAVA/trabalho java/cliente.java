public class cliente extends usuario {
    public cliente (String email, String nome, String senha){
        super(email, nome, senha);
    }

    @Override public void exibirDados() {
        System.out.println("=== DADOS DO USUÁRIO ===");
        System.out.println("Email: " + getEmail());
        System.out.println("Nome: " + getNome());
    }
}
