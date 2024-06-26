package JavaBook.Chapter2;

import java.util.*;

class Area {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length of rectangle: ");
    int len = sc.nextInt();
    System.out.println("Enter Breadth of rectangel: ");
    int br = sc.nextInt();
    // int area = len * br;
    System.out.println("Area of rectangle = " + (len * br));

  }
}