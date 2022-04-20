import java.io.*;
import java.util.*;

public class Methods {

public static void main(String[] args) {
    System.out.println("Is it divisible");
    System.out.println(isDivisible(35,2));
    System.out.println(isDivisible(36,2));

    System.out.println("Is it a triangle");
    System.out.println(isTriangle(6,10,17));
    System.out.println(isTriangle(5,6,7));

    System.out.println("Ackermann Function");
    System.out.println(ack(1,2));
    System.out.println(ack(0,2));
    System.out.println(ack(3,4));
}

// Exercise 2  
  public static boolean isDivisible(int n, int m){
    if (n%m ==0){
      return true;
    } else {
      return false;
      }
    }
  
// Exercise 3
  public static boolean isTriangle(int a, int b, int c){
    if ((a + b) < c || (b + c) < a || (a + c) < b) {
      return false;
    } else {
      return true;  
    }    
  }  

// Exercise 8
  public static int ack(int m, int n){
    if (m == 0){
      return n + 1;
    } else if (m > 0 && n ==0){
      return ack(m-1,1);
        
    } else {
      return ack(m-1, ack(m, n-1));  
    }
  }    
}