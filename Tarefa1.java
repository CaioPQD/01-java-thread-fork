// 1. Criar uma classe que implementa a interface Runnable:
//runnable processo que sera executado pela thread
class tarefa1 implements Runnable {

    //atributos privados da classe tarefa, n1, n2, operacao
    //cada objeto tarefa tera seu proprio nome
    private int n1;
    private int n2;
    private char operacao;
    
    //x: variavel qualquer
    //metodo construtor classe tarefa
    //recebe nome como parametro, sera atribuido ao nome pertencente a classe
    //o atributo nome da classe tarefa, this.x, recebe o atributo nome que o 
    //usuario esta passando para ela
    public Tarefa(int n1, int n2, char operacao) {
        // "this.x " = atributo do objeto
        // "x" = parâmetro recebido pelo construtor
        // O valor recebido é armazenado no atributo.
        this.n1 = n1;
        this.n2 = n2;
        this.operacao = operacao;
    }

     @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {

            int resultado = 0;

            switch (operacao) {
                case '+':
                    resultado = (n1 + i) + (n2 + i);
                    break;

                case '-':
                    resultado = (n1 + i) - (n2 + i);
                    break;

                case '*':
                    resultado = (n1 + i) * (n2 + i);
                    break;

                case '/':
                    resultado = (n1 + i) / (n2 + i);
                    break;

                default:
                    System.out.println("Operação inválida.");
                    return;
            }
             System.out.println((n1 + i) + " " + operacao + " " + (n2 + i) + " = " + resultado);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrompida.");
            }
        }
    }
}
