class Tarefa5 implements Runnable {

    private int[][] matriz1;
    private int[][] matriz2;

    public Tarefa5(int[][] matriz1, int[][] matriz2) {
        this.matriz1 = matriz1;
        this.matriz2 = matriz2;
    }

    @Override
    public void run() {

        // Verifica se as matrizes possuem o mesmo tamanho
        if (matriz1.length != matriz2.length ||
            matriz1[0].length != matriz2[0].length) {

            System.out.println("As matrizes precisam ter o mesmo tamanho.");
            return;
        }

        // Cria a matriz para armazenar o resultado
        int[][] resultado = new int[matriz1.length][matriz1[0].length];

        // Percorre as linhas
        for (int i = 0; i < matriz1.length; i++) {

            // Percorre as colunas
            for (int j = 0; j < matriz1[i].length; j++) {

                resultado[i][j] = matriz1[i][j] + matriz2[i][j];

                System.out.println(
                    "Índice [" + i + "][" + j + "]: " +
                    matriz1[i][j] + " + " +
                    matriz2[i][j] + " = " +
                    resultado[i][j]
                );
            }
        }
    }
}