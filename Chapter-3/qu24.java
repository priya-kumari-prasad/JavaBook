import java.util.*;

class divLarge {

  public static void main(String[] args) {
    int num1, num2;
    int div;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    sc.close();
    if (num1 > num2 && num2 != 0) {
      div = num1 / num2;
      System.out.println("Division = " + div);
    } else if (num2 > num1 && num1 != 0) {
      div = num2 / num1;
      System.out.println("Division = " + div);
    } else {
      System.out.println("OOPS, you have given wrong input.");
    }

  }

}