# 📚 POC_Generics

Este diretório contém exemplos práticos de uso de **Generics** em Java. O objetivo é demonstrar como utilizar tipos genéricos para criar código reutilizável, seguro e mais flexível. As implementações incluem tanto exemplos básicos quanto exercícios práticos.

---

## 📁 Estrutura

- **`/examples`**  
  Contém implementações simples e didáticas para ilustrar o funcionamento dos generics em diferentes contextos.

- **`/exercises`**  
  Conjunto de exercícios para praticar o uso de generics, estimulando a escrita de código genérico e reutilizável.

---

## 📄 Exemplos

---

### `Buffer.java`
`Buffer<T>` é uma estrutura de dados genérica que utiliza `LinkedList` para armazenar elementos de forma sequencial.  
Ela oferece métodos para adicionar elementos (`add`), remover elementos de forma segura (`remove` com `Optional`) e transformar o conteúdo para outro tipo com o método `transform(Function<T, K>)`.

Essa classe é útil para manipulação de dados em fluxo, onde o conteúdo precisa ser consumido (FIFO) e possivelmente transformado em outro formato/tipo.  
Utiliza princípios de programação funcional e generics para oferecer segurança de tipo e flexibilidade.

#### Detalhes técnicos
- A lista interna é baseada em `LinkedList<T>`, garantindo operações eficientes de inserção e remoção no início e fim da fila.
- O método `remove()` verifica se a lista está vazia antes de tentar remover, retornando `Optional.empty()` em vez de `null`, evitando exceções como `NoSuchElementException`.
- O método `transform(Function<T, K>)` permite transformar os elementos do buffer de tipo `T` para qualquer outro tipo `K`.
  - Utiliza a `Stream API` com `map()` para aplicar a função de transformação.
  - Gera uma nova instância de `Buffer<K>` com os elementos já convertidos.
- A classe mantém encapsulamento e imutabilidade parcial, já que a lista interna só é acessada por meio dos métodos públicos definidos.
- É possível encadear transformações criando novos buffers a partir de anteriores, sem modificar o original.

---
 
### `BufferTransform.java`
A classe `BufferTransform` demonstra como utilizar a classe genérica `Buffer<T>` em conjunto com o método `transform(Function<T, K>)` para converter elementos de um tipo para outro.  
No exemplo, elementos `Integer` são transformados em `String` utilizando uma função lambda, evidenciando o uso de programação funcional com `Buffer`.

#### Detalhes técnicos
- Cria uma instância de `Buffer<Integer>` e adiciona dois elementos inteiros: `10` e `20`.
- Utiliza o método `transform` para converter cada `Integer` em uma `String` formatada com sublinhados, através da expressão `e -> "_" + e + "_"`.
- O resultado é um novo `Buffer<String>`, mantendo o conteúdo original intacto.
- Os elementos transformados são removidos e exibidos usando `System.out.println()` com `orElseThrow()` para garantir que um valor esteja presente.

---

### `DriveVehicleProblem.java`
A classe `DriveVehicleProblem` demonstra o uso de herança e listas genéricas em Java, ilustrando um problema comum relacionado a tipos genéricos invariantes.  
O exemplo mostra que o método `driveVehicles(List<Vehicle>)` aceita apenas listas exatamente do tipo `List<Vehicle>`, e não listas de subtipos como `List<Vehicle.Car>`.

#### Detalhes técnicos
- Define duas classes internas: `Vehicle.Bus` e `Vehicle.Car`, ambas herdando de `Vehicle`.
- Cria uma lista `List<Vehicle>` contendo instâncias de `Bus` e `Car`, e passa para o método `driveVehicles`, que itera e chama o método `drive()` de cada veículo.
- Em seguida, é criada uma lista específica `List<Vehicle.Car>`, contendo apenas objetos `Car`.
- A tentativa de passar essa lista para `driveVehicles` resulta em erro de compilação, pois Java trata generics como invariantes.
  - Ou seja, `List<Vehicle.Car>` **não é** subtipo de `List<Vehicle>`, mesmo que `Car` seja subtipo de `Vehicle`.

