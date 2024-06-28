import java.util.*;

class evenOddSum {
  public static void main(String[] args) {
    int evenSum = 0, oddSum = 0;
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter Integer value: ");
    int num = inp.nextInt();

    if (num % 2 == 0) {
      evenSum = evenSum + num;
    } else {
      oddSum += num;
    }
    System.out.println("Sum of even Integers = " + evenSum);
    System.out.println("Sum of odd Integers = " + oddSum);
  }

}
