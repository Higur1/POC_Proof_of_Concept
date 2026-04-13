# POC_JDBC — Java Database Connectivity

## Propósito

Estudo do acesso a bancos de dados relacionais via JDBC. Cobre desde conexão básica até padrões como DAO, transações, batch updates e metadados.

---

## Estrutura

```
POC_JDBC/
├── POC_JDBC_Fundaments/
│   └── examples/
├── POC_JDBC_Metadata/
│   └── examples/
├── POC_JDBC_Transactions/
│   └── examples/
├── POC_JDBC_Updates_Batch/
│   └── examples/
├── POC_JDBC_Task_Registration/
│   └── examples/
└── POC_JDBC_Framework_With_DAO/
    └── examples/   # applications/, core/
```

---

## Submódulos

| Submódulo | Foco |
|-----------|------|
| `POC_JDBC_Fundaments` | `Connection`, `Statement`, `ResultSet` — operações básicas |
| `POC_JDBC_Metadata` | `DatabaseMetaData`, `ResultSetMetaData` |
| `POC_JDBC_Transactions` | `commit`, `rollback`, isolamento de transações |
| `POC_JDBC_Updates_Batch` | `addBatch`, `executeBatch` — performance em massa |
| `POC_JDBC_Task_Registration` | Aplicação prática de CRUD |
| `POC_JDBC_Framework_With_DAO` | Padrão DAO com camadas `core` e `applications` |

---

## Examples vs Exercises

Este módulo é majoritariamente orientado a `examples/` (código funcional completo). O aprendizado ocorre pela leitura e execução das aplicações de exemplo.

---

## Como estudar

Percorra os submódulos na ordem listada acima — cada um adiciona uma camada de complexidade sobre o anterior.