---
### `DriveVehicleSolution.java`
A classe `DriveVehicleSolution` demonstra como solucionar o problema de invariância em generics usando o operador wildcard (`? extends`).  
Ao modificar o método `driveVehicles` para aceitar qualquer tipo que estenda `Vehicle`, a classe passa a aceitar listas como `List<Vehicle.Bus>`, `List<Vehicle.Car>`, além de `List<Vehicle>`.

#### Detalhes técnicos
- A versão anterior do método `driveVehicles(List<Vehicle>)` não permitia o uso de listas de subtipos, como `List<Vehicle.Bus>`.
- Ao substituir o parâmetro por `List<? extends Vehicle>`, o método agora aceita listas de qualquer tipo que herde (ou implemente) `Vehicle`.
- Isso demonstra o uso correto do wildcard `? extends`, que oferece maior flexibilidade ao trabalhar com listas genéricas.
- A linha `List<? extends Vehicle> vehicles1 = new ArrayList<Vehicle.Car>();` mostra um exemplo adicional de como declarar uma lista usando wildcards.

---
### `ExtendsRules.java`
A classe `ExtendsRules` demonstra uma regra importante ao usar wildcards (`? extends`) em listas genéricas em Java:  
**quando se utiliza `? extends`, não é possível adicionar elementos à lista.**

Esse comportamento é conhecido como *"Producer Extends"*, pois listas do tipo `? extends T` são seguras apenas para leitura (leitura como `T`), mas não para escrita.

#### Detalhes técnicos
- Cria uma lista de `Vehicle` e adiciona normalmente instâncias de `Bus` e `Car`.
- Em seguida, cria uma lista `List<? extends Vehicle>` apontando para uma `ArrayList<Vehicle.Car>`.
- Qualquer tentativa de adicionar elementos à lista com wildcard resulta em erro de compilação.
- É possível apenas **ler** ou **remover** elementos dessa lista, mas não adicionar novos.

---
## `GenericBuffer.java`
A classe `GenericBuffer` demonstra o uso da classe genérica `Buffer<T>` com diferentes tipos de dados, como `String` e `Boolean`.  
Ela ilustra a versatilidade do uso de generics em Java, permitindo que uma mesma estrutura (`Buffer`) seja reutilizada com diferentes tipos de conteúdo.

#### Detalhes técnicos
- A classe `Buffer<T>` é uma estrutura FIFO (first-in-first-out) genérica, baseada em `LinkedList<T>`.
- Neste exemplo, dois buffers são criados:
  - `Buffer<String>` para armazenar e remover strings.
  - `Buffer<Boolean>` para armazenar valores booleanos.
- O método `remove()` retorna um `Optional<T>`, o que evita `NullPointerException` ao remover de uma lista vazia.
- O uso de `orElse(null)` mostra como acessar o valor removido (ou retornar `null` se o buffer estiver vazio).

---

## `GenericObj.java`
A classe `GenericObj` demonstra o uso de uma classe sem generics (`Holder`) que armazena objetos do tipo `Object`.  
Ela mostra como é necessário realizar **casting manual** ao recuperar os objetos, o que pode causar erros em tempo de execução se o tipo estiver incorreto.

#### Detalhes técnicos
- A classe `Holder` (não genérica) armazena qualquer objeto usando o tipo `Object`.
- Para acessar os dados corretamente, é necessário fazer **casting explícito** ao tipo desejado.
- Isso pode resultar em `ClassCastException` se o tipo não for compatível.
- O exemplo mostra o armazenamento de um `String` e de um `Integer`, com os castings adequados.

---

## `GenericT.java`
A classe `GenericT` demonstra como o uso de **Generics** com a classe `HolderGenerics<T>` melhora a segurança de tipo em tempo de compilação e elimina a necessidade de **casting explícito**.  
Esse exemplo compara diretamente com a abordagem anterior (`GenericObj`), evidenciando os benefícios de se trabalhar com generics em Java.

