import java.util.*;

class multiple {
  int num1, num2;

  void input() {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    num1 = inp.nextInt();
    num2 = inp.nextInt();
  }

  void operation() {
    if (num1 % num2 == 0) {
      System.out.println(num1 + " is the multiple of " + num2);
    } else {
      System.out.println(num1 + " is not the multiple of " + num2);
    }
  }
}

class main {
  public static void main(String[] args) {
    multiple m = new multiple();
    m.input();
    m.operation();
  }
}