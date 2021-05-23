package br.com.expertsclub.entity;

import br.com.expertsclub.mock.MockList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

        List<String> expected = classrooms.stream()
                .flatMap(classroom -> classroom.getStudents().stream())
                .sorted(Comparator.comparing(Student::getAge))
                .map(student -> student.getName())
                .collect(Collectors.toList());

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

        int expected = classrooms.stream()
                .flatMap(classroom -> classroom.getStudents().stream())
                .filter(student -> student.getName().startsWith("M"))
                .filter(student -> student.getAge() >= 18)
                .mapToInt(Student::getAge)
                .sum();

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
