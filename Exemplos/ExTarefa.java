// 1. Criar uma classe que implementa a interface Runnable:
//runnable processo que sera executado pela thread
class Tarefa implements Runnable {
    

    //atributo privado da classe tarefa, nome
    //cada objeto tarefa tera seu proprio nome
    private String nome;
    
    //metodo construtor classe tarefa
    //recebe nome como parametro, sera atribuido ao nome pertencente a classe
    //o atributo nome da classe tarefa, this.nome, recebe o atributo nome que o 
    //usuario esta passando para ela
    public Tarefa(String nome) {
        // "this.nome" = atributo do objeto
        // "nome" = parâmetro recebido pelo construtor
        // O valor recebido é armazenado no atributo.
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
