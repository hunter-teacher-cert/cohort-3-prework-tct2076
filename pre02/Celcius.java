import java.util.Scanner;

public class Celcius {
  public static void main(String[] args){
double celcius;

Scanner in = new Scanner(System.in);

System.out.print("What's the temperature in Celcius degrees?"); 

celcius = in.nextDouble();
double fahrenheit = celcius * 9 / 5 + 32;

System.out.printf("%.1f degrees C = %.1f degrees F", celcius, fahrenheit);

    }
}