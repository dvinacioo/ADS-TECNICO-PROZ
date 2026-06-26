public class Catalogo {

    public static void main(String[] args) {

        // FILMES
        Conteudo filme1 = new Carros("1 - Carros 1", "Animação");
        Conteudo filme2 = new ToyStory("2 - Toy Story 1", "Animação");
        Conteudo filme3 = new IndianaJones("3 - Indiana Jones e a Relíquia do Destino", "Aventura");
        // SÉRIES
        Conteudo serie1 = new Loki("1 - Loki", "Ficção e Fantasia");
        Conteudo serie2 = new TheKardashians("2 - The Kardashians", "Documentário");
        Conteudo serie3 = new Alien("3 - Alien: Earth", "Ficção");

        System.out.println("===== CATÁLOGO DISNEY+ =====");

        filme1.exibir();
        System.out.println();

        filme2.exibir();
        System.out.println();

        filme3.exibir();
        System.out.println();

        serie1.exibir();
        System.out.println();

        serie2.exibir();
        System.out.println();

        serie3.exibir();
        System.out.println();
    }
}

// ABSTRAÇÃO
abstract class Conteudo {

    // ENCAPSULAMENTO
    private String nome;
    private String genero;

    public Conteudo(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    // POLIMORFISMO
    public abstract void exibir();
}

// HERANÇA
class Carros extends Conteudo {

    public Carros(String nome, String genero) {
        super(nome, genero);
    }

    @Override
    public void exibir() {
        System.out.println("========================");
        System.out.println("Nome: " + getNome());
        System.out.println("Gênero: " + getGenero());
        System.out.println("========================");

    }
}

// HERANÇA
class ToyStory extends Conteudo {

    public ToyStory(String nome, String genero) {
        super(nome, genero);
    }

    @Override
    public void exibir() {
        System.out.println("========================");
        System.out.println("Nome: " + getNome());
        System.out.println("Gênero: " + getGenero());
        System.out.println("========================");
    }
}

// HERANÇA
class IndianaJones extends Conteudo {

    public IndianaJones(String nome, String genero) {
        super(nome, genero);
    }

    @Override
    public void exibir() {
        System.out.println("========================");
        System.out.println("Nome: " + getNome());
        System.out.println("Gênero: " + getGenero());
        System.out.println("========================");
    }
}

// HERANÇA
class Loki extends Conteudo {

    public Loki(String nome, String genero) {
        super(nome, genero);
    }

    @Override
    public void exibir() {
        System.out.println("========================");
        System.out.println("Nome: " + getNome());
        System.out.println("Gênero: " + getGenero());
        System.out.println("========================");
    }
}

// HERANÇA
class TheKardashians extends Conteudo {

    public TheKardashians(String string, String string2) {
        super(string, string2);
    }

    @Override
    public void exibir() {
        System.out.println("========================");
        System.out.println("Nome: " + getNome());
        System.out.println("Gênero: " + getGenero());
        System.out.println("========================");
    }
}

// HERANÇA
class Alien extends Conteudo {

    public Alien(String nome, String genero) {
        super(nome, genero);
    }

    @Override
    public void exibir() {
        System.out.println("========================");
        System.out.println("Nome: " + getNome());
        System.out.println("Gênero: " + getGenero());
        System.out.println("========================");
    }
}