# 📚POC_Maps

Este diretório contém exemplos práticos de uso da interface `Map` e suas implementações (`HashMap`, `LinkedHashMap`) em Java. Cada classe demonstra um conceito específico relacionado a mapas, como iteração, manipulação de chaves/valores, substituição, e uso de chaves personalizadas.

## CustomClassMap (UseMap, Name)
Demonstra o uso de uma classe personalizada como chave em um `Map`.
- A classe `Name` representa um nome composto por `first` e `last`.  
  Ela implementa a interface `Comparable` para permitir ordenação alfabética, 
  e sobrescreve os métodos `equals` e `hashCode` para garantir o correto funcionamento em coleções como `HashMap` e `TreeMap`.
- A classe `UseMap` cria um `HashMap<Name, Integer>`, onde objetos `Name` são utilizados como chave.  
  Isso ilustra como diferentes instâncias com os mesmos dados são tratadas como iguais, desde que `equals` e `hashCode` estejam corretamente implementados.
> 💡 Observação: ao utilizar `TreeMap` no lugar de `HashMap`, é obrigatório que a classe `Name` implemente `Comparable`, ou será lançada uma `ClassCastException`.

- **IteratingMaps.java**  
  Demonstra diferentes formas de iteração sobre um `Map` em Java, utilizando `keySet()`, `values()` e `entrySet()` para acessar chaves, valores e pares chave-valor, respectivamente.  
  Também ilustra o uso de `LinkedHashMap` para manter a ordem de inserção dos elementos.
  
- **MapEssentials.java**  
  Demonstra operações básicas com a interface `Map` em Java, como inserção de pares chave-valor com `put()`, recuperação com `get()` e uso de `getOrDefault()` para valores ausentes.  
  Também mostra o comportamento de sobrescrita de valores quando uma chave já existe.


## Objetivo  
Reforçar a compreensão dos conceitos fundamentais de mapas (`Map`) em Java, incluindo criação, substituição de valores, recuperação segura, iteração sobre entradas, e uso de objetos personalizados como chave, por meio de exemplos práticos e didáticos.

