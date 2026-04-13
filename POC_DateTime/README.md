# POC_DateTime — API de Data e Hora em Java

## Propósito

Estudo da API moderna de data/hora (`java.time`) e da API legada (`java.util.Date`, `Calendar`). Cobre conceitos fundamentais e prática com operações comuns.

---

## Estrutura

```
POC_DateTime/
├── POC_Concepts/
│   ├── examples/
│   └── exercises/  # AgeCalculator, ExpirationTimeCalculator
└── POC_Practice_DateTime/
    ├── examples/
    └── legacyDateTimeAPI/
```

---

## Submódulos

| Submódulo | Foco |
|-----------|------|
| `POC_Concepts` | `LocalDate`, `LocalDateTime`, `Period`, `Duration`, `ZonedDateTime` |
| `POC_Practice_DateTime` | Prática com cenários reais + API legada (`Date`, `Calendar`, `SimpleDateFormat`) |

---

## Examples vs Exercises

| | `examples/` | `exercises/` |
|-|-------------|--------------|
| **O quê** | Classes e métodos da API com casos de uso típicos | Cálculos de datas em cenários reais |
| **Como usar** | Leia como referência de sintaxe | Implemente o cálculo antes de ver a solução |

---

## Como estudar

1. Comece por `POC_Concepts/examples/` para dominar a API moderna.
2. Resolva os exercícios de `POC_Concepts/exercises/`.
3. Consulte `POC_Practice_DateTime/legacyDateTimeAPI/` apenas para entender código legado.
