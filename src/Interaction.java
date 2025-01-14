
import java.util.Scanner;
public class Interaction {
    private Scanner input;
    private StudentData studentData;

        public Interaction(Scanner input){
            this.input = input; 
            this.studentData = new StudentData(); //asked AI to help me with how to acess the StudentData file
            //I had an issue with the main method creating a new oobject for method using the scanner so I asked AI to help me solve the error
        }

    public void interact(){
        // Variable for condition
        boolean running = true;
        do {
            System.out.println("Welcome to the Student Information Database System!");
            System.out.println("Please choose one of the following options:");
            System.out.println("1: Add a new Student");
            System.out.println("2: Add a new Grade");
            System.out.println("3: Access Student Information");
            System.out.println("4: Display History");
            System.out.println("5: Undo Last Action");
            System.out.println("6: Exit the Database");
            System.out.print("Input your choice (1-6)");
            int choice = input.nextInt(); // Opens input for user
            switch(choice){
                case 1:
                StudentData.addStudent(input); //asked AI to help me with how to acess the StudentData file
                break;
                case 2:
                break;
                case 3:
                break;
                case 4:
                break;
                case 5:
                break;
                case 6:
                running = false;
                System.out.println("Exiting the program. Thanks for visiting!");
                break;
                default:
                System.out.println("Invalid input, please choose again.");
            }
        } while (running); // The condition for the 'menu' to work
        input.close();
    }
}
