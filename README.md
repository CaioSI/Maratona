# Maratona

Pesquisa-Respostas

1)O que é um Algoritmo Recursivo: Em Java, um método pode chamar a si mesmo, esse processo se chama recursão e dizemos que um método é recursivo quando chama a si próprio. Em geral, recursão é o processo em que algo é definido a partir de si mesmo e é um pouco parecido com uma definição circular. O componete chave do método recursivo é a instrução que executa uma chamada a ele próprio. A recursão é um mecanismo de controle poderoso.

2)Descreva o algoritmo de Euclides: algoritmo de Euclides é um método simples e eficiente de encontrar o máximo divisor comum entre dois números inteiros diferentes de zero. É um dos algoritmos mais antigos, conhecido desde que surgiu nos Livros VII e X da obra Elementos de Euclides por volta de 300 a.C.. O algoritmo não exige qualquer fatoração.

3)Explique o que é a Sequência de Fibonacci: É uma sucessão de números que, misteriosamente, aparece em muitos fenômenos da natureza. Descrita no final do século 12 pelo italiano Leonardo Fibonacci, ela é infinita e começa com 0 e 1. Os números seguintes são sempre a soma dos dois números anteriores. Portanto, depois de 0 e 1, vêm 1, 2, 3, 5, 8, 13, 21, 34…

4)Descreva o Algoritmo do BubbleSort: é um algoritmo de ordenação dos mais simples. A ideia é percorrer o vector diversas vezes, e a cada passagem fazer flutuar para o topo o maior elemento da sequência. Essa movimentação lembra a forma como as bolhas em um tanque de água procuram seu próprio nível, e disso vem o nome do algoritmo.

No melhor caso, o algoritmo executa {\displaystyle n}n operações relevantes, onde {\displaystyle n}n representa o número de elementos do vector. No pior caso, são feitas {\displaystyle n^{2}}n^2 operações. A complexidade desse algoritmo é de ordem quadrática. Por isso, ele não é recomendado para programas que precisem de velocidade e operem com quantidade elevada de dados.

5)Descreva o Problema do Palíndromo: Um palíndromo é uma palavra, frase ou qualquer outra sequência de unidades (como uma cadeia de ADN; Enzima de restrição) que tenha a propriedade de poder ser lida tanto da direita para a esquerda como da esquerda para a direita. Num palíndromo, normalmente são desconsiderados os sinais ortográficos (diacríticos ou de pontuação), assim como o espaços entre palavras

A palavra "palíndromo" vem das palavras gregas palin (πάλιν (πάλι, no grego moderno) "para trás, novamente") e dromos (δρόμος, "caminho, rua") - que corre em sentido inverso.

6)Descreva o problema do caixeiro viajante: O problema do caixeiro-viajante consiste na procura de um circuito que possua a menor distância, começando numa qualquer cidade, entre várias, visitando cada cidade precisamente uma vez e regressando à cidade inicial.

7)Descreva o problema da Mochila 

 É um problema que em  dado  um  conjunto  Cn  de  n  itens,  representados  por Cn  =  {1,  2,  ...,  n},  cada  item  i  ∈ Cn  tem  um  peso  pi  e  utilidade  ui (pi  >  0  e  ui > 0). Determinar  um  subconjunto  S  ⊆ Cn  tal  que  a  soma  dos  pesos  dos  elementos  de  S  seja  a  maior possível. É de optimização combinatória, devido ao modelo de uma situação em que é necessário preencher uma mochila com objetos de diferentes pesos e valores. Normalmente este problema é resolvido com programação dinâmica, obtendo então a resolução exata do problema, mas também sendo possível usar PSE (procedimento de separação e evolução).

8)Descreva o Triângulo de Pascal

 Ele é um triângulo aritmético infinito onde são dispostos os coeficientes das expansões binominais. Os números que compõem o triângulo apresentam diversas propriedades e relações, onde os números que compõem o triângulo de Pascal são chamados de números binomiais ou coeficientes binomiais. É construído colocando-se os números binomiais de mesmo numerador na mesma linha e os coeficientes de mesmo denominador na mesma coluna.
 