#### Detalhes técnicos
- A classe `HolderGenerics<T>` é genérica e armazena objetos de um tipo específico definido no momento da instanciação.
- Isso garante:
  - **Segurança de tipo**: os dados recuperados sempre serão do tipo esperado.
  - **Ausência de casting**: o compilador já sabe o tipo de retorno.
  - **Erros capturados em tempo de compilação**

---
## `Holder.java`

A classe `Holder` é uma **classe auxiliar simples** usada para armazenar **qualquer tipo de objeto**.  
Ela é útil para entender como funciona o armazenamento genérico sem o uso de generics (`<T>`), servindo como base para comparar com versões mais seguras, como a `HolderGenerics`.

---
## `HolderGenerics.java`

A classe `HolderGenerics<T>` é uma **versão genérica** da classe `Holder`.  
Ela permite armazenar objetos de qualquer tipo, mas com **segurança de tipo** em tempo de compilação.

Essa classe serve como exemplo prático de como **generics** funcionam em Java e como são tratados após a compilação por meio do processo conhecido como **Type Erasure**.

---
## `Vehicle.java`

A classe `Vehicle` é uma classe **abstrata** que define o comportamento genérico de um veículo com o método `drive()`.

Ela serve como uma **superclasse base** para outros tipos específicos de veículos, como `Bus` e `Car`, que **implementam** seu próprio comportamento de direção.

---
## `WildcardObject.java`
Demonstra o uso de **wildcards** (`?`) em listas genéricas no Java.  
Mostra como o uso de `? extends Object` ou `?` impede a adição de novos elementos, mesmo sendo listas de tipos conhecidos como `String`.

#### Detalhes Técnicos
- `List<? extends Object>` permite que a lista se refira a qualquer tipo que **estenda `Object`** (como `String`, `Integer`, etc.).
- Ao utilizar `? extends`, **não é possível adicionar novos elementos** na lista.  
  Isso acontece porque o compilador **não sabe qual é o tipo exato**, apenas que ele "estende Object".
- `List<?>` é sinônimo de `List<? extends Object>` e também **não permite adições**.
- A única operação segura é **leitura**, pois todos os elementos da lista são garantidamente `Object`.

---
## WildcardObjectSuper.java

Demonstra o uso de **wildcards com `extends` e `super`** em listas genéricas no Java.  
Mostra como `? extends` (upper bound) e `? super` (lower bound) afetam a leitura e escrita em coleções genéricas.

#### Detalhes Técnicos

##### `? extends` (Upper Bound)
- Define um limite superior, permitindo **leitura segura**, mas **impede inserções**.
- Exemplo: `List<? extends Vehicle>` pode referenciar uma lista de `Vehicle`, `Car` ou `Bus`.
- Não é possível adicionar elementos porque o compilador **não sabe o tipo exato da lista**.

---
## 🧠 Exercícios

### Exercício: Fechar Recursos com a Interface Closeable

#### Enunciado
Implemente um método chamado `closeAll()` que recebe uma lista de objetos e fecha todos eles.  
Esses objetos devem ser instâncias de uma classe que implemente a interface `Closeable` do Java.

---

### Exercício: Classe Matrix com Generics

#### Enunciado
Implemente a classe `Matrix` que representa uma matriz 3x3.  
O tipo de dados dos elementos da matriz deve ser parametrizado usando generics.

Implemente os seguintes métodos para interagir com a matriz:

- **print()**: Imprime os elementos da matriz na tela.
- **set()**: Define o valor de um elemento em uma linha e coluna específicas da matriz.

---

## 🎯 Objetivo

Reforçar a compreensão dos conceitos fundamentais de **Generics** em Java:
- Criação e uso de classes e métodos genéricos.
- Reutilização de código com segurança de tipos em tempo de compilação.
- Maior flexibilidade ao lidar com diferentes tipos de dados em estruturas e operações genéricas.

---

