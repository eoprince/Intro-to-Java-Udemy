import java.util.Scanner;

public class App {
    public static void main(string[] args) throws Exception {

        // Create scanner object
        Scanner input = new Scanner(System.in); 

        // Output the promt
        System.out.println("What is your name?");
        
        // user input
        String firstName = input.nextLine();
        System.out.println("What is your last name?");
        String lastName = input.nextLine();

        // formatting version
        System.out.printf("Hello % %", firstName, lastName);

        // concatonation version
        System.out.println("Hello " + firstName);

        // close scanner below 
        input.close();
    }
}


        
    

