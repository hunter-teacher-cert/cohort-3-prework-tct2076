import java.io.*;
import java.util.*;

public class Beer{
public static void main(String[] args){

  int beerNum = 99;
  String word = "bottles";
  
  while (beerNum > 0) {

  if (beerNum == 1) {
      word = "bottle";
  }
               
  System.out.println(beerNum + " " + word + " of beer on the wall, " + beerNum + " " + word + " of beer");
  beerNum = beerNum - 1;

  if (beerNum > 0) {
  System.out.println("ya' take one down, ya' pass it around " + beerNum + " " + word + " of beer on the wall.");
  }
    }

  if (beerNum == 0) {
      System.out.println("No more bottles of beer on the wall,");
      System.out.println("no bottles of beer,");
      System.out.println("ya' can't take down, ya' can't pass it arouond,"); 
      System.out.println("’cause there are no more bottles of beer on the wall!");
      }
   }
}
