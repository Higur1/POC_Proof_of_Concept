# POC — Java Study Repository

Repositório de estudos Java organizado em módulos temáticos. Cada módulo cobre um tópico específico da linguagem, com exemplos comentados e exercícios práticos.

> **Contexto:** Referência pessoal de estudo. Não é uma biblioteca de produção.

---

## Módulos

| Módulo | Tópico |
|--------|--------|
| `POC_Annotations` | Anotações customizadas e Reflection |
| `POC_Collections` | Arrays, Lists, Maps, Sets |
| `POC_DateTime` | API de datas moderna e legada |
| `POC_Generics` | Tipos genéricos e bounded wildcards |
| `POC_IO` | Arquivos, diretórios e streams de I/O |
| `POC_InnerClass` | Classes internas (regular, anônima, local, estática) |
| `POC_Internationalization` | Locale, formatação e i18n |
| `POC_JDBC` | Conexão com banco de dados via JDBC |
| `POC_Lambda` | Lambdas, functional interfaces e Optional |
| `POC_Logging` | Log4j/SLF4J — configuração e appenders |
| `POC_Modules_Distribution` | Sistema de módulos Java (JPMS) |
| `POC_Reflection` | Reflection API — inspeção e manipulação de objetos |
| `POC_SQL` | SQL: consultas, DML e modelo relacional |
| `POC_Serialization` | Serialização nativa e Jackson (JSON) |
| `POC_Stream_API` | Stream API — operações intermediárias e terminais |
| `POC_Threads_Concurrency` | Threads, sincronização e concorrência |

---

## Estrutura padrão

```
POC_<Módulo>/
├── examples/       # Código demonstrativo, com comentários explicativos
└── exercises/      # Problemas resolvidos — aplicação dos conceitos
    └── <NomeExercicio>/
```

Módulos maiores possuem **submódulos** que seguem o mesmo padrão internamente.

---

## Como navegar

1. Escolha um módulo pelo tópico de interesse.
2. Leia `examples/` para entender o conceito.
3. Consulte `exercises/` para ver aplicações práticas.
4. Módulos com submódulos têm seus próprios READMEs.
