# POC_Threads_Concurrency — Threads e Concorrência em Java

## Propósito

Estudo de programação concorrente em Java: criação e ciclo de vida de threads, sincronização, problemas clássicos de concorrência e recursos do `java.util.concurrent`.

---

## Estrutura

```
POC_Threads_Concurrency/
├── POC_Thread_Fundaments/
│   ├── examples/
│   └── exercises/  # GregoryPi
├── POC_Synchronized/
│   ├── examples/   # Cache, CounterConcurrency, FrogRace, PingPong,
│   │               # ProducerAndConsumerWithCallable
│   └── exercises/  # ProducerConsumerProblem, ThreadSafeAppender,
│                   # ThreadSafePrinter
└── POC_Other_Topics_Thread/
    └── examples/
```

---

## Submódulos

| Submódulo | Foco |
|-----------|------|
| `POC_Thread_Fundaments` | `Thread`, `Runnable`, `Callable`, `Future`, estados do ciclo de vida |
| `POC_Synchronized` | `synchronized`, `wait`/`notify`, `Lock`, problemas de race condition |
| `POC_Other_Topics_Thread` | `ExecutorService`, `ThreadPool`, `CompletableFuture` e outros |

---

## Examples vs Exercises

| | `examples/` | `exercises/` |
|-|-------------|--------------|
| **O quê** | Padrões clássicos de concorrência implementados | Problemas que exigem sincronização correta |
| **Como usar** | Analisar a coordenação entre threads | Identificar e resolver race conditions |

---

## Como estudar

Siga a ordem: Fundaments → Synchronized → Other Topics. Concorrência é cumulativa — não pule etapas.
