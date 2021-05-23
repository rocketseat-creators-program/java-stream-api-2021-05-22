package br.com.expertsclub.entity;

import br.com.expertsclub.mock.MockList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerTest {

    @Test // Dado uma lista de números inteiros, retorne o maior número.
    public void getBiggestNumber() {
        List<Integer> numbers = MockList.populateIntegerList();

        int biggest = 0;
        for (Integer number : numbers) {
            if (number > biggest) {
                biggest = number;
            }
        }

        int expected = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow();

        System.out.println("Antes: " + biggest);
        System.out.println("Depois: " + expected);

        Assertions.assertEquals(biggest, expected);
    }

    @Test // Dado uma lista de números inteiros, retorne o menor número.
    public void getLowestNumber() {
        List<Integer> numbers = MockList.populateIntegerList();

        int lowest = Integer.MAX_VALUE;
        for (Integer number : numbers) {
            if (number < lowest) {
                lowest = number;
            }
        }

        int expected = numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElseThrow();

        System.out.println("Antes: " + lowest);
        System.out.println("Depois: " + expected);

        Assertions.assertEquals(lowest, expected);
    }

    @Test // Dado uma lista de números inteiros, retorne a soma de todos os números.
    public void getSumFromList() {
        List<Integer> numbers = MockList.populateIntegerList();

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        int expected = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Antes: " + sum);
        System.out.println("Depois: " + expected);

        Assertions.assertEquals(sum, expected);
    }

    @Test // Dado uma lista de números inteiros, qual a soma dos números únicos (sem contar os repetidos)?
    public void getSumOfUniqueNumbersFromList() {
        List<Integer> numbers = MockList.populateIntegerList();

        int sum = 0;
        List<Integer> distinctNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (!distinctNumbers.contains(number)) {
                distinctNumbers.add(number);
                sum += number;
            }
        }

        int expected = numbers.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Antes: " + sum);
        System.out.println("Depois: " + expected);

        Assertions.assertEquals(sum, expected);
    }

    @Test // Dado uma lista de número inteiros, retorne uma nova lista com todos os seus valores multiplicados por 2
    public void getMultipliedNumbersListFromArray() {
        List<Integer> numbers = MockList.populateIntegerList();

        List<Integer> multipliedNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            multipliedNumbers.add(number * 2);
        }

        List<Integer> expected = numbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());

        System.out.println("Antes: " + multipliedNumbers);
        System.out.println("Depois: " + expected);

        Assertions.assertEquals(multipliedNumbers, expected);
    }

    @Test // Dado uma lista de número inteiros, verifique se todos os números são pares.
    public void checkIfNumbersAreEven() {
        List<Integer> numbers = MockList.populateIntegerList();

        boolean isEven = true;
        for (Integer i : numbers) {
            if (i % 2 != 0) {
                isEven = false;
            }
        }

        boolean expected = numbers.stream().allMatch(n -> n % 2 == 0);

        System.out.println("Antes: " + isEven);
        System.out.println("Depois: " + expected);

        Assertions.assertEquals(isEven, expected);
    }

}

/*
    Nessa classe de testes aprendemos a utilizar os comandos:
    - max
    - min
    - sum
    - distinct
    - map
    - allMatch
*/
