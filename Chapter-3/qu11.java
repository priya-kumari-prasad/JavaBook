import java.util.*;

class hillPatt {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number: ");
    int num = scanner.nextInt();
    scanner.close();
    System.out.println("Pattern is: ");
    for (int i = 1; i < num; i++) {
      for (int j = i; j <= num; j++) {
        System.out.print("  ");
      }
      for (int j = 2; j <= i; j++) {
        System.out.print("* ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("  ");
      }
      for (int j = i; j <= num; j++) {

        System.out.print("* ");
      }
      for (int j = i + 1; j <= num; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

}
