import java.util.*;

class avg {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    // int totcount = 0;
    float avg = 0, sum = 0;
    System.out.println("Enter values: ");
    String input = sc.nextLine();
    String[] numberStr = input.split(" ");

    for (String numStr : numberStr) {
      num = Integer.parseInt(numStr);
      if (num % 2 == 0 && num > 0) {
        System.out.println("Even numbers = " + num);

      }
    }
    for (String numStr : numberStr) {
      num = Integer.parseInt(numStr);
      if (num % 2 != 0 && num > 0) {
        System.out.println("Odd numbers = " + num);
      }
    }
    for (String numStr : numberStr) {
      num = Integer.parseInt(numStr);
      if (num > 0) {
        System.out.println("positive numbers = " + num);
      }
    }

    for (String numStr : numberStr) {
      num = Integer.parseInt(numStr);
      if (num < 0) {
        System.out.println("Negative numbers = " + num);
      }
    }

    for (String numStr : numberStr) {
      num = Integer.parseInt(numStr);
      sum += num;

    }
    // avg += sum / numberStr.length();

    System.out.println(sum);
    avg = sum / (numberStr.length);
    System.out.println("Average = " + avg);
    // System.out.println(numberStr.length);

    sc.close();

  }

}
