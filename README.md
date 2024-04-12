# Challenge conversor de moedas

Aplicação para realizar a cotação de moedas usando a Exchange Rate API

## Configuração

Para configurar a API key necessária para acessar o ExchangeRate-API, siga estes passos:

1. renomei `src/config-example.yaml` para `src/config.yaml`.
2. Abra o arquivo `src/config.yaml` e substitua `INSIRA_SUA_API_KEY_AQUI` pela sua API key pessoal.

Exemplo de `config.yaml`:

```yaml
apiKey: "sua_api_key_aqui"
```

## Enum MyConsole


Uma enumeração (ou `enum`) em Java é um tipo especial que permite definir um conjunto de constantes nomeadas. Enums são usados quando você tem um conjunto fixo de valores que não mudam, como dias da semana, direções, cores, etc.

No seu caso, `MyConsole` é uma `enum` que define códigos de escape ANSI para cores e outras funções de console. Cada constante da `enum` é uma instância da própria enumeração e possui um valor associado, que é uma `String` contendo o código de escape ANSI correspondente.

Enumeração `MyConsole` representa:

- `RESET`, `ANSI_CLEAR`, `BLACK`, `RED`, etc.: São as constantes da `enum`. Cada uma delas representa um código de escape ANSI. Por exemplo, `RED` representa o código para a cor vermelha no console.
  
- `escapeCode`: É uma variável de instância da `enum`. Cada constante da `enum` tem seu próprio valor de `escapeCode` que é passado para o construtor da `enum` quando a constante é criada. No caso de `RED`, o `escapeCode` é `"\u001B[31m"`, que é o código de escape ANSI para a cor vermelha.

- `MyConsole(String escapeCode)`: Este é o construtor da `enum`. Ele é chamado automaticamente para cada constante com o valor fornecido. Por exemplo, `RED("\u001B[31m")` chama o construtor com o código de escape ANSI para vermelho.

- `public static void clearConsole()`: Um método estático que você pode chamar para limpar o console. Ele usa a constante `ANSI_CLEAR` para imprimir o código de escape ANSI para limpar o console. Note que `System.out.flush()` é usado para garantir que tudo o que está no buffer de saída do console seja realmente enviado para o console.

- `public static void printBanner(String text, MyConsole color)`: Outro método estático que você pode chamar para imprimir um texto no console com uma cor específica. Ele usa o `escapeCode` da cor fornecida, imprime o texto e, em seguida, usa `RESET.escapeCode` para redefinir a cor de volta ao padrão do console. Isso é necessário para evitar que a cor configurada se aplique a todo o texto subsequente no console.

Em Java, quando você refere uma constante de uma `enum`, você não precisa declarar o tipo da variável porque a constante é do tipo da `enum`. Por exemplo, `MyConsole.RED` é do tipo `MyConsole`.

Os códigos de escape ANSI são sequências de caracteres que, quando impressos no console, são interpretados como comandos, e não como texto normal. Eles podem instruir o console a fazer coisas como mudar a cor do texto, mover o cursor ou limpar a tela. Cada código começa com um escape character (`\u001B` ou `ESC` em ASCII) seguido por `[` e um ou mais números separados por `;`, terminado com uma letra. Por exemplo, `"\u001B[31m"` muda a cor do texto para vermelho, e `"\u001B[0m"` reseta as cores e estilos do texto para os padrões do console.