
import java.util.LinkedList;

public class Student {
    // Variables
    private int id;
    private String name;
    private int age;
    private LinkedList<Double> grades;
    /**
     * 
     * @param id
     * @param name
     * @param age
     */
    public Student(int id, String name, int age) { // setter
        this.id = id;
        this.name = name;
        this.age = age;
        this.grades = new LinkedList<>();
    }

    // Getters

    public double addGrade(double grade) {
        grades.add(grade);
        return grade;
    }  

    public int getId(){
        return id;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public LinkedList<Double> getGrades(){
        return grades;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Grades: " + grades;
    } 
}