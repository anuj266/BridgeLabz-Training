import java.util.*;
/*
 * Create the Student and Priorities classes here.
 */
 class Student{
    int id;
    String name;
    double cgpa;
    Student(int id, String name, double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
    
    int getID(){
        return id;
    }
    String getName(){
        return name;
    }
    double getCGPA(){
        return cgpa;
    }
 }
 
 class Priorities{
    PriorityQueue<Student> queue=new PriorityQueue<>(
        (a,b)->{
            if(a.getCGPA()!=b.getCGPA()){
                return Double.compare(b.getCGPA(),a.getCGPA());
            }
            int nameCompare=a.getName().compareTo(b.getName());
            if(nameCompare!=0){
                return nameCompare;
            }
            return Integer.compare(a.getID(),b.getID());
        }
    );
    
    List<Student> getStudents(List<String> events){
        List<Student> result=new ArrayList<>();
        for(String e:events){
            String[] event=e.split(" ");
            if(event[0].equals("ENTER")){
                Student s=new Student(Integer.parseInt(event[3]),event[1],Double.parseDouble(event[2]));
                queue.offer(s);
            }else{
                queue.poll();
            }
        }
        while(!queue.isEmpty()){
            result.add(queue.poll());
        }
        return result;
    }
 }


public class PriorityQueueProblem {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}