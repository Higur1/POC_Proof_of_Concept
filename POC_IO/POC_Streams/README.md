# 📚POC_Streams

Esta pasta contém exemplos de uso das streams de entrada e saída (`InputStream` e `OutputStream`) da linguagem Java, incluindo operações com arquivos binários e manipulação de buffers.

## Conteúdo

- Leitura e escrita de arquivos com `FileInputStream` e `FileOutputStream`
- Uso de `BufferedInputStream` e `BufferedOutputStream` para desempenho otimizado
- Escrita e leitura com `DataOutputStream` e `DataInputStream`
- Criação e manipulação de streams temporários
- Manipulação de bytes em arquivos

## Classes
- **BufferedReaderWriter.java**  
  Demonstra o uso das classes `BufferedReader` e `BufferedWriter` para leitura e escrita eficientes em arquivos de texto.  
  Mostra a diferença entre utilizar `FileWriter` diretamente (várias operações de I/O) e `BufferedWriter` (uso de buffer, reduzindo chamadas de I/O).  
  Também exemplifica o uso de `flush()` para garantir a escrita dos dados, além da leitura com `BufferedReader` e manipulação de `Charset` com `StandardCharsets.UTF_8`.

- **ByteTransfer.java**  
  Demonstra o uso de fluxos de bytes (`InputStream` e `OutputStream`) para transferência de dados entre diferentes fontes e destinos.  
  Mostra como usar `ByteArrayInputStream` para criar uma entrada a partir de uma string e como transferir os dados para um arquivo com `FileOutputStream`.  
  Também demonstra o uso de `ByteArrayOutputStream` para armazenar os dados na memória e a conversão de bytes para string usando o `Charset` UTF-8.

- **ConsoleReadApp.java**  
  Demonstra a leitura de entrada do console utilizando duas abordagens: `BufferedReader` e `Scanner`.  
  A classe mostra como capturar uma linha de texto do usuário, processá-la (invertendo a string) e exibi-la no console.  
  Também é ilustrado o uso de `StringBuilder` para manipulação de strings e a captura de exceções relacionadas ao fechamento de streams.

- **FileIOStream.java**  
  Demonstra o uso das classes `FileInputStream` e `FileOutputStream` para transferir dados em formato de bytes entre arquivos.  
  A classe mostra como ler um arquivo de entrada e escrever seus dados em um novo arquivo de saída.  
  A abordagem baseada em bytes é útil para transferir informações de qualquer tipo, como arquivos binários (por exemplo, executáveis, músicas, PDFs, imagens).  
  O exemplo utiliza a interface `AutoCloseable` para garantir o fechamento adequado dos recursos.

- **FileReaderWriter.java**  
  Demonstra o uso das classes `FileReader` e `FileWriter` para leitura e escrita de arquivos de texto.  
  A classe exemplifica como escrever uma string em um arquivo de texto utilizando `FileWriter` com codificação `UTF-8` e como ler o conteúdo de um arquivo com `FileReader`.  
  A utilização da interface `AutoCloseable` garante que os recursos sejam fechados automaticamente, evitando vazamentos de memória.  
  O exemplo mostra a leitura e escrita de texto simples, utilizando as classes de fluxo de caracteres em Java.

- **IOOperations.java**  
  Contém métodos utilitários para realizar operações de entrada e saída (I/O) com diferentes tipos de fluxos de dados em Java.  
  A classe inclui métodos para leitura e escrita com `Writer`, `Reader`, `BufferedReader`, e manipulação de dados binários com `InputStream` e `OutputStream`.  
  Os métodos suportam operações como leitura de texto linha por linha, escrita de strings em arquivos, leitura e escrita de bytes, e transferência de dados entre fluxos binários utilizando um buffer de 2KB.  
  A classe foi projetada para gerenciar fluxos de dados de maneira eficiente, com cuidado para não consumir muita memória ao lidar com grandes quantidades de dados.

