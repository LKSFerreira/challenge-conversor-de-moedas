<br/>
<p align="center">
  <a href="#">
    <img src="https://media.licdn.com/dms/image/D4D22AQGUHLqMili-iQ/feedshare-shrink_800/0/1713300765348?e=1716422400&v=beta&t=B_FcQi5DLGVmP_C7MY9g44Pg6T6lYDkNVFIjVGN1GBg" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">Challenge - Conversor de moedas</h3>

  <p align="center">
    Projeto ONE para praticar o conhecimento adquirido
    <br/>
    <br/>
    <a href="https://github.com/LKSFerreira/challenge-conversor-de-moedas"><strong>Explorar a documentação »</strong></a>
    <br/>
    <br/>
    <a href="https://github.com/LKSFerreira/challenge-conversor-de-moedas">Visão Geral</a>
    .
    <a href="https://github.com/LKSFerreira/challenge-conversor-de-moedas/issues">Reportar um Bug</a>
    .
    <a href="https://github.com/LKSFerreira/challenge-conversor-de-moedas/issues">Solocitar uma Feature</a>
  </p>
</p>

![Contributors](https://img.shields.io/github/contributors/LKSFerreira/challenge-conversor-de-moedas?color=dark-green) ![Forks](https://img.shields.io/github/forks/LKSFerreira/challenge-conversor-de-moedas?style=social) ![Stargazers](https://img.shields.io/github/stars/LKSFerreira/challenge-conversor-de-moedas?style=social) ![Issues](https://img.shields.io/github/issues/LKSFerreira/challenge-conversor-de-moedas) ![License](https://img.shields.io/github/license/LKSFerreira/challenge-conversor-de-moedas)

## Índice

- [Sobre o projeto](#sobre-o-projeto)
- [Tecnologias](#tecnologias)
- [Getting Started](#getting-started)
  - [Requisitos](#requisitos)
  - [Instalação](#instalação)
- [Roadmap](#roadmap)
- [Contribuindo](#contribuindo)
- [Criando um Pull Request](#criando-um-pull-request)
- [Licença](#licença)
- [Autores](#autores)
- [Agradecimentos](#agradecimentos)

## Sobre o projeto

<a href="#" target="_blank">
  <img src="https://raw.githubusercontent.com/LKSFerreira/challenge-conversor-de-moedas/main/assets/tela-inicial.png" alt="Screen Shot target="_blank">
</a>

## Descrição do Projeto
O "Challenge - Conversor de Moedas" é um projeto educacional desenvolvido no âmbito do programa ONE - Oracle Next Education, com o apoio da plataforma Alura. Este desafio de programação é uma oportunidade única para mergulhar no mundo do desenvolvimento back-end, utilizando a linguagem Java para criar uma aplicação prática e interativa.

### Objetivos
O principal objetivo deste projeto é desenvolver um Conversor de Moedas funcional que permita ao usuário realizar conversões entre diferentes moedas através de uma interface textual (console). O conversor deve oferecer no mínimo seis opções de conversões de moedas, com taxas de câmbio obtidas em tempo real por meio de uma API externa. Isso garante que os usuários tenham acesso a informações precisas e atualizadas, proporcionando uma experiência de uso mais eficaz.

### Características do Desafio
- **Aprendizado Prático**: Os participantes terão a chance de aplicar conceitos importantes de Java, como consumo de API, herança e polimorfismo.
- **Interatividade**: A aplicação deve ser capaz de interagir com o usuário via console, oferecendo uma experiência de uso direta e envolvente.
- **Dados em Tempo Real**: O conversor utilizará uma API de taxas de câmbio para fornecer dados precisos e atualizados, manipulando respostas em formato JSON.
- **Filtragem de Moedas**: Os usuários poderão filtrar e escolher entre as moedas disponíveis para realizar a conversão desejada.
- **Exibição de Resultados**: A aplicação apresentará os resultados das conversões de forma clara e acessível ao usuário.

### Etapas do Desenvolvimento
1. Configuração do Ambiente Java
2. Criação do Projeto
3. Consumo da API de taxas de câmbio
4. Análise da Resposta JSON
5. Filtro de Moedas
6. Exibição de Resultados aos Usuários

### Metodologia Ágil com Trello
Para organizar o desenvolvimento do projeto, utilizaremos o Trello, uma ferramenta de gerenciamento de projetos que permite controlar o andamento das atividades de forma individual. As tarefas serão distribuídas em colunas que representam diferentes estágios do desenvolvimento: "Pronto pra iniciar", "Desenvolvendo", "Pausado" e "Concluído".

### Experiência de Desenvolvimento Back-End
Ao completar o desafio do Conversor de Moedas, os participantes vivenciarão o papel de um desenvolvedor back-end, enfrentando desafios reais e aplicando conhecimentos técnicos em um projeto concreto. Este desafio é uma parte essencial do programa ONE, que visa consolidar o aprendizado e preparar os alunos para o mercado de trabalho.

**Participe!**
Entendemos que nenhum modelo de plataforma serve para todos os projetos, pois suas necessidades podem ser diferentes. Estaremos adicionando mais funcionalidades no futuro próximo. Você pode também sugerir mudanças fazendo um [**fork**](https://github.com/LKSFerreira/challenge-conversor-de-moedas/fork) deste repositório e criando um [**pull request**](https://github.com/LKSFerreira/challenge-conversor-de-moedas/pulls) ou abrindo uma [**issue**](https://github.com/LKSFerreira/challenge-conversor-de-moedas/issues/new/choose).

## Tecnologias

<div style="display: inline_block"><br\>
  <img align="center" alt="icone representando Java" height="120" width="120" src="https://raw.githubusercontent.com/devicons/devicon/6910f0503efdd315c8f9b858234310c06e04d9c0/icons/java/java-original-wordmark.svg">
</div>
<br>

## Getting Started

- [Java 21](https://www.oracle.com/br/java/technologies/downloads/)

### Requisitos

1. É necessário utiliza o JDK 21
 
### Instalação

**Localhost**

1. Clone o repositório
   ```md
   git clone https://github.com/LKSFerreira/challenge-conversor-de-moedas.git
   ```
2. Vá para a pasta do projeto
   ```md
   cd seu-repositorio
   ```

```md
# Realize a configuração da sua API KEY
```

Para configurar a API key necessária para acessar o ExchangeRate-API, siga estes passos:

3. renomei `src/config-example.yaml` para `src/config.yaml`.
4. Abra o arquivo `src/config.yaml` e substitua `INSIRA_SUA_API_KEY_AQUI` pela sua API key pessoal.

Exemplo de `config.yaml`:

```yaml
apiKey: "sua_api_key_aqui"
```

5. Execute o programa inicial chamado `App.java`

## Roadmap

Veja as [issues abertas](https://github.com/LKSFerreira/challenge-conversor-de-moedas/issues) para uma lista de recursos propostos (e problemas conhecidos).

## Contribuindo

As contribuições são o que tornam a comunidade de código aberto um lugar tão incrível para aprender, inspirar e criar. Qualquer contribuição que você fizer será **muito apreciada**.

- Se você tiver sugestões para adicionar ou remover projetos, fique à vontade para [abrir uma issue](https://github.com/LKSFerreira/challenge-conversor-de-moedas/issues/new) para discutir isso, ou crie diretamente um pull request após editar o arquivo `README.md` com as alterações necessárias.
- Por favor, certifique-se de verificar sua ortografia e gramática.
- Crie PRs individuais para cada sugestão.
- Por favor, leia também o [Código de Conduta](https://github.com/LKSFerreira/challenge-conversor-de-moedas/blob/main/CODE_OF_CONDUCT.md) antes de postar sua primeira ideia.

### Criando um Pull Request

1. Faça um **Fork** do Projeto
2. Crie sua **Feature Branch** (`git checkout -b feature/FeatureIncrivel`)
3. **Commit** suas alterações (`git commit -m ':sparkles: Feat: Adiciona tal FeatureIncrivel'`)
4. **Push** para a Branch (`git push origin feature/FeatureIncrivel`)
5. Abra um **Pull Request**

## Licença

Distribuido sob a MIT License. Veja [LICENSE](https://github.com/LKSFerreira/challenge-conversor-de-moedas/blob/main/LICENSE.md) para mais informações.

## Autores

- **Lucas Ferreira** - _Application Developer_ - [Lucas Ferreira](https://github.com/LKSFerreira/) - _[Contribuição](https://github.com/LKSFerreira/tech4dev/commits/main/?author=LKSFerreira)_

## Agradecimentos

- [ONE](https://www.oracle.com/br/education/oracle-next-education)
- [Alura](https://www.alura.com.br)
