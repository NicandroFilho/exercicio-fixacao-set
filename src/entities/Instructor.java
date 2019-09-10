package entities;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
    String name;
    List<Course> courses;

    public Instructor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void openCourse(String courseName){
        courses.add(new Course(courseName));
    }
}
