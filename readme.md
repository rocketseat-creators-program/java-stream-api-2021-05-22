<img src="https://storage.googleapis.com/golden-wind/experts-club/capa-github.svg" />

# Pacote java.util.stream! Manipulando suas informações de forma eficiente.

## O que é?

É um recurso que oferece ao programador a possibilidade de trabalhar com diversos conjuntos de elementos de forma mais
simples e com uma quantidade menor de linhas de código.

## Para que serve?

Esse recruso serve para iterar sobre coleções de objetos e, para cada elemento, executar determinada ação, seja de
filtragens, transformações, reduções, entre outras..

## Tipos de operações

- **Operações intermediárias** são aquelas que retornam um novo Stream, permitindo continuar chamando vários métodos em
  sequência:
    - map
    - filter
    - sorted
    - flatMap
    - peek
    - limit
    - skip
    - distinct

- **Operações terminais** são aquelas que retornam um valor de determinado tipo. Somente quando uma operação terminal é
  chamada que todo o stream pipeline é executado.
    - forEach
    - forEachOrdered
    - collect
    - count
    - reduce
    - toArray
    - min
    - max
    - sum
    - average

- **Operações terminais de curto-circuito**, são aquelas que possuem todas as caracteristicas de uma operação terminal e
  assim que seu predicado for satisfeito, a operação é encerrada.
    - anyMatch
    - noneMatch
    - allMatch
    - findFirst
    - findAny

## Que tal começar a brincadeira?

### Consegue resolver os problemas abaixo utilizando o pacote java.util.stream?

Preparei alguns exercícios abaixo para resolvermos utilizando nossas listas mockadas.

#### Vamos começar no fácil, só com uma listinha de número inteiros, bem tranquilinho para podermos entender a estrutura.

Acesse a classe **IntegerTest** para começar a brincadeira. Lembrando que seu valor esperado (expected) deve ser igual
ao resultado já implementado no exercício.

2. Dado uma lista de número inteiros, retorne uma nova lista com todos os seus valores multiplicados por 2
3. Dado uma lista de número inteiros, verifique se todos os números são pares.
4. Dado uma lista de número inteiros, qual a soma dos números únicos (sem contar os repetidos)?

#### Agora ta na hora de apimentar as coisas, bora partir para uma coleção de Students.

Para um pouco mais de dificuldade, acesse a classe **StudentTest** para aprimorar seu conhecimento.

1. Qual a idade do aluno mais velho dentro da lista de alunos?
2. Qual a idade do aluno mais novo dentro da lista de alunos?
3. Liste o nome de todos os alunos que tenham a idade acima de 16.
4. Qual a soma das idades dos alunos que começam com o nome Pedro?
5. Qual a média das idades dos alunos que possuem 6 letras no nome?
6. Quais os nomes (em ordem alfabética) dos estudantes existentes em uma determinada escola (List<Classroom>)?
7. Qual a soma das idades de todos os alunos de uma determinada escola que começam com a letra "M" e que tenham no
   minimo 18 anos?
   