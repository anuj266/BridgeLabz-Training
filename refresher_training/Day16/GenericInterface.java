import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.score, other.score);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', score=" + score + "}";
    }
}

public class GenericInterface {
    public static void main(String[] args) {
        
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", 85));
        studentList.add(new Student("Bob", 92));
        studentList.add(new Student("Charlie", 78));
        studentList.add(new Student("Diana", 88));

        System.out.println("Before Sorting:");
        for (Student s : studentList) {
            System.out.println(s);
        }

        Collections.sort(studentList);

        System.out.println("\nAfter Sorting by Score:");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}