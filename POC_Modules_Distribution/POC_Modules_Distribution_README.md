# POC_Modules_Distribution — Sistema de Módulos Java (JPMS)

## Propósito

Estudo do Java Platform Module System (JPMS), introduzido no Java 9. Demonstra como definir módulos, declarar dependências (`requires`), expor pacotes (`exports`) e usar o mecanismo de `ServiceLoader`.

---

## Estrutura

```
POC_Modules_Distribution/
├── application/    # Módulo consumidor principal
├── security/       # Módulo de interface/contrato de segurança
└── securityImpl/   # Módulo de implementação (ServiceLoader)
```

---

## Como funciona

O projeto é dividido em três módulos interdependentes:

- **`security`** — define a interface de contrato (API pública)
- **`securityImpl`** — implementa o contrato via `ServiceLoader`
- **`application`** — consome o serviço sem depender da implementação diretamente

---

## Como estudar

1. Leia os arquivos `module-info.java` de cada módulo.
2. Trace o fluxo: `application` → `security` (interface) ← `securityImpl` (impl).
3. Observe como `ServiceLoader` desacopla interface de implementação.

> Este módulo não segue o padrão `examples/exercises` — o próprio código multi-módulo é o exemplo.
