public class P003 {
    public static void main(String[] args) throws InterruptedException{
        
        for(int i = 1; i <= 5; i++){
            switch (i) {
                case 1:
                    System.out.println("Sistema do carro iniciado!");
                    Thread.sleep(3000);
                    break;
            
                case 2:
                    System.out.println("Sensores ativados!");
                    Thread.sleep(3000);
                    break;

                case 3:
                    System.out.println("Modo autônomo ligado.");
                    Thread.sleep(3000);
                    break;

                case 4:
                    System.out.println("Calculando a melhor rota...");
                    Thread.sleep(3000);
                    break;

                case 5:
                    System.out.println("Trajeto será iniciado.");
                    Thread.sleep(3000);
                    break;

            }
        }
    }
}
