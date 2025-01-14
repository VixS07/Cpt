
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Create a new InteractionHandler instance and start interaction
        Interaction interaction = new Interaction(scanner);
        interaction.interact();
    }
}