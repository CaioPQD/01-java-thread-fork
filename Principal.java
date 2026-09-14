// 1. Criar a classe principal:
public class Main {
    public static void main(String[] args) {

        // =====================================
        // TAREFA 1 - CALCULADORA
        // =====================================

        Tarefa1 tarefa1 = new Tarefa1(10, 5, '+');

        Thread t1 = new Thread(tarefa1);

        t1.start();


        // =====================================
        // TAREFA 2 - JOGO DE ADIVINHAÇÃO
        // =====================================

        
        Tarefa2 tarefa2 = new Tarefa2();

        Thread t2 = new Thread(tarefa2);

        t2.start();
        


        // =====================================
        // TAREFA 3 - CONTADOR DE CARACTERES
        // =====================================

        
        Tarefa3 tarefa3 = new Tarefa3("Programação em Java");

        Thread t3 = new Thread(tarefa3);

        t3.start();
        


        // =====================================
        // TAREFA 4 - SOMA DE VETORES
        // =====================================

        
        int[] vetor1 = {10, 20, 30, 40};
        int[] vetor2 = {1, 2, 3, 4};

        Tarefa4 tarefa4 = new Tarefa4(vetor1, vetor2);

        Thread t4 = new Thread(tarefa4);

        t4.start();
        


        // =====================================
        // TAREFA 5 - SOMA DE MATRIZES
        // =====================================

        
        int[][] matriz1 = {
            {1, 2},
            {3, 4}
        };

        int[][] matriz2 = {
            {5, 6},
            {7, 8}
        };

        Tarefa5 tarefa5 = new Tarefa5(matriz1, matriz2);

        Thread t5 = new Thread(tarefa5);

        t5.start();

        }
        
    }

}