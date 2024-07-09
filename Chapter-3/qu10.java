import java.util.*;

class pattern {
  public static void main(String[] args) {
    int num;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number: ");
    num = scanner.nextInt();
    System.out.println("Pattern: ");
    for (int rows = 1; rows <= num; rows++) {
      for (int cols = rows; cols <= num; cols++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
    for (int rows = 1; rows <= num; rows++) {
      for (int cols = 1; cols <= rows; cols++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
  }
}
