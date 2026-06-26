import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu email: ");
        String email = sc.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        usuario usuario = new cliente(email, nome, senha);

        usuario.exibirDados();

        int opcao = 0;

        while (opcao != 1 && opcao != 2) {

            System.out.println("Escolha um plano:");
            System.out.println("1- Básico: R$ 39,00 POR 12 MESES");
            System.out.println("2- Premium: R$ 50,00 POR 12 MESES");

            opcao = sc.nextInt();

            if (opcao != 1 && opcao != 2) {

                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        planos plano;

        if (opcao == 1) {
            plano = new PlanoBasico();
        } else {
            plano = new PlanoPremium();
        }

        System.out.println("\n=== PLANO ESCOLHIDO ===");
        plano.exibirPlano();

        sc.nextLine();

        boolean opcaoValida = false;

        while (!opcaoValida) {

            System.out.print("\nO que deseja assistir (filme/serie)? ");
            String resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("filme")) {

                opcaoValida = true;

                Conteudo filme1 = new Carros("1 - Carros", "Animação");
                Conteudo filme2 = new ToyStory("2 - Toy Story", "Animação");
                Conteudo filme3 = new IndianaJones("3 - Indiana Jones", "Aventura");

                filme1.exibir();
                filme2.exibir();
                filme3.exibir();

                int escolha = 0;

                while (escolha < 1 || escolha > 3) {

                    System.out.print("Digite o número: ");
                    escolha = sc.nextInt();

                    if (escolha < 1 || escolha > 3) {
                        System.out.println("Filme não encontrado. Tente novamente.");
                    }
                }

                switch (escolha) {

                    case 1:
                        System.out.println("Iniciando o filme Carros...");
                        break;

                    case 2:
                        System.out.println("Iniciando o filme Toy Story...");
                        break;

                    case 3:
                        System.out.println("Iniciando o filme Indiana Jones...");
                        break;
                }

                sc.nextLine();

                String favorito = "";

                while (!favorito.equalsIgnoreCase("s") && !favorito.equalsIgnoreCase("n")) {

                    System.out.print("Deseja adicionar aos favoritos? (s/n): ");
                    favorito = sc.nextLine();

                    if (!favorito.equalsIgnoreCase("s") && !favorito.equalsIgnoreCase("n")) {
                        System.out.println("Digite apenas S ou N.");
                    }
                }

                if (favorito.equalsIgnoreCase("s")) {
                    System.out.println("Filme adicionado aos favoritos!");
                } else {
                    System.out.println("Filme não foi adicionado aos favoritos.");
                }

            } else if (resposta.equalsIgnoreCase("serie")) {

                opcaoValida = true;

                Conteudo serie1 = new Loki("1 - Loki", "Ficção e Fantasia");
                Conteudo serie2 = new TheKardashians("2 - The Kardashians", "Documentário");
                Conteudo serie3 = new Alien("3 - Alien: Earth", "Ficção");

                serie1.exibir();
                serie2.exibir();
                serie3.exibir();

                int escolha = 0;

                while (escolha < 1 || escolha > 3) {

                    System.out.print("Digite o número: ");
                    escolha = sc.nextInt();

                    if (escolha < 1 || escolha > 3) {
                        System.out.println("Série não encontrada. Tente novamente.");
                    }
                }

                switch (escolha) {

                    case 1:
                        System.out.println("Iniciando a série Loki...");
                        break;

                    case 2:
                        System.out.println("Iniciando a série The Kardashians...");
                        break;

                    case 3:
                        System.out.println("Iniciando a série Alien: Earth...");
                        break;
                }

                sc.nextLine();

                String favorito = "";

                while (!favorito.equalsIgnoreCase("s") && !favorito.equalsIgnoreCase("n")) {

                    System.out.print("Deseja adicionar aos favoritos? (s/n): ");
                    favorito = sc.nextLine();

                    if (!favorito.equalsIgnoreCase("s") && !favorito.equalsIgnoreCase("n")) {
                        System.out.println("Digite apenas S ou N.");
                    }
                }

                if (favorito.equalsIgnoreCase("s")) {
                    System.out.println("Série adicionada aos favoritos!");
                } else {
                    System.out.println("Série não foi adicionada aos favoritos.");
                }

            } else {

                System.out.println("Opção inválida! Digite apenas filme ou serie.");

            }

        }

        sc.close();
    }
}