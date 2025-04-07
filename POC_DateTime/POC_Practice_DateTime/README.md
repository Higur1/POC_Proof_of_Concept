# 📚POC_Practice_DateTime

Esta pasta contém exemplos práticos de uso da API `java.time` em Java, aplicando os conceitos de manipulação de data e hora em cenários cotidianos. Também apresenta comparações e exemplos com a API legada de data e hora do Java, destacando suas limitações e a evolução com a API moderna.

## Conteúdo

- Prática com classes da nova API como `LocalDate`, `LocalTime`, `LocalDateTime` e `ZonedDateTime`
- Cálculos com `Period` e `Duration`
- Conversões entre tipos de data e hora
- Formatação e parsing com `DateTimeFormatter`
- Diferença entre fusos horários e manipulação de zonas
- Comparação entre a nova API (`java.time`) e a API legada (`java.util.Date`, `java.util.Calendar`, `java.text.SimpleDateFormat`)

## Classes Nova API
- **ChronoUnitApp.java**  
  Demonstra como utilizar a enumeração `ChronoUnit` para calcular diferenças entre datas com o método `between()`, retornando valores em dias e meses.  
  Mostra como adicionar unidades temporais (como horas) a objetos `LocalTime` utilizando o método `addTo()`.

- **DayOfWeekApp.java**  
  Demonstra como trabalhar com o enum `DayOfWeek`, representando os dias da semana.  
  Mostra como obter o valor numérico de um dia com `getValue()`, criar um `DayOfWeek` a partir de um número com `DayOfWeek.of()`, e navegar entre os dias com o método `plus()`.

- **InRangeApp.java**  
  Demonstra como verificar se um determinado instante (`OffsetDateTime.now()`) está dentro de um intervalo de tempo definido.  
  Cria uma data de início com `atStartOfDay()` e uma data de fim com `LocalTime.MAX`, ambas associadas ao fuso horário UTC com `atOffset(UTC)`.  
  A função `isRange()` retorna `true` se o instante atual está entre (ou é igual a) as datas de início e fim.

- **IsEqualsApp.java**  
  Demonstra a diferença entre os métodos `equals()` e `isEqual()` da classe `OffsetDateTime`.  
  O método `equals()` compara tanto a data/hora quanto o `ZoneOffset`, retornando `false` se os fusos horários forem diferentes.  
  Já `isEqual()` compara apenas o instante no tempo (em termos absolutos), retornando `true` se ambos representam o mesmo ponto na linha do tempo, mesmo com `ZoneOffsets` diferentes.

- **TruncateApp.java**  
  Demonstra como truncar um objeto `LocalTime` para uma unidade de tempo específica usando o método `truncatedTo()`.  
  No exemplo, o horário atual da zona `America/Sao_Paulo` é truncado para remover os milissegundos, mantendo apenas até os segundos com `ChronoUnit.SECONDS`.

- **YearMonthApp.java**  
  Demonstra como trabalhar com a classe `YearMonth`, que representa um ano e um mês sem o dia.  
  Mostra como criar um `YearMonth`, alterar o ano com `withYear()`, e formatar o valor resultante usando `DateTimeFormatter` no padrão "MM/yyyy".

## Sobre a Legacy DateTime API

A biblioteca antiga de data e hora do Java (`java.util.Date` e `java.util.Calendar`) apresentava diversas limitações, como:

- Imutabilidade inexistente: os objetos `Date` e `Calendar` são mutáveis, o que pode levar a bugs difíceis de rastrear.
- Nomeação confusa e pouco intuitiva (ex: `getMonth()` retorna um valor entre 0-11).
- Necessidade de múltiplas classes para tarefas simples (ex: `Calendar` para manipular e `SimpleDateFormat` para formatar).
- Complexidade no manuseio de fusos horários e cálculos temporais.

Essas limitações motivaram a introdução da API moderna (`java.time`) a partir do Java 8, que é mais segura, imutável, clara e inspirada na biblioteca Joda-Time.

## Classes Legacy API
- **DateAndInstantApp.java**  
  Demonstra como integrar a nova API de data/hora (`java.time`) com a API legada do Java (`Date` e `Calendar`).  
  Mostra como converter um `LocalDateTime` para `Instant` usando `ZoneOffset.UTC`, transformar `Instant` em `Date` e sincronizar com `Calendar`.  
  Também apresenta a conversão de volta de `Date` para `Instant`, facilitando interoperabilidade entre as APIs antigas e modernas.

- **DateApp.java**  
  Demonstra o uso da classe legada `Date` para obter o timestamp atual em milissegundos desde a Época Unix (`getTime()`).  
  Observa que muitos métodos da classe `Date` estão obsoletos e foram substituídos pela nova API de data/hora (`java.time`) a partir do Java 8.

- **DateFormatApp.java**  
  Demonstra o uso da API legada `SimpleDateFormat` para formatar e analisar (`parse`) objetos `Date`.  
  Mostra como configurar uma data específica com `Calendar`, formatar essa data em uma string no padrão `"dd/MM/yyyy HH:mm:ss"` e converter uma string nesse formato de volta para um objeto `Date`.

## Objetivo

Fixar o conhecimento sobre manipulação de datas e horas com a API moderna (`java.time`) por meio de exemplos práticos e, ao mesmo tempo, entender as diferenças e limitações da API legada para saber quando evitá-la e como fazer migrações seguras.
