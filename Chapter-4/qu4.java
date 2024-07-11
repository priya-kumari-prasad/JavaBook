class Calc {
  void sum() {
    System.out.println("Sum is not defined in Calc Class");

  }
}

class AdCalc extends Calc {

  void sum() { // override of sum method
    System.out.println("Sum is not defined in AdCalc Class");
  }

  void sum(int a, int b) {
    System.out.println(a + b);
  }

  void sum(int a, int b, int c) {
    System.out.println(a + b + c);
  }

}

class MainCalc {
  public static void main(String[] args) {
    AdCalc obj = new AdCalc();
    obj.sum();
    obj.sum(4, 2);
    obj.sum(3, 4, 6);

    Calc obj2 = new Calc();
    obj2.sum();

  }

}
