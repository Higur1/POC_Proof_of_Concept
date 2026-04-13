# POC_Stream_API — Stream API em Java

## Propósito

Estudo da Stream API (`java.util.stream`): criação de streams, operações intermediárias (lazy) e operações terminais (eager). Pré-requisito: `POC_Lambda`.

---

## Estrutura

```
POC_Stream_API/
├── POC_Fundaments/
│   └── examples/
├── POC_Intermediate_Operations/
│   ├── examples/
│   └── exercises/  # StudentPassOrFailEvaluation, Top3StudentsRanking
└── POC_Terminal_Operations/
    ├── examples/
    └── exercises/  # CountCharacterOccurrencesInAString,
                   # StreamAPIQueriesOnOrdersAndProducts
```

---

## Submódulos

| Submódulo | Foco |
|-----------|------|
| `POC_Fundaments` | Criação de streams, `stream()`, `of()`, `generate()`, `iterate()` |
| `POC_Intermediate_Operations` | `filter`, `map`, `flatMap`, `sorted`, `distinct`, `limit`, `peek` |
| `POC_Terminal_Operations` | `collect`, `reduce`, `count`, `findFirst`, `anyMatch`, `Collectors` |

---

## Examples vs Exercises

| | `examples/` | `exercises/` |
|-|-------------|--------------|
| **O quê** | Cada operação demonstrada com casos simples | Pipelines completas resolvendo problemas reais |
| **Como usar** | Referência das operações disponíveis | Construir pipelines antes de consultar |

---

## Como estudar

Siga a ordem dos submódulos. As operações intermediárias só fazem sentido quando se sabe qual terminal usará ao final.
