package entities;

import java.util.HashSet;
import java.util.Set;

public class Course {
    private String name;
    private Set<Student> students = new HashSet<>();

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void enroll(Student student){
        students.add(student);
    }
}
