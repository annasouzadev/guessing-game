import java.util.Random;
import java.util.Scanner;


public class Guessinggame {

public static void main(String[] args) {
    try( Scanner scanner = new Scanner(System.in)) {
     Random random = new Random();
     int maxAttempts = 10;
     String playAgain;
 do{
     int secretnumber = random.nextInt(100) + 1;
     int attempt;
     int attempts = 0;
     int score = 0;
     
    System.out.println("----NEW GAME START! ----- ");

        do {

                System.out.println("Attempts remaining:" + (maxAttempts - attempts));
                System.out.println("Type a number: ");

                attempt = scanner.nextInt();
                attempts++;
                

                if (attempt == secretnumber) {

                    score = (maxAttempts - attempts + 1) * 10;
                    System.out.println("You got it!");
                    System.out.println("you found the number in" + attempts + "attempts");
                    System.out.println("your score is " + score);

                } else if (attempt > secretnumber) {
                    System.out.println("the secret number is lower!");

                } else {
                    System.out.println("the secret number is higher!");
                }  
                  
                } while (attempt != secretnumber && attempts < maxAttempts);
                

                if (attempt != secretnumber) {
                    System.out.println("Game over!");
                    System.out.println("your score is " + score);
                    System.out.println("The secret number is: " + secretnumber);
                
                }
                    System.out.println("Do you want to play again?( yes/ no )");
                    playAgain = scanner.next();

                } while (playAgain.equals("yes"));
                System.out.println("Thanks for playing!");
        }
    }
}