9)Descreva o Binômio de Newton 

 É qualquer binômio elevado a um número n em que n é um número natural, o polinômio que possui dois termos.O desenvolvimento do binômio de Newton em alguns casos é bastante simples. Podendo ser feita multiplicando-se diretamente todos os termos.
 
 10)Descreva o Algoritmo que calcule o MMC
 
  Os múltiplos de um número são calculados multiplicando-se esse número pelos números naturais. Uma das maneiras de calcular o MMC envolve a fatoração dos números em fatores primos, assim para fazer oalgoritmo precisamos ler dois ou mais numeros e aplicar a formula: 

  int n1, n2, soma, aux;
  
  System.out.println("Digite o primeiro numero");
  n1 = leia.nextInt();
  
  System.out.println("Digite o segundo numero");
  n2 = leia.nextInt();
  
  if ( n1 < n2 ) {
   aux = n1;
   n1 = n2;
   n2 = aux;
  }
  
  soma = n1;
  
  while ( soma % n2 != 0 ) {
   soma += n1;
  }
  
  System.out.println( "MMC " + soma);
 }

11)Descreva o Algoritmo que calcule o MDC

Em matemática é chamado de MDC (máximo divisor comum) o maior número inteiro que é

fator de um conjunto de números. Exemplos: Entre 4 e 8 os divisores comuns são 1, 2 e 4,

portanto o mdc(4, 8) = 4 (o maior).

É possível calcular o MDC recursivamente assim:

Considere a função mdc(a, b).

Se “b” for igual a 0 então mdc(a, b) = a;

Caso contrário, mdc(a, b) = mdc(b, a % b), onde “%” é operador que retorna o resto da

divisão entre dois números.

