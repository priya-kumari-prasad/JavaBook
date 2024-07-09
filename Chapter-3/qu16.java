import java.util.*;

class simpCalc {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First integer ");
    int num1 = sc.nextInt();
    System.out.println("Enter second integer: ");
    int num2 = sc.nextInt();
    System.out.println("Enter Operator which you want to perform: ('+', '-', '*', '/', '%')");
    char Operator = sc.next().charAt(0);
    int result = 0;

    switch (Operator) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        if (num2 != 0) {
          result = num1 / num2;
        } else {
          System.out.println("Error(division by 0)");
          return;
        }
      case '%':
        result = num1 % num2;
        break;
      default:
        System.out.println("Invalid Operator");
    }
    System.out.println("Result : " + num1 + " " + Operator + " " + num2 + " = " + result);
    sc.close();
  }
}
