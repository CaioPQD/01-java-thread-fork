class Tarefa4 implements Runnable {

    private int[] vetor1;
    private int[] vetor2;

    public Tarefa4(int[] vetor1, int[] vetor2) {
        this.vetor1 = vetor1;
        this.vetor2 = vetor2;
    }

    @Override
    public void run() {

        // Verifica se os vetores possuem o mesmo tamanho
        if (vetor1.length != vetor2.length) {
            System.out.println("Os vetores precisam ter o mesmo tamanho.");
            return;
        }

        // Cria um novo vetor para guardar os resultados
        int[] resultado = new int[vetor1.length];

        // Soma cada posição dos vetores
        for (int i = 0; i < vetor1.length; i++) {

            resultado[i] = vetor1[i] + vetor2[i];

            System.out.println(
                "Índice " + i + ": " +
                vetor1[i] + " + " +
                vetor2[i] + " = " +
                resultado[i]
            );
        }
    }
}