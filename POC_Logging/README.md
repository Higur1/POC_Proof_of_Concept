# 📚POC_Logging

Este módulo faz parte do repositório [`POC_Proof_of_Concept`](https://github.com/Higur1/POC_Proof_of_Concept) e tem como objetivo demonstrar o uso de **loggers** em Java. O uso de logs é uma prática fundamental no desenvolvimento de sistemas, pois permite o monitoramento e rastreamento de aplicações, facilitando a depuração e análise de comportamento. Cada subpasta contém exemplos específicos, organizados por tipo de logging e implementação.

---

## 🛠️ logback.xml

Arquivo de configuração do Logback responsável por definir como os logs serão tratados e exibidos durante a execução da aplicação.

Este arquivo contém:

- **Formatadores de Data e Hora** com uso de `<timestamp>` para customizar os nomes dos arquivos de log com base no tempo.
- **Vários appenders**:
  - `console1`, `console2`, `console3`: exibem logs no console com diferentes formatações e cores.
  - `file1`, `file2`: gravam logs em arquivos. `file2` utiliza timestamp no nome do arquivo.
  - `rollingFile1`: grava logs com rotação diária e histórico limitado.
- **Loggers hierárquicos** com controle de `additivity` para evitar duplicidade de logs.
- **Níveis de log personalizados** para diferentes componentes como `FileAppender`, `TimestampFileAppender` e `RollingFileAppender`.
Essas configurações possibilitam flexibilidade na gestão e análise de logs, facilitando o monitoramento e depuração de aplicações Java.

## Classes
### 📄 **FileAppender.java**

Demonstra o uso da biblioteca `SLF4J` para realizar o log de mensagens em diferentes níveis de severidade.  
Utiliza o `LoggerFactory` para criar um logger nomeado `"FileAppender"`.
Essa classe serve como exemplo básico de como configurar e emitir logs, sendo útil para diagnósticos, depuração e monitoramento de aplicações Java.

---

### **RollingFileAppender.java**  
  Demonstra a configuração e uso de um logger com suporte à rotação de arquivos utilizando `logback` e `SLF4J`.  
  A classe envia mensagens de log em todos os níveis (`TRACE`, `DEBUG`, `INFO`, `WARN`, `ERROR`) para um logger nomeado `"RollingFileAppender"`, que está configurado para gravar em um arquivo com rotação baseada em tempo (diária), mantendo histórico e limite de tamanho de armazenamento.  
  Ideal para aplicações que exigem persistência de logs com controle sobre crescimento de arquivos.

---

### **DetectLogLevel.java**  
  Demonstra como verificar se um nível de log está habilitado antes de executar operações custosas.  
  Usa os métodos `isInfoEnabled()` e `isEnabledForLevel(Level.INFO)` para evitar chamadas desnecessárias quando o nível de log `INFO` não está ativo.  
  Inclui um exemplo com uma simulação de cálculo demorado para ilustrar o benefício de evitar a execução quando o log não será registrado.

---

### **ErrorLogger.java**  
  Demonstra como capturar e registrar exceções utilizando SLF4J.  
  Lança propositalmente uma `RuntimeException` e a captura no bloco `catch`, registrando a mensagem de erro com `LOGGER.error()`.  
  Mostra também como incluir a stack trace completa da exceção no log, passando o objeto `Throwable` como segundo argumento.

---

### **HierarchyLogger.java**  
  Demonstra o uso de loggers hierárquicos com SLF4J e Logback.  
  Utiliza um logger nomeado `"x.y"`, que faz parte de uma hierarquia baseada em nomes, como `"x"` e `"x.y"`.  
  Mostra como configurar níveis de log e appenders distintos para diferentes níveis da hierarquia no `logback.xml`, permitindo controle granular sobre o comportamento do log.  
  Exibe mensagens em todos os níveis (`TRACE`, `DEBUG`, `INFO`, `WARN`, `ERROR`) para testar a configuração hierárquica dos loggers.

---

### **ParameterLogger.java**  
  Demonstra a maneira correta de utilizar parâmetros em mensagens de log com SLF4J.  
  Utiliza placeholders `{}` em vez de concatenar strings manualmente, o que melhora a performance e evita a avaliação desnecessária de expressões quando o nível de log está desativado.  

----

### **RootLogger.java**  
  Demonstra o uso do *Root Logger*, que é o logger base na hierarquia de log do SLF4J.  
  Quando você cria um logger com o nome `"RootLogger"`, ele **não é o logger raiz verdadeiro**. O *root logger real* é aquele sem nome ou com nome `"ROOT"` (dependendo da implementação, como Logback).  

  Todos os loggers herdam do *root logger*, e ele define o nível mínimo de log para toda a aplicação (a menos que sobrescrito).  
  
---

## Exercícios

## Exercício: Log de Mensagens
### Enunciado
Crie duas classes (ClassA e ClassB) com um método chamado `log()`, que registre uma mensagem de exemplo.

- A mensagem registrada pelo logger na `ClassA` deve ser exibida no console.
- A mensagem registrada pelo logger na `ClassA` deve ser escrita em um arquivo.

### Requisitos:
- A classe `ClassA` deve ter um método `log()` que imprime a mensagem no console e grava no arquivo.
- A classe `ClassB` pode ser uma classe auxiliar ou um exemplo adicional de como registrar mensagens, mas o foco principal está na implementação da `ClassA`.

--- 

## Objetivo

Fornecer exemplos claros e didáticos sobre o uso de **logging** em Java, abordando desde o uso básico da API de logging até a integração com frameworks mais avançados. O objetivo é garantir boas práticas de logging, ajudando no rastreamento de problemas e no monitoramento eficaz das aplicações.