public static double mdc (double dividendo, double divisor){


            if ((dividendo % divisor == 0 )){
                return divisor;
            }else{
            return mdc(divisor,(dividendo % divisor));
              } 
        }

            public static void main(String[] args) { 

            double resposta = mdc(4,8);
            String resultado = String.format("%.0f", resposta);
            System.out.println("\n\n\n resposta ....: "+resultado);
            
12- Um número perfeito é aquele que é igual a soma dos seus divisores. Ex.: 6 = 1+2+3; 28= 1+2+4+7+14.

13-Um número natural é primo se ele possui apenas dois divisores positivos e distintos. Ou seja, um número natural é primo se ele é maior que 1 e é divisível apenas por si próprio e por 1. O crivo de Estratóstatos, nos permite localizar em uma determinada quantidade de números, quais são os números primos, para isso devemos excluis todos os múltiplos de 2 maiores que 2, os múltiplos de 3 maires que 3, os múltiplos de 5 maires que 5 e por fim, os múltiplos de 7 maiores que 7. Ex em uma tabela de 1 a 100 os números primos são 2,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97.

14-O algoritmo de decimal para binário ou base 10 para base, é necessário dividir o número decimal sucessivamente por 2, anotando o resto da divisão direita para a esquerda.

15-As ideias ligadas à probabilidade de um evento acontecer estão diretamente associadas às situações cotidianas. A probabilidade é apresentada na forma de porcentagem, a qual é analisada com base nos eventos pertencentes a um espaço amostral. Espaço amostral é a união de todos os eventos possíveis. Um algoritmo probabilístico é um algoritmo que utiliza a probabilidade como parte de sua lógica. Na prática, isso significa que a máquina que implementa o algoritmo deve acessar um gerador de números pseudo-aleatórios. O algoritmo utiliza bits aleatórios como um guia para o seu comportamento.

16-Grafos é uma vertente da Matemática que estuda a relação dos objetos de um determinado conjunto . as definições básicas da teoria dos grafos variam bastante. Aqui estão as convenções usadas nesta enciclopédia. Um grafo direcionado (também chamado dígrafo ou quiver ) consiste de • um conjunto V de vértices, • um conjunto E de arestas e

Um grafo não direcionado (ou simplesmente grafo) é dado por • um conjuntoV de vértices, • um conjunto E de arestas e • uma função w : E - P(V) que associa a cada aresta um subconjunto de dois ou de um elemento de V, interpretado como os pontos terminais da aresta. O algoritmo de Dijkstra permite encontrar o menor caminho entre um nó, e todos os outros vértices do grafo.

17-Número de Armstrong, o conceito fala que qualquer conjunto de números é igual a soma de qualquer digito elevado a enésima potencia.

18 - Descreva o Algoritmo do PageRank do Google

O Google foi criado pro Larry Page e Segey Brin, em 1997, na época do crescimento da web. Em 1998, foi implementado o Page Rank, um novo método de pesquisa cujo nome homenageia um dos fundadores, código que prometia ser mais eficiente. A fim de fornecer ao usuário a informação requisitada, o Page Rank calcula a importância do site, analisando a qualidade dos links que apontam para outra página que, por sua vez, também será analisada, conhecidos como back links. Para um melhor entendimento desse processo, pode-ser pensar que se uma pessoa de pouca relevância na área de tecnologia afirmar que a "Universidade Tiradentes" possui bons cursos dessa área, a opnião dela não tem muita importância; no entanto, se Bill Gates, dono da Microsoft, afirmar qe esta instituição é uma das melhores, sua opnião terá um impacto maior, visto que ele é uma pessoa importante no mudo da informática. Por meio dessa lógica, o algoritmo computa a probabilidade de um usuário chegar a determinados sites ao clicar em back links aleatórios, logo, quanto maior o resultado desse cálculo probabilístico, maior a chance de ela aparecer na página principal do Google.

19 - Descreva o que é um Algoritmo determinístico e probabilístico (Conceitue, também, o que é um algoritmo que tenha seu pior caso e o melhor caso)

Algoritmo Determinístico: São algoritmos que apresentam comportamento previsível. Dada uma determinada entrada, o algoritmmo apresenta sempre a mesma saída. Com a máquina responsável sempre passando pela mesma sequência de estados. Algoritmos determinísticos são, de longe, o tipo mais estudado e conhecido de algoritmo, assim como um dos mais práticos, uma vez que podem ser executados em máquinas reais de forma eficiente. Formalmente, um algoritmo determinístico computa uma função matemática; uma função tem um valor único para cada entrada dada, e o algoritmo é um processo que produz este valor em particular como saída.

Algoritmo Probabilístico: Um modelo é probabilístico se possui uma ou mais variáveis aleatórias como entrada. Entradas aleatórias conduzem a saídas aleatórias. As saídas aleatórias são consideradas estimativas das verdadeiras características do sistema. Ao contrário da situação determinística a simulação probabilística está mais próxima da realidade. Um processo de amostragem das variáveis aleatórias é estabelecido para tentar reproduzir, o mais fielmente possível, a realidade. A amostragem utilizada é a aleatória simples, que se tornou um padrão em simulação

Um algoritmo no seu melhor caso e pior caso: Melhor caso e pior caso de um algoritmo se expressa pela quantidade de recursos usados nesse algoritmo. Normalmente, o recurso a ser considerado é o tempo de execução, isto é, complexidade do tempo, porém poderia ser também a quantidade de memória usada ou outros recursos. No tempo real da computação, o pior caso em tempo de execução é muitas vezes motivo de especial preocupação, pois é importante saber quanto tempo pode ser necessário no pior caso para garantir que um algoritmo sempre termine no tempo. O desempenho médio e o desempenho do pior caso são mais utilizados na analise de algoritmo. O menos usado é o desempenho do melhor caso. Porém existe uso para ele: por exemplo, quando se conhece os melhores casos das tarefas individuais, eles podem ser usados para melhorar a precisão da análise do pior caso. Contextos de melhor caso e pior caso: O pior e o melhor caso do resultado de um planejamento para a epidemia, o pior caso da temperatura à qual um elemento de um circuito eletrônico é exposto.

20 - O que é um Algoritmo genético? Os algoritmos genéticos são uma família de modelos computacionais inspirados na evolução, que incorporam uma solução potencial para um problema específico numa estrutura semelhante a de um cromossomo e aplicam operadores de seleção e "cross-over" a essas estruturas de forma a preservar informações críticas relativas à solução do problema. Deve ser observado que cada cromossomo, chamado de indivíduo no AG, corresponde a um ponto no espaço de soluções do problema de otimização. O processo de solução adotado nos algoritmos genéticos consiste em gerar, através de regras específicas, um grande número de indivíduos, população, de forma a promover uma varredura tão extensa quanto necessária do espaço de soluções.

21 - Descreva a Cadeia de Markov: Cadeia de Markov é um tipo especial de processo estocástico, que satisfaz as seguintes condições: o parâmetro n é discreto (ex: tempo), O espaço de estados E é discreto (coleção de estados possíveis) E pode ser finito ou infinito e enumerável, O estado inicial do processo ou o espaço de estados é conhecido. Vale a propriedade markoviana e a de estacionaridade. As probabilidades de todos os estados futuros dependem somente do estado atual, mas não dependem dos estados anteriores, o estado futuro do sistema depende do presente, mas não depende do passado.

22 - O que significa dizer que um algoritmo ou uma teoria é o estado da arte em seu contexto? O estado da arte é o nível mais alto de desenvolvimento, de um aparelho, de uma tecnica ou de uma área científica, alcançado em um tempo definido. Portanto um algoritmo ou uma teoria é o estado da arte em seu contexto por ser algo desenvolvido para deixar de ser um projeto tecnico para se tornar ferramentas para a resolução de problemas, com conjuntos de regras e procedimentos lógicos perfeitamente definidos que levam à solução de um problema em um número finito de etapas.
