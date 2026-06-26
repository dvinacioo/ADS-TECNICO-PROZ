public abstract class planos {
    public abstract void exibirPlano();
}

class PlanoBasico extends planos {
    @Override
    public void exibirPlano() {
        System.out.println("Plano Básico");
        System.out.println("Valor: R$39,,00");
    }
}

class PlanoPremium extends planos{
    @Override
    public void exibirPlano() {
        System.out.println("Plano Premim");
        System.out.println("Valor: R$50,00");
    }
}

