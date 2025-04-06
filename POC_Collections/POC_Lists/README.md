# 📚 POC_Lists

Este diretório contém exemplos práticos de uso das interfaces `List`, `ArrayList` e `LinkedList` em Java. Cada classe demonstra um conceito específico do uso de listas.

## 📄 Classes
### `Comparable` (PersonList, Person, PeopleComparator)
Demonstra o uso das interfaces `Comparable` e `Comparator` para ordenação de objetos.  
A classe `Person` implementa `Comparable` para ordenação por idade.  
A classe `PeopleComparator` implementa `Comparator` para ordenação por nome.  
A classe `PersonList` cria e ordena uma lista de pessoas usando ambas as abordagens.

### `Comparator` (OrganizeListComparator, DescendingComparator)

Demonstra o uso da interface `Comparator` para ordenação personalizada de listas.
- `DescendingComparator`: implementa `Comparator` para ordenar inteiros em ordem decrescente.
- `OrganizeListComparator`: demonstra várias formas de ordenar listas:
  - Usando classe externa (`DescendingComparator`)
  - Inversão de ordem com `.reversed()`
  - Ordenação com expressões lambda
  - Ordenação padrão com `Comparator.naturalOrder()` e `Comparator.reverseOrder()`

- **Conversion.java**  
  Demonstra como converter entre arrays e listas em Java utilizando `Arrays.asList()` e `List.toArray()`. Destaca a necessidade de usar `Integer[]` ao invés de `int[]` para compatibilidade com métodos genéricos.

- **ImmutableList.java**  
  Demonstra a criação de listas imutáveis com `List.of()` e a diferença em relação a listas mutáveis como `ArrayList`. Mostra que operações como `add` e `remove` não são permitidas em listas imutáveis.

- **IteratingList.java**  
  Demonstra diferentes formas de iterar sobre uma lista: usando um loop `for` tradicional e um `Iterator`. Também mostra como remover elementos com segurança durante a iteração usando `iterator.remove()`.

- **ListEssentials.java**  
  Demonstra operações básicas com listas em Java utilizando `LinkedList`: adicionar, acessar e remover elementos, além de iterar sobre a lista com um loop `for-each`.

- **OrganizeList.java**  
  Demonstra a ordenação de listas mutáveis em Java utilizando `Collections.sort()` com elementos que implementam `Comparable`, além de exemplos de comparação com `Integer.compare` e `String.compareTo`.

- **RelationsBetweenLists.java**  
  Demonstra operações entre listas mutáveis em Java como `addAll`, `retainAll` e `removeAll`, mostrando como combinar, filtrar e remover elementos comuns entre coleções.

## Objetivo  
Reforçar a compreensão dos conceitos fundamentais de listas (`List`) em Java, incluindo criação, ordenação, imutabilidade, conversões, iteração e operações entre listas, por meio de exemplos práticos e didáticos.
