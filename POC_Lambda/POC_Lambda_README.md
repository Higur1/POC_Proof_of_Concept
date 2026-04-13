# POC_Lambda — Lambdas e Programação Funcional em Java

## Propósito

Estudo de expressões lambda, interfaces funcionais (`Function`, `Predicate`, `Consumer`, `Supplier`), `Optional` e uso de lambdas com coleções. Base para entender a Stream API.

---

## Estrutura

```
POC_Lambda/
├── POC_Functional_Interface/
│   └── examples/
├── POC_Lambda_Fundaments/
│   ├── examples/   # LambdaPersonCreator
│   └── exercises/  # ConditionalExecutionBasedOnNullString,
│                   # CustomLoopWithLambda,
│                   # FilteringAListWithALambdaCondition
├── POC_Lambda_Collections/
│   ├── examples/
│   └── exercises/  # LambdaListTransformer, StringLengthMapper
└── POC_Lambda_Optional/
    ├── examples/
    └── exercises/  # OptionalPhoneBookLookup
```

---

## Submódulos

| Submódulo | Foco |
|-----------|------|
| `POC_Functional_Interface` | `@FunctionalInterface`, interfaces built-in do `java.util.function` |
| `POC_Lambda_Fundaments` | Sintaxe de lambdas, method references, closures |
| `POC_Lambda_Collections` | `forEach`, `removeIf`, `replaceAll` com lambdas |
| `POC_Lambda_Optional` | `Optional.map`, `flatMap`, `orElse`, `ifPresent` |

---

## Examples vs Exercises

| | `examples/` | `exercises/` |
|-|-------------|--------------|
| **O quê** | Sintaxe e APIs com casos demonstrativos | Problemas que exigem composição de lambdas |
| **Como usar** | Ler e executar para fixar sintaxe | Praticar sem consultar a solução primeiro |

---

## Como estudar

Siga a ordem: Functional Interface → Fundaments → Collections → Optional. Pré-requisito: conhecimento básico de interfaces.
