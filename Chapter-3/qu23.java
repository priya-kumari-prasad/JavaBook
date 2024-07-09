import java.util.*;

class cubeSum {
  public static void main(String[] args) {
    int num, flag, sum = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number b/w 1 to 100: ");
    num = scanner.nextInt();
    scanner.close();
    Integer obj2 = num;
    for (int i = 1; i <= 200; i++) {
      flag = num % 10;
      sum += flag * flag * flag;
      num /= 10;
    }
    // System.out.println("sum = " + sum);
    Integer obj1 = sum;
    if (obj1.equals(obj2)) {
      System.out.println("\'wow\',\"Sum of the cubes of the digits are equal\"");
    } else
      System.out.println("sum of the cubes of the digits are not equal.");

  }
}
