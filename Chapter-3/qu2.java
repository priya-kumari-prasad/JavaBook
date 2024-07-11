import java.util.*;

public class qu2 {
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer b/w 0 and 35: ");
    num = sc.nextInt();
    sc.close();
    if (num >= 0 && num <= 35) {
      if (num >= 0 && num < 10) {
        System.out.println("number = " + num);
      } else {
        char number = (char) ('A' + (num - 10));
        System.out.println("number = " + number);
      }
    } else
      System.out.println("You have given invalid input.");
  }
}
