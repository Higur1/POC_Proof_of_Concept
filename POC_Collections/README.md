# POC_Collections — Coleções em Java

## Propósito

Estudo das principais estruturas de dados da Java Collections Framework: arrays, listas, mapas e conjuntos. Cada tipo de coleção tem seu próprio submódulo com exemplos e exercícios.

---

## Estrutura

```
POC_Collections/
├── POC_Arrays/
│   ├── examples/
│   └── exercises/  # BubbleSort, ItemPriceAnalysis, SquareTheElements
├── POC_Lists/
│   ├── examples/   # Comparable, Comparator
│   └── exercises/  # RandomAndOrderedNumbers, RemoveInactiveEmployee
├── POC_Maps/
│   ├── examples/   # CustomClassMap
│   └── exercises/  # CharCount, ConvertMap
└── POC_Sets/
    ├── examples/   # SetUseFail, SetsUse, TreeSetUse
    └── exercises/  # DuplicationData, Rank
```

---

## Submódulos

| Submódulo | Foco |
|-----------|------|
| `POC_Arrays` | Arrays primitivos e de objetos, algoritmos de ordenação |
| `POC_Lists` | `ArrayList`, `LinkedList`, ordenação com `Comparable` e `Comparator` |
| `POC_Maps` | `HashMap`, `LinkedHashMap`, `TreeMap` — chaves customizadas |
| `POC_Sets` | `HashSet`, `TreeSet` — unicidade, `equals`/`hashCode` |

---

## Examples vs Exercises

| | `examples/` | `exercises/` |
|-|-------------|--------------|
| **O quê** | Demonstração das APIs e contratos de cada coleção | Problemas que exigem escolha e uso correto da estrutura |
| **Como usar** | Leitura sequencial por submódulo | Tentar implementar antes de consultar a solução |

---

## Como estudar

Percorra os submódulos na ordem: Arrays → Lists → Maps → Sets. Cada um introduz conceitos que se apoiam nos anteriores.
