package br.com.expertsclub.entity;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private String name;
    private List<Student> students;

    public Classroom(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        if (this.students == null) {
            this.students = new ArrayList<>();
        }
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "{ name='" + name + "', students='" + students + "' }";
    }
}
