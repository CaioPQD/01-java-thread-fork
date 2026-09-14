import java.util.Random;

class Tarefa2 implements Runnable {

    @Override
    public void run() {

        // Cria um objeto que gera números aleatórios
        Random random = new Random();

        // Gera o número secreto entre 1 e 100
        int numeroSecreto = random.nextInt(100) + 1;

        System.out.println("Número secreto foi gerado.");

        // Permite no máximo 3 tentativas
        for (int i = 1; i <= 3; i++) {

            // Gera um palpite aleatório entre 1 e 100
            int palpite = random.nextInt(100) + 1;

            System.out.println("Tentativa " + i + ": " + palpite);

            if (palpite == numeroSecreto) {
                System.out.println("Acertou!");
                return;
            } 
            else if (palpite > numeroSecreto) {
                System.out.println("O palpite foi maior que o número secreto.");
            } 
            else {
                System.out.println("O palpite foi menor que o número secreto.");
            }
        }

        System.out.println("Fim das tentativas.");
        System.out.println("O número secreto era: " + numeroSecreto);
    }
}