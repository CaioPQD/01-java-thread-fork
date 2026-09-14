# 01-java-thread

## Compilação:
```bash
javac *.java
```

## Execução:
```bash
java Main
```

# Exercícios:

Em Java, implemente as aplicações abaixo.
Em Markdown, explique suas soluções.

## 1) Thread calculadora

Altere Tarefa para receber dois números e uma operação (+, -, *, /).
Em cada passo do laço, calcule um valor diferente (por exemplo, n1 + i, n2 * i, etc.).
Mostre o resultado no console em vez de apenas “processando passo”.



## 2) Thread jogo de adivinhação

Faça cada Tarefa gerar um número secreto ao iniciar.
No laço, execute tentativas de adivinhação aleatórias até trocar 3 palpites.
Exiba se cada palpite foi “maior”, “menor” ou “acertou” e finalize quando acertar.

A tarefa precisa gerar um número secreto quando começa a execução. Para isso, foi utilizada a classe Random, que permite gerar números aleatórios.

Dentro do for, são gerados até 3 palpites aleatórios. Depois de cada palpite, usamos if, else if e else para verificar três possibilidades:

palpite == secreto
→ acertou

palpite > secreto
→ palpite maior

palpite < secreto
→ palpite menor

Quando o palpite é igual ao número secreto, usamos return para encerrar o método run(), pois não é necessário continuar tentando.

## 3) Thread contador de caracteres

Modifique Tarefa para receber uma string.
Conte e exiba a quantidade de caracteres da string.

A Tarefa3 recebe uma String através do construtor e guarda esse texto no atributo texto.

Depois, dentro do método run(), usamos:

texto.length()

O método length() retorna a quantidade de caracteres existentes na String.

Por exemplo:

"Java"

possui:

4 caracteres

Então:

int quantidade = texto.length();

guarda esse valor na variável quantidade e depois ele é exibido no console.

## 4) Thread soma de vetores

Faça Tarefa receber dois vetores de inteiros.
Some elemento a elemento e imprima o resultado parcial de cada índice.
Explique como essa tarefa pode ser paralelizada com várias threads para vetores grandes.

A tarefa recebe dois vetores de inteiros:

private int[] vetor1;
private int[] vetor2;

O int[] significa que estamos trabalhando com um vetor de inteiros.

Primeiro verificamos se os dois vetores possuem o mesmo tamanho:

if (vetor1.length != vetor2.length)

Isso é necessário porque estamos fazendo uma soma elemento por elemento.

Por exemplo:

vetor1 = [10, 20, 30]

vetor2 = [ 1,  2,  3]

A soma será:

índice 0 → 10 + 1 = 11
índice 1 → 20 + 2 = 22
índice 2 → 30 + 3 = 33

Por isso usamos um for para passar por cada índice.

O resultado é armazenado em outro vetor:

int[] resultado = new int[vetor1.length];

E em cada posição:

resultado[i] = vetor1[i] + vetor2[i];
Como essa tarefa pode ser paralelizada?

Para vetores pequenos, uma única thread é suficiente.

Mas imagine um vetor com 10 milhões de posições.

Podemos dividir o trabalho entre várias threads:

Thread 1 → índices 0 até 2.499.999
Thread 2 → índices 2.500.000 até 4.999.999
Thread 3 → índices 5.000.000 até 7.499.999
Thread 4 → índices 7.500.000 até 9.999.999

Cada thread ficaria responsável por uma parte do vetor.

Isso é possível porque cada posição pode ser calculada independentemente:

resultado[0] = vetor1[0] + vetor2[0]
resultado[1] = vetor1[1] + vetor2[1]
resultado[2] = vetor1[2] + vetor2[2]

Uma thread não precisa esperar a outra para calcular uma posição diferente.

Justificativa da paralelização: o vetor pode ser dividido em blocos de índices e cada thread pode calcular seu próprio bloco simultaneamente, aproveitando múltiplos núcleos do processador.

## 5) Thread soma de matrizes

Faça Tarefa receber duas matrizes de inteiros.
Some elemento a elemento e imprima o resultado parcial de cada índice.
Explique como essa tarefa pode ser paralelizada com várias threads para matrizes grandes.


Agora temos dois vetores de duas dimensões, que representam matrizes:

int[][] matriz1;
int[][] matriz2;

Uma matriz pode ser visualizada assim:

[ 1  2  3 ]
[ 4  5  6 ]
[ 7  8  9 ]

Temos:

linha
  ↓
[ 1  2  3 ]
[ 4  5  6 ]
[ 7  8  9 ]
       ↑
     coluna

Por isso precisamos de dois for:

for (int i = 0; i < matriz1.length; i++) {

O primeiro percorre as linhas.

Depois:

for (int j = 0; j < matriz1[i].length; j++) {

O segundo percorre as colunas.

Assim conseguimos acessar cada posição:

matriz1[i][j]

e:

matriz2[i][j]

A soma é feita exatamente na mesma posição das duas matrizes:

resultado[i][j] = matriz1[i][j] + matriz2[i][j];

Por exemplo:

Matriz 1        Matriz 2

1 2              5 6
3 4              7 8

Resultado:

6  8
10 12
Como essa tarefa pode ser paralelizada?

Assim como no vetor, uma matriz grande pode ser dividida em partes.

Por exemplo:

Matriz com 1000 linhas

Podemos dividir:

Thread 1 → linhas 0 - 249
Thread 2 → linhas 250 - 499
Thread 3 → linhas 500 - 749
Thread 4 → linhas 750 - 999

Cada thread ficaria responsável por calcular uma parte da matriz.

Como cada posição pode ser calculada independentemente:

resultado[i][j] =
    matriz1[i][j] + matriz2[i][j]

uma thread não precisa esperar outra terminar para calcular uma posição diferente.

Justificativa da paralelização: a matriz pode ser dividida por linhas, colunas ou blocos, permitindo que diferentes threads processem partes diferentes simultaneamente.