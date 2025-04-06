# 📚POC_Sets

Este diretório contém exemplos práticos de uso da interface `Set` e suas principais implementações (`HashSet`, `LinkedHashSet`, `TreeSet`) em Java. Cada classe demonstra um conceito específico relacionado ao uso de conjuntos, como ordenação, unicidade de elementos, operações matemáticas entre conjuntos e comportamento de ordenação natural ou definida por `Comparator`.


## Classes

- **SetEssentials.java**  
  Demonstra o uso de conjuntos (`Set`) em Java, com foco em `HashSet`, destacando a ausência de ordenação e a não permissão de elementos duplicados. Inclui exemplos de inserção, iteração com `for-each`, e comentários sobre métodos úteis como `size()`, `clear()`, `contains()` e `removeAll()`.

### SetsUse (SetsUse, Account)
Demonstra o uso de objetos personalizados em coleções do tipo `Set`, com foco em como `HashSet` lida com duplicação de elementos.
- A classe `Account` representa uma conta bancária com um número (`number`) e um saldo (`balance`).  
  Ela sobrescreve os métodos `equals` e `hashCode` para garantir que contas com os mesmos dados sejam tratadas como duplicadas dentro de um `Set`.  
  Também implementa `toString()` para exibição legível das informações.
- A classe `SetsUse` cria um `HashSet<Account>` e tenta adicionar contas com os mesmos dados.  
  Isso demonstra como o `HashSet` evita duplicações baseando-se nos métodos `equals` e `hashCode`, mesmo que as instâncias sejam diferentes.
> 💡 Observação: mesmo ao usar `new Account(...)` com os mesmos dados, o `HashSet` não permitirá duplicações se `equals` e `hashCode` estiverem corretamente implementados.

## SetUseFail (SetsUse, Account)
Demonstra o impacto negativo de uma implementação incorreta do método `hashCode` ao utilizar objetos personalizados em coleções do tipo `Set`.
- A classe `Account` representa uma conta bancária com número (`number`) e saldo (`balance`).  
  Apesar de sobrescrever corretamente o método `equals`, a implementação de `hashCode` está propositalmente errada — utilizando `Math.random()` — o que gera um valor diferente a cada chamada, tornando impossível identificar duplicatas.
- A classe `SetsUse` tenta adicionar contas com os mesmos dados em um `HashSet<Account>` e verifica se elas estão presentes com `contains()`.  
  O comportamento inesperado ocorre porque o `hashCode` inconsistente impede que o `Set` reconheça corretamente objetos duplicados ou realize buscas eficazes.
> ⚠️ Atenção: Uma má implementação de `hashCode` pode comprometer profundamente o funcionamento de coleções baseadas em hash, como `HashSet` e `HashMap`, mesmo que `equals` esteja corretamente implementado.

## TreeSetUse (TreeSetEssentials, AccountOrdering, AccountComparator)
Demonstra o uso da coleção `TreeSet` com objetos personalizados, ordenando os elementos com base em critérios definidos por `Comparable` e `Comparator`.
- A classe `AccountOrdering` representa uma conta com número e saldo.  
  Ela implementa `Comparable` para ordenar por número (ordem alfabética) e sobrescreve `equals` e `hashCode` para garantir a correta funcionalidade em coleções.
- A classe `AccountComparator` implementa `Comparator<AccountOrdering>` e define a ordenação por saldo de forma decrescente.
- A classe `TreeSetEssentials` mostra dois modos de ordenar os elementos:  
  utilizando um `Comparator` externo (`AccountComparator`) ou com `Comparator.comparing()` inline, ambos priorizando o saldo ao invés do número da conta.
> 💡 Observação: Ao usar `TreeSet`, é necessário que os elementos sejam comparáveis. Isso pode ser feito implementando `Comparable` na classe ou fornecendo um `Comparator` externo. Caso contrário, uma `ClassCastException` será lançada.

# Exercicios
## Exercício: Dados Duplicados

### Enunciado 
Você possui uma lista de compras com vários itens, mas há um problema: muitos itens estão duplicados.  
Crie um método que recebe uma lista de itens e remove todos os duplicados (as alterações devem ser feitas diretamente na lista).

## Exercício: Rank

### Enunciado 
Crie uma classe **Rank** para representar o ranking de um grupo de jogadores (**Players**).
Cada jogador possui um nome e uma pontuação.

A classe **Rank** deve ter dois métodos:
- `addPlayer(Player, int)`: Adiciona um jogador ao ranking com uma pontuação específica.
- `printRanking()`: Imprime o ranking dos jogadores, mostrando o nome e a pontuação de cada jogador.

Internamente, a classe **Rank** deve classificar os jogadores em ordem decrescente de pontuação.
