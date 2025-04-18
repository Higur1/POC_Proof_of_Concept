# 📚POC_InnerClass

Este módulo faz parte do repositório [`POC_Proof_of_Concept`](https://github.com/Higur1/POC_Proof_of_Concept) e tem como objetivo demonstrar o uso de **Classes Internas** em Java. As classes internas são uma forma de definir classes dentro de outras classes, oferecendo uma estrutura mais flexível e modular para seu código. O uso de classes internas permite encapsular funcionalidades específicas dentro de uma classe, tornando o código mais organizado e reutilizável.

Cada subpasta contém exemplos específicos, organizados de acordo com o tipo de classe interna utilizada.

---

# Estrutura de Classes Internas em Java

Este projeto demonstra o uso de diferentes tipos de **classes internas** em Java. As classes internas são uma maneira de agrupar classes que são usadas apenas dentro de outro objeto, proporcionando maior encapsulamento e organização do código.

## Estrutura de Pastas

- **AnonymousInnerClass**
- Demonstra o uso de **Classes Anônimas**, que são instâncias de classes sem nome. São comumente usadas quando uma implementação rápida e única é necessária.
  
#### AnonymousInnerClass.java

Demonstra o uso de **classes internas anônimas** em Java, que são implementações de interfaces ou classes abstratas sem a necessidade de uma classe nomeada separada.

- Detalhes Técnicos

- **Classes internas anônimas**: São uma maneira prática de criar uma implementação de uma interface ou classe abstrata sem a necessidade de definir uma nova classe fora do método.
- O exemplo mostra como criar e instanciar classes anônimas para implementar a interface `Message` diretamente dentro do método `main`.

#### **AnonymousInnerClassComparator.java**

Demonstra o uso de **classes internas anônimas** para implementar o **Comparator** em Java, permitindo comparar elementos sem a necessidade de uma classe separada.

####  Detalhes Técnicos

- **Classes Internas Anônimas** são úteis quando precisamos passar uma implementação de interface como o `Comparator` sem criar uma classe separada.
- O exemplo mostra como criar e utilizar uma classe anônima para comparar números em uma lista usando o método `sort` do `List`.

---
 
### **LocalInnerClass**
- Exemplo de uma **Classe Interna Local** que é definida dentro de um método. Ela pode acessar variáveis locais do método.

#### **Application.java**

- Este exemplo demonstra o uso de **classes internas locais** dentro de métodos. A classe `Greeter` é definida dentro do método `greet` e usa variáveis locais imutáveis.

####  Detalhes Técnicos

- **Classe Interna Local**: Uma classe definida dentro de um método. Ela pode acessar variáveis locais **imutáveis** da função onde foi criada.
- As variáveis locais usadas dentro de classes internas locais devem ser **efinal** (ou seja, devem ser imutáveis) para garantir a consistência e evitar modificações fora da classe.
- A classe `Greeter` é uma classe interna local que tem acesso à variável `message` (de instância) e à variável `upperName` (local e imutável).

---

### **RegularInnerClass**
- **Classe Interna Regular**: Uma classe interna que é definida dentro de outra classe. Tem acesso a todos os membros da classe externa.

#### **Operation.java**

Este exemplo demonstra o uso de **classes internas regulares** em Java. A classe `Sum` é uma classe interna regular, definida dentro da classe externa `Operation`. A classe `Sum` tem acesso a membros da classe externa, como as variáveis `value1` e `value2`.

####  Detalhes Técnicos

- **Classe Interna Regular**: Uma classe interna regular é definida dentro de outra classe e tem acesso direto aos membros (variáveis e métodos) da classe externa, mesmo que esses membros sejam privados.
- **Acesso a Membros da Classe Externa**: A classe interna regular pode acessar diretamente todas as variáveis e métodos da classe externa, independentemente de sua visibilidade (mesmo membros privados).
- No exemplo, a classe `Sum` usa os valores `value1` e `value2` da classe externa `Operation` para realizar a operação de soma.

---

### **RegularInnerClassCar**
- Demonstra uma **Classe Interna Regular** associada a um exemplo do mundo real, como um `Carro`. A classe interna pode manipular detalhes de implementação específicos do veículo.

#### **Car.java**

Este exemplo demonstra o uso de **classes internas regulares** em Java dentro de um contexto de um carro com motor e portas. A classe `Engine` é uma classe interna regular que tem acesso aos membros da classe externa `Car`, enquanto a classe `Door` é uma classe interna pública.

####  Detalhes Técnicos

- **Classe Interna Regular**: A classe `Engine` é uma classe interna regular. Ela tem acesso direto aos membros da classe externa `Car`, incluindo as variáveis privadas, como `speed` e `on`.
- **Acesso ao Membro da Classe Externa**: A classe interna `Engine` pode acessar diretamente os membros da classe externa e também pode usar o `this` para referenciar os membros da própria classe interna e `Car.this` para acessar os membros da classe externa.
- **Método `isAllOn`**: No método `isAllOn`, a classe interna usa `this.on` para acessar o atributo `on` da classe interna `Engine` e `Car.this.on` para acessar o atributo `on` da classe externa `Car`, o que demonstra como as classes internas podem acessar tanto seus próprios membros quanto os da classe externa.

---

### **StaticInnerClass**
- **Classe Interna Estática**: Uma classe interna declarada como `static`, permitindo que seja instanciada sem a necessidade de uma instância da classe externa.

#### Operation.java

Este exemplo demonstra o uso de **classe aninhada estática (static nested class)** em Java. A classe `Counter` é definida como estática dentro da classe externa `Operation`.

####  Detalhes Técnicos

- **Classe Aninhada Estática (`Counter`)**: Ao contrário das classes internas regulares, a classe aninhada estática não tem acesso direto a membros de instância da classe externa. Ela só pode acessar membros estáticos da classe externa.
- **Acesso ao Membro Estático (`initialValue`)**: A classe `Counter` utiliza o método estático `getInitialValue()` da classe `Operation` para inicializar sua variável `value`.
- **Independência de Instância**: A classe `Counter` não depende de uma instância da classe `Operation` para ser instanciada (porém, neste exemplo, ela é usada como membro de instância da `Operation`).

---

## Objetivo

Fornecer exemplos claros e didáticos sobre o uso de **Classes Internas** em Java, abordando as diferentes variações:

1. **Regular Inner Class**: Classes internas regulares podem acessar diretamente os membros da classe externa, tornando-as úteis para representar comportamentos e estados relacionados diretamente à classe externa.
2. **Anonymous Class**: As classes internas anônimas são frequentemente utilizadas quando você precisa criar uma classe para instâncias rápidas e limitadas, sem a necessidade de declarar explicitamente uma nova classe.
3. **Local Inner Class**: As classes internas locais são úteis para situações onde a classe interna é necessária apenas dentro de um método ou bloco de código específico.
4. **Static Inner Class**: As classes internas estáticas são úteis quando a classe interna não precisa acessar membros de instâncias da classe externa, mas ainda assim precisa de um escopo organizado e modular.

O objetivo é mostrar como as classes internas podem ser úteis para tornar o código mais modular e flexível, além de facilitar a implementação de comportamentos específicos sem a necessidade de criar classes externas separadas.
