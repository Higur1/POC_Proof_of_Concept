# 📚POC_Arrays

Esta pasta contém exemplos de manipulação de arrays em Java, demonstrando como declarar, inicializar, percorrer e aplicar operações básicas.

## Conteúdo

- Criação de arrays unidimensionais e multidimensionais
- Iteração com `for`, `foreach` e `while`
- Ordenação e busca em arrays
- Exercícios práticos

## Classes
- **CreateNewArray.java**  
  Mostra como declarar, inicializar e acessar elementos em um array unidimensional em Java, incluindo a atribuição de valores em posições específicas.

- **StartArrays.java**  
   Exemplos de criação e inicialização de arrays em Java, incluindo exibição com `Arrays.toString()`.
  
- **ArrayAsParameter.java**  
  Demonstra como passar múltiplos valores para métodos em Java utilizando arrays e varargs (`int...`), e como iterar sobre esses valores para realizar operações.

- **ArrayException.java**  
  Demonstra exceções comuns ao acessar índices inválidos em arrays, como `ArrayIndexOutOfBoundsException`, ao tentar acessar índices negativos ou fora do limite do array.

- **ArraysUtils.java**  
  Apresenta utilitários da classe `Arrays` do Java, incluindo preenchimento com `fill`, ordenação com `sort`, busca com `binarySearch`, cópia com `copyOf` e exibição com `toString`.

- **ArrayWithDifferentSizes.java**  
  Demonstra a criação e iteração de arrays bidimensionais com tamanhos variados em cada linha, ilustrando como trabalhar com arrays "irregulares" (ou jagged arrays) em Java.

- **DimensionsArray.java**  
  Demonstra a criação e inicialização de arrays unidimensionais, bidimensionais e tridimensionais. Também mostra uma forma alternativa de iniciar arrays multidimensionais e como iterar sobre um array 2D.

- **IncrementArray.java**  
  Mostra a diferença entre passar tipos primitivos e arrays como argumentos em métodos. Mostra como arrays são passados por referência (alterações persistem) enquanto tipos primitivos são passados por valor (alterações não persistem).

- **InterationArray.java**  
  Demonstra duas formas de iterar sobre arrays: com um loop `for` tradicional usando índices e com o `enhanced for` (for-each).
  
# Exercicios
## Exercício: Implemente o algoritmo Bubble Sort

### Enunciado 
Implemente o algoritmo Bubble Sort para ordenar os elementos de um array.
De forma geral, o Bubble Sort compara cada elemento com o seu vizinho à direita, trocando-os se o vizinho for menor.

## Exercício: Análise de preço
### Enunciado 
Crie uma classe `Item` com os atributos `nome` e `preço`.
Crie um método que recebe um array de `Item` e retorna um novo array com três informações:
1. O item com o menor preço
2. O item com o maior preço
3. A média dos preços dos itens


## Objetivo
Reforçar a compreensão dos conceitos fundamentais de arrays em Java por meio de exemplos simples e claros.
