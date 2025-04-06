# POC_Archives_and_Directory

Esta pasta contém exemplos de manipulação de arquivos e diretórios utilizando a API NIO (`java.nio.file`) e a API legada `java.io.File` em Java. Os exemplos abordam desde a criação de diretórios até a cópia, movimentação e verificação de arquivos no sistema de arquivos.

## Conteúdo

- Criação de arquivos e diretórios com `Files` e `Path`
- Leitura e listagem de arquivos e pastas
- Cópia, movimentação e exclusão de arquivos
- Utilização de arquivos e diretórios temporários
- Verificações com `Files.exists`, `isDirectory`, `isRegularFile`, entre outros
- Conversão entre `File` e `Path`

## Classes
- **CopyMove.java**  
  Demonstra como copiar e mover arquivos utilizando a API NIO (`Files.copy` e `Files.move`).  
  Mostra como lidar com caminhos relativos com `Path`, como usar a opção `StandardCopyOption.REPLACE_EXISTING` para sobrescrever arquivos existentes, e como estruturar os caminhos de origem e destino com base em diretórios pai e irmãos.

- **CreateDirectoryAndArchives.java**  
  Demonstra como criar diretórios e arquivos utilizando a API NIO do Java (`Files.createDirectories` e `Files.createFile`).  
  Mostra como construir uma hierarquia de diretórios com `Path.resolve`, verificar a existência de diretórios antes de criá-los e criar arquivos em locais específicos dentro dessa estrutura.

- **FileApp.java**  
  Demonstra o uso da API legada `File` para manipulação de arquivos e diretórios em Java.  
  Mostra como verificar se um caminho é um arquivo, se ele existe, obter seu nome e caminho absoluto, além de listar arquivos dentro de um diretório.  
  Também apresenta como converter entre `File` e `Path`, integrando a API legada com a NIO.

- **FileDeletion.java**  
  Demonstra como excluir arquivos utilizando a API NIO (`java.nio.file.Files`).  
  Apresenta o uso de `Files.delete(Path)` que lança exceção caso o arquivo não exista, e `Files.deleteIfExists(Path)` que evita exceções ao tentar excluir arquivos inexistentes.  
  Também destaca que não é possível excluir diretórios não vazios diretamente com esse método, pois resulta em `DirectoryNotEmptyException`.

- **FilesApp.java**  
  Demonstra como utilizar a classe utilitária `Files` da API NIO para inspecionar propriedades de arquivos.  
  Mostra como obter o caminho absoluto de um arquivo, verificar sua existência (`Files.exists`), se é um diretório ou um arquivo regular, além de verificar permissões como escrita (`isWritable`), execução (`isExecutable`) e se o caminho é um link simbólico (`isSymbolicLink`).

- **ListArchivesAndDirectory.java**  
  Demonstra como listar arquivos e diretórios usando a classe `Files` com `newDirectoryStream`.  
  Utiliza um filtro `glob` para obter todos os arquivos e diretórios do diretório atual (`Path.of("")`) e imprime cada caminho junto com a informação se é um diretório (`Files.isDirectory`).

- **PathApp.java**  
  Demonstra o uso da API `Path` para criação e manipulação de caminhos no sistema de arquivos.  
  Mostra como combinar múltiplos segmentos de caminho com `resolve`, obter caminhos absolutos com `toAbsolutePath` e diferenciação entre caminhos relativos e absolutos.  
  Também comenta exemplos adicionais como obtenção do nome do arquivo (`getFileName`) e raiz do caminho (`getRoot`).

- **TempDirectory.java**  
  Demonstra como criar diretórios e arquivos temporários usando a classe `Files` da API NIO (`java.nio.file`).  
  Utiliza os métodos `createTempDirectory` e `createTempFile` para gerar estruturas temporárias, tanto no diretório padrão do sistema quanto em um local específico.  
  Os exemplos mostram os caminhos gerados e como diferenciá-los com base no diretório raiz informado (padrão ou atual).

## Objetivo

Demonstrar o uso prático das principais funcionalidades da API de arquivos do Java, promovendo a compreensão do gerenciamento de arquivos e diretórios em aplicações Java.

