import java.util.*;

class Number {
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    num = sc.nextInt();
    sc.close();
    if (num == 0) {
      System.out.println("Zero");
    } else if (num > 0) {
      System.out.println("Positive");
    } else {
      System.out.println("Negative");
    }
  }

}