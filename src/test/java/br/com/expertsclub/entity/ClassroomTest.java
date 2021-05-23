package br.com.expertsclub.entity;

import br.com.expertsclub.mock.MockList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ClassroomTest {

    @Test // Quais os nomes (por ordem de idade) dos estudantes de todas as salas?
    public void getStudentsNames() {
        List<Classroom> classrooms = MockList.populateClassroomList();

        List<Student> students = new ArrayList<>();
        for (Classroom classroom : classrooms) {
            // students.addAll(classroom.getStudents());
            for (Student student : classroom.getStudents()) {
                students.add(student);
            }
        }

        students.sort(Comparator.comparing(Student::getAge));

        List<String> names = new ArrayList<>();
        for (Student student : students) {
            names.add(student.getName());
        }

        List<String> expected = Arrays.asList("Pedro Paulo", "Marcelo", "Ana", "Marcos", "Mateus", "Luana", "Pedro Henrique", "Monique", "Julia", "Marcia"); // Implemente aqui a solução utilizando o Stream API

        System.out.println("Antes: " + names);
        System.out.println("Depois: " + expected);

        Assertions.assertEquals(names, expected);
    }

    @Test // Qual a soma das idades dos estudantes de todas as salas que começam com a letra "M" e que tenham no minimo 18 anos?
    public void geSumOfAgesOfStudentsWhenNameStartsWithMAndAgeIsGreaterOrEquals18() {
        List<Classroom> classrooms = MockList.populateClassroomList();

        int sum = 0;
        for (Classroom classroom : classrooms) {
            for (Student student : classroom.getStudents()) {
                if (student.getName().startsWith("M") && student.getAge() >= 18) {
                    sum += student.getAge();
                }
            }
        }

        int expected = 39; // Implemente aqui a solução utilizando o Stream API

        System.out.println("Antes: " + sum);
        System.out.println("Depois: " + expected);

        Assertions.assertEquals(sum, expected);
    }

}

/*
    Nessa classe de testes aprendemos a utilizar os comandos:
    - flatMap, sorted (Comparator.comparing), map
    - flatMap, filter, filter, mapToInt, sum
*/
