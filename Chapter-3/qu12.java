import java.util.*;

class fibonacci {
  public static void main(String[] args) {
    /*
     * int a = 1, b = 1, num, c;
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Enter number to find fibonacci Series: ");
     * num = sc.nextInt();
     * for (int i = 2; i <= num; i++) {
     * c = a + b;
     * System.out.print(c + " ");
     * a = b;
     * b = c;
     * }
     * System.out.println();
     */

    int a = 1, b = 1, c, num;
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter number b/w 2 to 100 to find fibonacci Series: ");
    num = inp.nextInt();

    if (num >= 2 && num <= 100) {
      for (int i = 2; i <= num; i++) {
        c = a + b;
        System.out.print(c + " ");
        a = b;
        b = c;
      }
      System.out.println();
    } else
      System.out.println("You have given wrong input.");
  }

}
