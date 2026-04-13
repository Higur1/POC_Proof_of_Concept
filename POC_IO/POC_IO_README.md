# POC_IO — Entrada e Saída (I/O) em Java

## Propósito

Estudo de operações de I/O em Java: manipulação de arquivos e diretórios via `java.nio.file` e fluxos de dados (byte streams e character streams) via `java.io`.

---

## Estrutura

```
POC_IO/
├── POC_Archives_and_Directory/
│   ├── examples/   # Operações com Path, Files, DirectoryStream
│   └── exercises/  # CalculatingDirectorySize, CreateTimestampedFiles
└── POC_Streams/
    ├── examples/
    └── exercises/  # ConsoleInputToFile, TransformingFileContent
```

---

## Submódulos

| Submódulo | Foco |
|-----------|------|
| `POC_Archives_and_Directory` | `Path`, `Files`, listagem e manipulação de diretórios |
| `POC_Streams` | `InputStream`, `OutputStream`, `Reader`, `Writer` — leitura e escrita de dados |

---

## Examples vs Exercises

| | `examples/` | `exercises/` |
|-|-------------|--------------|
| **O quê** | APIs de arquivo e stream com casos básicos | Combinação de operações em problemas práticos |
| **Como usar** | Referência de sintaxe e comportamento | Praticar composição de streams |

---

## Como estudar

Estude `POC_Archives_and_Directory` primeiro (nível de sistema de arquivos), depois `POC_Streams` (nível de bytes/caracteres).
