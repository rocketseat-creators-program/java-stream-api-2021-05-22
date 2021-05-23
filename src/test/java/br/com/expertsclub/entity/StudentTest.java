package br.com.expertsclub.entity;

import br.com.expertsclub.mock.MockList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class StudentTest {

    @Test // Qual o nome do aluno mais velho dentro da lista de estudantes?
    public void getOldestStudent() {
        List<Student> students = MockList.populateStudentList();

        Student oldest = new Student("Roberto", 0);
        for (Student student : students) {
            if (student.getAge() > oldest.getAge()) {
                oldest = student;
            }
        }

        Student expected = students.stream()
                .max(Comparator.comparing(Student::getAge))
                .get();

        System.out.println("Antes: " + oldest.getName());
        System.out.println("Depois: " + expected.getName());

        Assertions.assertEquals(oldest.getName(), expected.getName());
    }

    @Test // Qual o nome do aluno mais novo dentro da lista de estudantes?
    public void getNewestStudent() {
        List<Student> students = MockList.populateStudentList();

        Student newest = new Student("Auxiliary", Integer.MAX_VALUE);
        for (Student student : students) {
            if (student.getAge() < newest.getAge()) {
                newest = student;
            }
        }

        Student expected = students.stream()
                .min(Comparator.comparing(Student::getAge))
                .get();

        System.out.println("Antes: " + newest.getName());
        System.out.println("Depois: " + expected.getName());

        Assertions.assertEquals(newest.getName(), expected.getName());
    }

    @Test // Quais estudantes possuem mais de 16 anos.
    public void getStudentsWithAgeHigherThanSixteen() {
        List<Student> students = MockList.populateStudentList();

        List<Student> studentsHigher = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() > 16) {
                studentsHigher.add(student);
            }
        }

        List<Student> expected = students.stream()
                .filter(student -> student.getAge() > 16)
                .collect(Collectors.toList());

        System.out.println("Antes: " + studentsHigher);
        System.out.println("Depois: " + expected);

        Assertions.assertEquals(studentsHigher, expected);
    }

    @Test // Qual a soma das idades dos alunos que começam com o nome Pedro?
    public void getSumOfAgesOfNameStartsWithPedro() {
        List<Student> students = MockList.populateStudentList();

        int sum = 0;
        for (Student student : students) {
            if (student.getName().startsWith("Pedro")) {
                sum += student.getAge();
            }
        }

        int expected = students.stream()
                .filter(s -> s.getName().startsWith("Pedro"))
                .mapToInt(Student::getAge)
                .sum();

        System.out.println("Antes: " + sum);
        System.out.println("Depois: " + expected);

        Assertions.assertEquals(sum, expected);
    }

    @Test // Qual a média das idades dos alunos que possuem 6 letras no nome?
    public void getAgeAverageOfNamesWithSixLetters() {
        List<Student> students = MockList.populateStudentList();

        int soma = 0;
        int count = 0;
        for (Student student : students) {
            if (student.getName().length() == 6) {
                soma += student.getAge();
                count += 1;
            }
        }

        double average = (double) soma / count;

        double expected = students.stream()
                .filter(s -> s.getName().length() == 6)
                .mapToInt(Student::getAge)
                .average()
                .getAsDouble();

        System.out.println("Antes: " + average);
        System.out.println("Depois: " + expected);

        Assertions.assertEquals(average, expected);
    }

}

/*
    Nessa classe de testes aprendemos a utilizar os comandos:
    - max (Comparator.comparing)
    - min (Comparator.comparing)
    - filter
    - filter, sum
    - filter, average
*/
