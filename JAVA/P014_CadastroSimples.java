import javax.swing.JOptionPane;

public class P014_CadastroSimples {

    public static void main(String[] args) {
        
        // Entrada dos Dados
        String nome = JOptionPane.showInputDialog("Digite seu  nome: ");

        String idadeTexto = JOptionPane.showInputDialog("Digite sua idade: ");
        int idade = Integer.parseInt(idadeTexto);

        String[] cursos = {"Informática", "Administração", "Logistica"};
        

        String curso = (String) JOptionPane.showInputDialog(
        null,
        "Escolha seu curso: ",
        "Cadastro",
        JOptionPane.QUESTION_MESSAGE,
        null,
        cursos,
        cursos[0]);

        // Condicional
        if (idade >=18){
            JOptionPane.showMessageDialog(
                null,
                "Cadastro realizado!\n\n"
                + "Nome: " + nome
                + "\nIdade: " + idade
                + "\nCurso: " + curso
                + "\n\nVocê é maior de idade.");
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Cadastro realizado!\n\n"
                + "Nome: " + nome
                + "\nIdade: " + idade
                + "\nCurso: " + curso
                + "\n\nVocê é menor de idade, precisa de autorização do responsável.");
        }
    }
}