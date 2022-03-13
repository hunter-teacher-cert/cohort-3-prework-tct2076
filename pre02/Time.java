import java.io.*;
import java.util.*;

public class Time {
  public static void main(String[] args){
    int hour = 22;
    int minute = 20;
    int second = 30;

System.out.print("Number of seconds since midnight: ");
System.out.println((hour * 60 * 60) + (minute * 60) + second );

int curTime = ((hour * 60 * 60) + (minute * 60) + second );   
int dayTotSec = (24 * 60 * 60);

System.out.print("Number of seconds remaining in the day: ");
System.out.println(dayTotSec - curTime);    

double percentage = (curTime * 100.0) / dayTotSec;    
System.out.println("The percentage of the day that has passed: " + percentage + "%");

    int hourCur = 23;
    int minuteCur = 40;
    int secondCur = 30;

System.out.print("The elapsed time since I started working on this exercise: ");
System.out.println((hourCur - hour) * 60 * 60 + (minuteCur - minute) * 60 + (secondCur - second));    
  
    }

}