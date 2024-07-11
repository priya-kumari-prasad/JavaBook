import java.util.*;

class printSqu {
  public static void main(String[] args) {
    int num;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number to print square till number : ");
    num = scanner.nextInt();
    scanner.close();
    int sum = 0;

    for (int i = 1; i <= num; i++) {
      // System.out.print(" + " + (i * i));

      if (i > 1) {
        System.out.print(" + ");
      }
      System.out.print(i * i);
      sum += i * i;
    }
    System.out.print(" = " + sum);

    System.out.println();
  }

}
