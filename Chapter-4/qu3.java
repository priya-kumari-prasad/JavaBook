/*
 * class StaticVarMet {
 * static int a = 10;
 * static int b = 70;
 * 
 * static void display(int a) {
 * System.out.println("Addition = " + (a + b));
 * System.out.println("a = " + a);
 * System.out.println("b = " + StaticVarMet.b);
 * 
 * }
 * 
 * public static void main(String[] args) {
 * add(43);
 * }
 * }
 */

class StaticVarMet {
  public static int x = 10;

  public static void add(int a, int b) {
    System.out.println("STATIC METHOD = " + StaticVarMet.x);
    System.out.println("addition = " + (a + b));
    sub(20, 6);
  }

  static int sub(int a, int b) {
    System.out.println("Subtraction = " + (a - b));
    return (a - b);
  }

}

class StaticMain {
  public static void main(String[] args) {

    StaticVarMet.add(32, 1);
    StaticVarMet.x = 35;
    System.out.println("X = " + StaticVarMet.x);
  }
}