- **IOStreamReaderWriter.java**  
  Demonstra o uso combinado de `InputStreamReader` e `OutputStreamWriter` para ler e escrever dados usando fluxos de bytes e caracteres.  
  O código ilustra como usar decoradores de design para transformar fluxos de bytes em fluxos de caracteres, utilizando `BufferedReader` e `InputStreamReader` para ler dados e convertê-los de bytes para texto. Além disso, o exemplo também mostra como usar `OutputStreamWriter` para escrever texto em um fluxo de bytes.  
  O exemplo usa um array de bytes como entrada e, após a leitura e conversão para texto, escreve os dados de volta como bytes, exibindo tanto os bytes originais quanto os convertidos.

- **PrintWriterApp.java**  
  Demonstra o uso da classe `PrintWriter` para escrever dados em um arquivo com facilidade e formatação.  
  O código mostra como criar um arquivo de saída e escrever múltiplas linhas de texto com o método `println`, além de formatar uma string com o método `format`, como no exemplo de formatação de número com zeros à esquerda. O `PrintWriter` é utilizado com o charset `UTF-8` para garantir a codificação correta dos caracteres.  
  O exemplo também ilustra o uso da interface `AutoCloseable`, garantindo que o recurso seja fechado automaticamente após o uso.

- **ScannerApp.java**  
  Demonstra o uso da classe `Scanner` para leitura de dados de um arquivo.  
  O código mostra como abrir um arquivo com o `Scanner`, utilizando o método `useDelimiter` para definir um delimitador personalizado (`|` neste caso), permitindo a leitura segmentada do conteúdo.  
  O exemplo também ilustra o uso da interface `AutoCloseable`, garantindo que o `Scanner` seja fechado automaticamente após o uso, evitando vazamentos de recursos. A leitura é feita de maneira eficiente com o método `hasNext` e `next`, que permite iterar através dos dados no arquivo de forma controlada e específica.

- **StringReaderWriter.java**  
  Demonstra o uso das classes `StringWriter` e `StringReader` para manipulação de strings em memória.  
  O código ilustra como escrever texto em uma string usando `StringWriter` e ler texto de uma string com `StringReader`, ambos os quais implementam a interface `AutoCloseable`, garantindo o fechamento automático dos recursos após o uso.  
  O exemplo utiliza a classe `IOOperations` para realizar operações de leitura e escrita, e mostra como a leitura e escrita podem ser realizadas diretamente com strings em vez de arquivos.  
  O `StringWriter` armazena os dados em memória e os imprime, enquanto o `StringReader` lê a string fornecida e a retorna como texto.

- **TryWithResources.java**  
  Demonstra o uso do recurso **try-with-resources**, uma construção do Java que permite garantir que os recursos sejam fechados automaticamente após o uso, simplificando o gerenciamento de recursos como arquivos.  
  O código mostra duas abordagens para escrever em um arquivo: uma utilizando o método tradicional, onde é necessário garantir manualmente o fechamento do recurso, e outra usando a sintaxe moderna `try-with-resources`.  
  A segunda abordagem, que utiliza `FileWriter` dentro do bloco `try`, evita a necessidade de chamadas explícitas de `close()`, garantindo o fechamento do arquivo automaticamente ao final do bloco `try`, mesmo em caso de exceções.  
  A classe também captura e imprime exceções `IOException` caso ocorram durante o processo de escrita.

# Exercicios
## Exercício: Entrada de dados pelo console salvando em arquivo.

### Enunciado 
Implemente um algoritmo que, toda vez que for executado, crie um novo arquivo em um diretório especificado.  
O nome do arquivo deve ter o prefixo `file_`, seguido pela data/hora atual do sistema e a extensão `.txt`.

## Exercício: Transformando conteúdo de arquivo.

### Enunciado
Crie um programa que leia todo o conteúdo de um arquivo chamado `data.in`.  
Assuma que esse arquivo já existe, contém dados e é um arquivo de texto.

O conteúdo lido deve ser escrito em um arquivo chamado `data.out`.  
Durante a transferência dos dados, toda vez que um ponto (".") for encontrado, deve ser adicionada uma quebra de linha no texto.

## Objetivo

Apresentar os conceitos fundamentais de streams em Java, focando na leitura e escrita de dados binários e no uso eficiente de buffers para operações de I/O.
