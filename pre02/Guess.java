import java.util.Random;
import java.util.Scanner;

public class Guess {

public static void main(String[] args){
  int guess;

  Scanner in = new Scanner(System.in);
  
System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");  

System.out.println ("Type a number: ");
guess = in.nextInt();

System.out.println ("Your guess is: " + guess);
  
    Random random = new Random();
    int number = random.nextInt(100) + 1;
     
System.out.println ("The number I was thinking of is: " + number);
  
System.out.println ("You were off by: " + (guess - number));
  
  }
}