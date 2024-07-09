import java.util.*;

class avg {
  public static void main(String[] args) {
    int num, sum = 0, avg;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number of element: ");
    num = scanner.nextInt();
    for (int i = 1; i <= num; i++) {
      System.out.print("Enter number " + i + " : ");
      double number = scanner.nextDouble();
      sum += number;

    }
    avg = sum / num;
    System.out.println("Average = " + avg);

  }
}
