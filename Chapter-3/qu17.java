import java.util.*;

class evenOddSum {
  public static void main(String[] args) {
    int evenSum = 0, oddSum = 0;
    int num;
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter Integer value: ");
    String input = inp.nextLine();
    // System.out.println(name);
    String[] numStr = input.split(" ");

    for (String numberStr : numStr) {
      num = Integer.parseInt(numberStr);
      if (num % 2 == 0) {
        evenSum = evenSum + num;
      } else {
        oddSum += num;
      }
    }

    System.out.println("Sum of even Integers = " + evenSum);
    System.out.println("Sum of odd Integers = " + oddSum);
    inp.close();
  }

}
