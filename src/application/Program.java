package application;

import entities.Course;
import entities.Instructor;
import entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Instructor alex = new Instructor("Alex");

        alex.openCourse("A");
        alex.openCourse("B");
        alex.openCourse("C");


        for (Course course : alex.getCourses()) {
            System.out.print("How many Students to enroll in course " + course.getName() + ": ");
            int numStudents = sc.nextInt();
            for(int i = 0; i < numStudents; i++){
                course.enroll(new Student(sc.nextInt()));
            }
        }

        Set<Student> total = new HashSet<>();
        for (Course c : alex.getCourses()) {
            total.addAll(c.getStudents());
        }

        System.out.println("Total Students: " + total.size());

        sc.close();
    }
}
