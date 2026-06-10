import java.util.Scanner;

public class P008_Main {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //FUNCIONÁRIO 1
        System.out.println("*** FUNCIONÁRIO 1 ***");
        System.out.print("Matricula: ");
        int matricula1 = entrada.nextInt();
        entrada.nextLine(); // limpa o Enter que ficou pendente

        System.out.print("Nome: ");
        String nome1 = entrada.nextLine();

        System.out.print("Cargo: ");
        String cargo1 = entrada.nextLine();

        System.out.print("Salário: ");
        double salario1 = entrada.nextDouble();

        System.out.print("Ativo (true/false): ");
        boolean ativo1 = entrada.nextBoolean();

        //FUNCIONÁRIO 2
        System.out.println("*** FUNCIONÁRIO 2 ***");
        System.out.print("Matricula: ");
        int matricula2 = entrada.nextInt();
        entrada.nextLine(); // limpa o Enter que ficou pendente

        System.out.print("Nome: ");
        String nome2 = entrada.nextLine();

        System.out.print("Cargo: ");
        String cargo2 = entrada.nextLine();

        System.out.print("Salário: ");
        double salario2 = entrada.nextDouble();

        System.out.print("Ativo (true/false): ");
        boolean ativo2 = entrada.nextBoolean();

        P008_Funcionario funcionario1 = new P008_Funcionario(matricula1, nome1, cargo1, salario1, ativo1);
        P008_Funcionario funcionario2 = new P008_Funcionario(matricula2, nome2, cargo2, salario2, ativo2);

        System.out.println("==========================");
        System.out.println("DADOS FUNCIONÁRIO 1");
        funcionario1.exibirDados();
        System.out.println("Acesso permitido? " + funcionario1.trabalhoLiberado());
        System.out.println("Recebe bônus? " + funcionario1.recebeBonus());

        System.out.println("=========================");
         System.out.println("DADOS FUNCIONÁRIO 2");
        funcionario2.exibirDados();
        System.out.println("Acesso permitido? " + funcionario2.trabalhoLiberado());
        System.out.println("Recebe bônus? " + funcionario2.recebeBonus());
        
        entrada.close();

    }

}