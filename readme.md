<img src="https://storage.googleapis.com/golden-wind/experts-club/capa-github.svg" />

# Stream API! Manipulando suas informações de forma eficiente.

## O que é?

É um recurso que oferece ao programador a possibilidade de trabalhar com diversos conjuntos de elementos de forma mais
simples e com uma quantidade menor de linhas de código.

## Para que serve?

Esse recruso serve para iterar sobre coleções de objetos e, para cada elemento, executar determinada ação, seja de
filtragens, transformações, reduções, entre outras...

## Tipos de operações

- **Operações intermediárias** são aquelas que retornam um novo Stream, permitindo continuar chamando vários métodos em
  sequência:
    - map
    - skip
    - peek
    - limit
    - filter
    - sorted
    - flatMap
    - distinct

- **Operações terminais** são aquelas que retornam um valor de determinado tipo. Somente quando uma operação terminal é
  chamada que todo o stream pipeline é executado.
    - min
    - max
    - sum
    - count
    - reduce
    - collect
    - toArray
    - average
    - forEach
    - forEachOrdered

- **Operações terminais de curto-circuito**, são aquelas que possuem todas as caracteristicas de uma operação terminal e
  assim que seu predicado for satisfeito, a operação é encerrada.
    - findAny
    - anyMatch
    - allMatch
    - noneMatch
    - findFirst

## Que tal começar a brincadeira?

Preparei alguns exercícios abaixo para resolvermos utilizando nossas listas mockadas. Consegue resolver os problemas
abaixo utilizando o pacote java.util.stream?

### Vamos começar no fácil, só com uma listinha de número inteiros, bem tranquilinho para podermos entender a estrutura.

Acesse a classe **IntegerTest** para começar a brincadeira. Lembrando que seu valor esperado (expected) deve ser igual
ao resultado já implementado no exercício.

1. Dado uma lista de números inteiros, retorne o maior número.
2. Dado uma lista de números inteiros, retorne o menor número.
3. Dado uma lista de números inteiros, retorne a soma de todos os números.
4. Dado uma lista de números inteiros, qual a soma dos números únicos (sem contar os repetidos)?
5. Dado uma lista de número inteiros, retorne uma nova lista com todos os seus valores multiplicados por 2.
6. Dado uma lista de número inteiros, verifique se todos os números são pares.

### Agora ta na hora de apimentar as coisas, bora partir para uma lista de Students.

Para um pouco mais de dificuldade, acesse a classe **StudentTest** para aprimorar seu conhecimento.

1. Qual o nome do aluno mais velho dentro da lista de estudantes?
2. Qual o nome do aluno mais novo dentro da lista de estudantes?
3. Quais estudantes possuem mais de 16 anos.
4. Qual a soma das idades dos alunos que começam com o nome Pedro?
5. Qual a média das idades dos alunos que possuem 6 letras no nome?

### Agora estamos na reta final, bora partir para uma lista de Classrooms.

Vamos agora utilizar todo o conhecimento adquirido nos outros exercícios e responder essas duas perguntinhas abaixo. 
Acesse a classe **ClassroomTest** para dar continuidade ao desafio.

1. Quais os nomes (por ordem de idade) dos estudantes de todas as salas?
2. Qual a soma das idades dos estudantes de todas as salas que começam com a letra "M" e que tenham no minimo 18 anos?
   