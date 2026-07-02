import javax.swing.JOptionPane;

public class P015_Lanchonete {

    public static void main(String[] args) {
        // SOLICITANDO NOME DO CLIENTE
        String nome = JOptionPane.showInputDialog("Qual o nome no pedido? ");

        String[] opcoesLanches = { "Hambúrguer", "Cachorro-quente", "Pizza" };

        String lanches =(String) JOptionPane.showInputDialog(
            null,
            "Escolha seu Lanche:",
            "Lanches Disponpiveis",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoesLanches,
            opcoesLanches[0]);

        // SOLICITANDO QUANTIDADE DE LANCHE ESCOLHIDO
        String numeroLanches = JOptionPane.showInputDialog("Qual número de " + lanches + "você deseja? ");
        int qntLanches = Integer.parseInt(numeroLanches);

        //VERIFICA BONUS DE REFRIGERANTE
        if(qntLanches >= 3){
            JOptionPane.showMessageDialog(
                null,
                "Pedido Realizado!\n\n"
                + "\nNome: " + nome
                + "\nLanche Escolhido: " + lanches
                + "\nQuantidade: " + qntLanches
                + "\nParabéns, você ganhou um refrigerante como bônus!"
                + "\n\nObrigado por comprar. Volte sempre!"
            );
        } else{
            JOptionPane.showMessageDialog(
                null,
                "Pedido Realizado!\n\n"
                + "\nNome: " + nome
                + "\nLanche Escolhido: " + lanches
                + "\nQuantidade: " + qntLanches
                + "\n\nObrigado por comprar. Volte sempre!");
        }
    }
}