// import java.util.Scanner;

  public class MadLib {
     public static void main(String[] args) { 
     /* Use the variables below to compose the following paragraph:
         * name, adjective, verbOne, verbTwo, number, yourName.
         * Dear name,
         * You are adverb adjective and I want to be your noun! I want to go to the
         * nounTwo with you in number days.
         * Sincerely, yourName
         */
        Scanner input = new Scanner(System.in);

        int ageLimit = 18;

        System.out.println("How old are you?");

        int age = Integer.parseInt(input.nextLine());
        if (age < ageLimit) {
        System.out.println("You are too young! Sorry!");
        System.exit(0);
        } else {
        //Program continues as normal because they past the age test!
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = userInput.nextLine();
        System.out.println("Give me an adjective: ");
        String adjective = userInput.nextLine();
        System.out.println("Give me a verb: ");
        String verbOne = userInput.nextLine();
        System.out.println("Give me another verb: ");
        String verbTwo = userInput.nextLine();
        System.out.println("Give me a number: ");
        String number = userInput.nextLine();
        System.out.println("Give me your name: ");
        String yourName = userInput.nextLine();

         System.out.printf("Here is your story: \n");
         System.out.printf("\n Dear %s,", name);
         System.out.printf("\n You are extremely %s and I want to %s you!", adjective, verbOne);
         System.out.printf("\n I want to %s you %s times.", verbTwo, number);
         System.out.printf("\n Sincerely, %s \n", yourName);
		}
	}
 
       /* System.out.println("Put in a name: ");        
        String name = input.nextLine();

        System.out.println("Put in a adjective: ");        
        String adj = input.nextLine();

        System.out.println("Put in your first verb: ");        
        String adverb = input.nextLine();
        
        System.out.println("Put in your second verb: ");        
        String verbTwo = input.nextLine();
        
        System.out.println("What is your name: ");        
        String yourName = input.nextLine();

        System.out.println("What is your fav number: ");        
        int num = input.nextInt();

       System.out.println("Dear, " + name + " " + adverb + " " + adj + " " + verbTwo + " " + num + " " + yourName);*/
     
        input.close();

    }












