## 🧩 POC_Modules_Distribution
Este repositorio tem como objetivo demonstrar e organizar a estrutura de um projeto que utiliza múltiplas subpastas/módulos, focando em como distribuir diferentes responsabilidades, como lógica de aplicação e segurança, em diretórios separados.

## Estrutura
- **application**: Contém o código-fonte principal da lógica de negócio ou da funcionalidade central da aplicação.

- **security**: Contém o código-fonte relacionado à segurança (por exemplo, autenticação, autorização, filtros de segurança) de forma abstrata ou de interfaces.

- **securityImpl**: Contém a implementação concreta ou a lógica detalhada dos serviços de segurança definidos no módulo security/src.

## 🎯 Objetivo
Demonstrar uma abordagem de modularização onde as responsabilidades da aplicação (como a lógica de negócio e a segurança) são segregadas em diferentes módulos ou diretórios. Este padrão facilita a organização, manutenção e possível reutilização ou substituição de componentes (por exemplo, a implementação de segurança).

Serve como um exemplo prático de como estruturar repositórios complexos em que a distribuição clara de módulos é essencial para a arquitetura do projeto.
