import java.util.Scanner;

public class Interaction {
    public void menu(){
        Scanner input = new Scanner(System.in);
        
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
            int choice = input.nextInt();
            switch(choice){
                case 1:
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

        } while (running);
    }
}
