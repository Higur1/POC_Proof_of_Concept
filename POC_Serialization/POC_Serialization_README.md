# POC_Serialization — Serialização em Java

## Propósito

Estudo de serialização de objetos Java: API nativa (`Serializable`, `ObjectOutputStream`) e serialização JSON via Jackson (`ObjectMapper`, anotações `@JsonProperty`, `@JsonIgnore`).

---

## Estrutura

```
POC_Serialization/
├── POC_Native_API/
│   ├── examples/
│   └── exercises/  # GenerateAndSaveRandomNumbers
└── POC_Jackson_API_JSON/
    ├── examples/
    └── exercises/  # InstantiateGeometricShapesFromJSONConfiguration,
                   # SerializeAndDeserializeASetOfBooksInJSON
```

---

## Submódulos

| Submódulo | Foco |
|-----------|------|
| `POC_Native_API` | Serialização binária nativa — `Serializable`, `serialVersionUID`, `transient` |
| `POC_Jackson_API_JSON` | Serialização JSON — mapeamento de objetos, anotações Jackson |

---

## Examples vs Exercises

| | `examples/` | `exercises/` |
|-|-------------|--------------|
| **O quê** | API de serialização com objetos simples | Serialização em cenários mais complexos (herança, coleções) |
| **Como usar** | Referência de configuração e anotações | Implementar antes de consultar |

---

## Como estudar

Comece pela API nativa para entender o conceito. Em seguida, estude Jackson — mais relevante para aplicações modernas com REST.
