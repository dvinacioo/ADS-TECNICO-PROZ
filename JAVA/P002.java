public class P002 {
    public static void main(String[] args){
        //CRIANDO LAÇO DE REPETIÇÃO
        for(int etapa = 1; etapa <= 5; etapa++){
            if(etapa == 1){
                System.out.println("Sistema do carro iniciado.");
            }else if(etapa == 2){
                System.out.println("Sensores ativados");
            }else if(etapa == 3){
                System.out.println("Modo autônomo ligado.");
            }else if(etapa == 4){
                System.out.println("Calculando a melhor rota...");
            }else if(etapa == 5){
                System.out.println("Trajeto será iniciado.");
            }
        }
    }
}