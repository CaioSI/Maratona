# Maratona

Pesquisa-Respostas

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
            
