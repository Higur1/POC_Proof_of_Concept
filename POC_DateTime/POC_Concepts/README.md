# POC_Concepts

Esta pasta contém exemplos de uso da API de data e hora em Java, demonstrando como criar, manipular, formatar e calcular informações temporais com as classes do pacote `java.time`.

## Conteúdo

- Criação e manipulação de datas (`LocalDate`)
- Manipulação de horários (`LocalTime`)
- Combinação de data e hora (`LocalDateTime`)
- Uso de fusos horários (`ZonedDateTime`)
- Cálculo de períodos e durações (`Period`, `Duration`)
- Conversão e formatação de datas com `DateTimeFormatter`
- Diferença entre datas passadas, presentes e futuras

## Classes
- **DurationApp.java**  
  Demonstra o uso da classe `Duration` da API `java.time` para representar e manipular quantidades de tempo.  
  Mostra como criar durações com `ofHours()` e `ofMinutes()`, calcular a diferença entre dois horários com `Duration.between()`, e converter durações para segundos e minutos com `toSeconds()` e `toMinutes()`.

- **InstantApp.java**  
  Demonstra o uso da classe `Instant` da API `java.time` para representar um ponto específico na linha do tempo (timestamp).  
  Mostra como converter um `OffsetDateTime` em um `Instant` com `toInstant()`, obter valores de tempo em milissegundos e segundos com `toEpochMilli()` e `getEpochSecond()`, e como converter um `Instant` de volta para `OffsetDateTime` com `ofInstant()`.

- **LocalDateApp.java**  
  Demonstra o uso da classe `LocalDate` para representar datas sem hora.  
  Mostra como criar datas manualmente com `of()`, como analisar strings para datas com `parse()`, e como utilizar um `Date
  
- **LocalDateTimeApp.java**  
  Demonstra a criação e manipulação de objetos `LocalDateTime` combinando datas (`LocalDate`) e horários (`LocalTime`).  
  Mostra diferentes formas de instanciar `LocalDateTime` usando `of()`, `atTime()` e `atDate()`, além da formatação personalizada utilizando `DateTimeFormatter` no padrão brasileiro `dd/MM/yyyy HH:mm:ss`.

- **LocalTimeApp.java**  
  Demonstra a criação e manipulação de objetos `LocalTime` em Java.  
  Inclui exemplos de instanciamento com `of()`, captura do horário atual com `now()`, alteração de segundos e nanos, além de parsing e formatação personalizada utilizando `DateTimeFormatter` com diferentes padrões de hora.

- **OperationsWithLocalDateObject.java**  
  Demonstra operações com objetos `LocalDate` em Java, destacando a imutabilidade desses objetos.  
  Inclui exemplos de modificação com `withYear()`, adição com `plusYears()`, subtração com `minusDays()` e `ChronoUnit`, além de formatação personalizada com `DateTimeFormatter`.

- **OperationsWithLocalTime.java**  
  Demonstra operações com objetos `LocalTime` em Java, como adição de horas com `plusHours()` e subtração de minutos com `minusMinutes()`.  
  Também apresenta como formatar a saída de tempo utilizando `DateTimeFormatter` com um padrão personalizado.

- **PeriodApp.java**  
  Demonstra como utilizar a classe `Period` em Java para representar períodos de tempo baseados em data (anos, meses, dias).  
  Mostra como criar um `Period` com `ofYears()` e calcular a diferença entre duas datas com `Period.between()`, além de obter o total de meses com `toTotalMonths()`.

- **TimeZone.java**  
  Demonstra como associar um fuso horário a um `LocalDateTime` utilizando `OffsetDateTime`, criando horários com `ZoneOffset`.  
  Mostra como converter entre diferentes fusos horários com `withOffsetSameInstant()` e verificar se dois `OffsetDateTime` representam o mesmo instante com `isEqual()`.

- **ZonedDateTimeApp.java**  
  Demonstra como associar um `LocalDateTime` a um fuso horário utilizando `ZonedDateTime` com `ZoneId.systemDefault()`.  
  Mostra a conversão entre zonas utilizando `withZoneSameInstant()` e como representar corretamente a data e hora em diferentes regiões geográficas.

## Objetivo

Reforçar a compreensão dos conceitos fundamentais sobre datas e horários em Java por meio de exemplos simples e claros, utilizando API `java.time`.
