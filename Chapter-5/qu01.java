import java.util.*;

class PrintWords {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a Number: ");
    // int num = sc.nextInt();
    int num = 345;
    int digit, reversed = 0;
    while (num != 0) {
      digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;

    }
    while (reversed > 0) {
      digit = reversed % 10;
      reversed /= 10;
      switch (digit) {
        case 1:
          System.out.print("one ");
          break;
        case 2:
          System.out.print("two ");
          break;
        case 3:
          System.out.print("three ");
          break;
        case 4:
          System.out.print("four ");
          break;
        case 5:
          System.out.print("five");
          break;
        case 6:
          System.out.print("six ");
          break;
        case 7:
          System.out.print("seven ");
          break;
        case 8:
          System.out.print("eight ");
          break;
        case 9:
          System.out.print("nine ");
          break;
        case 0:
          System.out.print("zero ");
          break;
        default:
          System.out.println("Invalid input");
          break;
      }

    }
    System.out.println();

  }
}
