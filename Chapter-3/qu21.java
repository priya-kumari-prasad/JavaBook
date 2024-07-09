import java.util.*;

class table {
  public static void main(String[] args) {
    int num, i = 1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number for printing table: ");
    num = sc.nextInt();
    do {
      System.out.println(num + " * " + i + " = " + (num * i));
      i++;
    } while (i <= 10);
  }

}
