import java.util.*;
import java.lang.Math;

class Number {
  int a, b, c;

  void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three integers:");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    sc.close();
  }

  void smallest() {
    int min = Math.min(a, Math.min(b, c));
    System.out.println("Smallest = " + min);
  }
}

class Main {
  public static void main(String[] args) {
    Number obj = new Number();
    obj.input();
    obj.smallest();
  }
}
