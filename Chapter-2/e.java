package JavaBook.Chapter2;

import java.util.*;

class digitPerLine {
  public static void main(String[] args) {
    int digit, flag;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the five digit number: ");
    digit = sc.nextInt();
    flag = digit;
    digit = digit % 10;
    System.out.println(digit);
    digit = flag / 10;
    flag = digit;
    digit = digit % 10;
    System.out.println(digit);
    digit = flag / 10;
    flag = digit;
    digit = digit % 10;
    System.out.println(digit);
    digit = flag / 10;
    flag = digit;
    digit = digit % 10;
    System.out.println(digit);
    digit = flag / 10;
    flag = digit;
    digit = digit % 10;
    System.out.println(digit);

  }
}
