
import java.util.*;

public class StudentData {
    // Variables  
    private LinkedList<Student> students;
    private Stack<String> operations;
    private Queue<String> notifications;
    // Setter
    public StudentData() {
        this.students = new LinkedList<>();
        this.operations = new Stack<>();
        this.notifications = new LinkedList<>();
    }

    // Getters

    public LinkedList<Student> getStudents(){
        return students;
    }

    public Stack<String> getOperation(){
        return operations;
    }

    public Queue<String> getNotifications(){
        return notifications;
    }

    public static void addStudent(Scanner scanner){
        System.out.println("You are about to enter in a new student");
        System.out.println("Please input the students name: ");
        String name = scanner.nextLine();
        scanner.nextLine(); //consumes next line
        System.out.println("Please enter students ID numbner (a unique number up to 10 digits): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consumes the next line
        System.out.println("Please enter students age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consumes the next line
        System.out.println("New student was added.");
    }

    public void addGrade(){
        System.out.println("You are about to enter a grade");
        System.out.println("Please enter tha nem of the student you wish to add a grade to: ");

    }
}