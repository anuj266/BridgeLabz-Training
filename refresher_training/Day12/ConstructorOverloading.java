public class ConstructorOverloading {

    static class Student {
        private String name;
        private int age;
        private String course;

        // Full 3-argument constructor — does the actual work
        public Student(String name, int age, String course) {
            this.name = name;
            this.age = age;
            this.course = course;
        }

        // Name-only constructor delegates to full constructor
        public Student(String name) {
            this(name, 18, "General Studies");
        }

        // No-arg constructor delegates to full constructor
        public Student() {
            this("Unknown", 0, "Not assigned");
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', age=" + age + ", course='" + course + "'}";
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();                          // no-arg
        Student s2 = new Student("Ravi");                     // name-only
        Student s3 = new Student("Meena", 21, "Computer Science"); // full

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}