package JavaBook.Chapter2;

import java.util.*;

public class c {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter the value of num1: ");
    int num1 = inp.nextInt();
    System.out.println("Enter the value of num2: ");
    int num2 = inp.nextInt();
    int newNum = (num1 * 2) + num2;
    System.out.println("New Num = " + newNum);
  }

}
