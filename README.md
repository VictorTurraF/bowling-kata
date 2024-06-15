# Bowling Kata (TDD)

## Objetivo deste projeto
Manter em prática os conhecimentos em arquitetura limpa e qualidade de software com TDD. Neste projeto, a intenção é implementar um "core" de uma aplicação que contém as regras de negócio para um katá de boliche.

> Espero com este projeto demonstrar como a arquitetura limpa pode facilitar a integração de qualquer framework ou drivers externos com qualquer lógica de negócio já estabelecida.

## Escopo do projeto
Implementar todas as regras de um katá de boliche inicialmente em um "core", ou seja, em uma unidade que não depende de detalhes externos. Serão também implementados testes para cada caso de uso deste core.

Com esse "core" será possível realizar as jogadas, somar os pontos de cada frame, alternar os turnos entre o jogadores, e considerar as demais regras de um jogo de boliche. Jogadas inválidas ou dados de entrada imprevistos devem ser lançados como exceções.

## Requisitos Funcionais

- O game possui 10 frames por jogador. Os jogadores alternam entre si nas jogadas entre cada frame.
- Para cada fram o jogador tem duas oportunidades de jogada.
- Em um frame:
  - Contém a quantidade de pinos da primeira jogada;
  - Contém a quantidade de pinos da segunda jogada;
  - é spare quando a soma das jogadas não deixa nenhum pino restante;
  - é strike quando todos os pinos (10) são derrubados na primeira jogada;
  - a soma dos pinos não pode ser maior que 10.
- A pontuação de um frame deve somar:
  - A soma dos pinos do frame atual;
  - A pontuação do frame anterior;
  - Um bônus caso seja feito um spare:
    - Soma-se a quantidade de pinos da próxima jogada (1ª do próximo frame);
  - Um bônus caso seja feito um strike:
    - Soma-se a quantidade de pinos das próximas duas jogadas (as duas do próximo frame).
- No décimo frame:
  - O jogador que fizer um spare neste frame pode fazer uma jogada extra;
  - O jogador que fizer um strike neste frame pode fazer duas jogadas extra;
  - Não mais que três bolas deverão ser roladas no décimo frame.

## Requisitos Não Funcionais
- Linguagem Kotlin (escolha pessoal)
- Gradle
- Praticar o TDD
- Seguir os princípios SOLID
- Seguar a Clean Architecture

### Sprint #1
Plano de execução dividido em sprint e dias.

- [x] Classe "Frame". Entidade. (1h)
- [x] Classe "Player". Entidade. (15m)
- [x] Classe "Game". Com o básico. Sem funcionalidades. (1h)
- [x] Calculo de pontuação + funcionalidades (3h)

#### Sprint #1 Day #1 Monday 10th
- [ ] Criar classe Frame
- [ ] A soma dos frames deve ser menor ou igual a 10.

#### Sprint #1 Day #2 Tuesday 11th
- [x] Criar classe Player
- [ ] Criar classe ExtraFrame
- [x] Implementar a funcionalidade de jogada do player

#### Sprint #1 Day #3 Wednesday 12th
- [x] Implementar classe Game
- [x] Add. funcionalidade de troca de turnos entre jogadores

#### Sprint #1 Day #4 Thursday 14th
- [x] Add. soma de score dos frames
- [x] Add. regras de pontuação bônus de strike e spare

#### Sprint #1 Day #5 Friday 15th
- [ ] Refatorar
- [ ] Add. funcionalidades que restaram
- [x] Add. ducomentação README