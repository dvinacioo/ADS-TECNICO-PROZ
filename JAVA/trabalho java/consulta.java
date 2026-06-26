import java.util.Scanner;

public class consulta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("O que deseja assistir (filme/serie)?  ");
        String resposta = sc.nextLine();
    
        if(resposta.equalsIgnoreCase("filme")){

            Conteudo filme1 = new Carros("1 - Carros 1", "Animação");
            Conteudo filme2 = new ToyStory("2 - Toy Story 1", "Animação");
            Conteudo filme3 = new IndianaJones("3 - Indiana Jones e a Relíquia do Destino", "Aventura");

            filme1.exibir();
            filme2.exibir();
            filme3.exibir();
            
            System.out.println("Qual filme deseja assistir?");
            System.out.print("Digite o número: ");
            int opcao = sc.nextInt();

    switch (opcao) {
        case 1:
            System.out.println("Iniciando o filme Carros...");
            break;

        case 2:
            System.out.println("Iniciando o filme Toy Story...");
            break;

        case 3:
            System.out.println("Iniciando o filme Indiana Jones...");
            break;

        default:
            System.out.println("Filme não encontrado.");
    }
} else if (resposta.equalsIgnoreCase("serie")) {

            Conteudo serie1 = new Loki("1 - Loki", "Ficção e Fantasia");
            Conteudo serie2 = new TheKardashians("2 - The Kardashians", "Documentário");
            Conteudo serie3 = new Alien("3 - Alien: Earth", "Ficção");

            serie1.exibir();
            serie2.exibir();
            serie3.exibir();

            System.out.println("Qual série deseja assistir?");
            System.out.print("Digite o número: ");
            int opcao = sc.nextInt();

    switch (opcao) {
        case 1:
            System.out.println("Iniciando a série Loki...");
            break;

        case 2:
            System.out.println("Iniciando a série The Kardashians...");
            break;

        case 3:
            System.out.println("Iniciando a série Aline: Earth...");
            break;

        default:
            System.out.println("Série não encontrada.");
    }

        } else{
            System.out.println("Opcão Inválida!");
        }

        sc.close();
    }
}