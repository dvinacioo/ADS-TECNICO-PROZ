public class P012 {
    public static void main(String[] args) {

        String[] produtos = {"Arroz", "Feijão", "Batata", "Alho Roxo", "Cebola", "Café", "Miojo", "Pão", "Manteiga", "Salgadinhos/Chips", "Refrigerante", "Bala Macia", "Chiclete", "Molho de tomate"};

        System.out.println("Os primeiros 10 produtos:");
        for(int i = 0; i < 10; i++){
            System.out.println((i + 1) + " - " + produtos[i]);
        }
    }
}