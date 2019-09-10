package entities;

public class Student implements Comparable<Student> {
    private Integer id;

    public Student(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        return getId() != null ? getId().equals(student.getId()) : student.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }

    @Override
    public int compareTo(Student o) {
        return id.compareTo(o.getId());
    }
}
