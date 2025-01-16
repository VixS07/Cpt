
import java.util.*;
/**
 * @author: Vix
 * @date: 01/06/2025
 */
public class StudentData {
    // Variables  
    private static LinkedList<Student> students;
    private static Stack<String> operations;
    // Setter
    public StudentData() {
        StudentData.students = new LinkedList<>();
        StudentData.operations = new Stack<>();
    }

    // Getters

    public LinkedList<Student> getStudents(){
        return students;
    }

    public Stack<String> getOperation(){
        return operations;
    }

    public static Student addStudent(Scanner scanner) {
        System.out.println("You are about to enter in a new student");
        System.out.println("Please input the student's name: ");
        String name = scanner.nextLine();
        scanner.nextLine(); // consumes next line
        int id;
        while (true) {
            System.out.println("Please enter student's ID number (a unique number up to 10 digits): ");
            String idInput = scanner.nextLine();
            if (idInput.length() <= 10 && idInput.matches("\\d+")) { // I asked ai to help with the looping
                id = Integer.parseInt(idInput);
                break;
            } else {
                System.out.println("Invalid input. Please enter a numeric ID up to 10 digits long.");
            }
        }
        System.out.println("Please enter student's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consumes the next line
        Student newStudent = new Student(id, name, age);
        students.add(newStudent);
        System.out.println("New student was added.");
        operations.push("addStudent");
        return newStudent;
    }
    

    public static boolean addGrade(Scanner scanner){
        System.out.println("You are about to add a grade for a student.");
        System.out.println("Please enter the student's name:");
        String name = scanner.nextLine();
        Student student = findStudentByName(name);
            if (student != null) {
                System.out.println("Enter the grade (a number from 0 to 100):");
                double grade = scanner.nextDouble();
                student.addGrade(grade);
                System.out.println("Grade added successfully!");
                operations.push("addGrade"); //asked ai with help with constantly updating arrays as the code is running
                return true;
            } else {
                System.out.println("Student not found. Please make sure the name is correct.");
                return false;
            }
    }
            
    private static Student findStudentByName(String name){
        for (Student student : students) {
        if (student.getName().equalsIgnoreCase(name)) {
            //asked AI to help me with comparing two strings      
            return student;
        }
        }
        return null;
    }
    public static void displayStudentInfo(Scanner scanner){
        System.out.println("You are about to view a student's information.");
        System.out.println("Please enter the student's name:");
        String name = scanner.nextLine();
        Student student = findStudentByName(name);
        if (student != null) {
            System.out.println("Here is the student's information:");
            System.out.println(student);
        } else {
            System.out.println("Student not found. Please retype the name of the student: ");
        }
    }

    public static String undoLast(){
        if (!operations.isEmpty()){
            String lastAction = operations.pop();
            System.out.println("Undoing last action: " + lastAction);
            if(lastAction.equals("addStudent")){
                students.removeLast();
                return "add Student Undone";
            } else {
                return "No Action to Undo";
            }
        } else {
            return "No Action to Undo";
        }
    }
}