package br.com.expertsclub.mock;

import br.com.expertsclub.entity.Classroom;
import br.com.expertsclub.entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockList {

    public static List<Integer> populateIntegerList() {
        return Arrays.asList(2, 2, 2, 16, 20, 14, 6, 10, 12);
    }

    public static List<Student> populateStudentList() {
        List<Student> lista = new ArrayList<>();
        lista.add(new Student("Pedro Paulo", 14));
        lista.add(new Student("Pedro Henrique", 17));
        lista.add(new Student("Ana", 15));
        lista.add(new Student("Maria", 18));
        lista.add(new Student("Marcos", 16));
        lista.add(new Student("Mateus", 17));
        return lista;
    }

    public static List<Classroom> populateClassroomList() {
        Classroom rocketSeatClass = new Classroom("Rocketseat");
        rocketSeatClass.addStudent(new Student("Marcos", 16));
        rocketSeatClass.addStudent(new Student("Mateus", 17));
        rocketSeatClass.addStudent(new Student("Luana", 17));

        Classroom expertsClubClass = new Classroom("ExpertsClub");
        expertsClubClass.addStudent(new Student("Pedro Henrique", 17));
        expertsClubClass.addStudent(new Student("Ana", 15));
        expertsClubClass.addStudent(new Student("Monique", 18));

        Classroom discoverClass = new Classroom("Discover");
        discoverClass.addStudent(new Student("Pedro Paulo", 14));
        discoverClass.addStudent(new Student("Marcia", 21));
        discoverClass.addStudent(new Student("Julia", 19));
        discoverClass.addStudent(new Student("Marcelo", 14));

        return Arrays.asList(rocketSeatClass, expertsClubClass, discoverClass);
    }

}
