class Tarefa3 implements Runnable {

    private String texto;

    public Tarefa3(String texto) {
        this.texto = texto;
    }

    @Override
    public void run() {

        int quantidade = texto.length();

        System.out.println("Texto: " + texto);
        System.out.println("Quantidade de caracteres: " + quantidade);
    }
}