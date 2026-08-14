// 1. Criar uma classe que implementa a interface Runnable:
class Tarefa implements Runnable {
    private String nome;

    public Tarefa(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(nome + " processando passo " + i + ".");
            try {
                // 2. Simular uma tarefa que demora 1 segundo:
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println(nome + " foi interrompida.");
            }
        }
        System.out.println(nome + " FINALIZADA!");
    }
}
