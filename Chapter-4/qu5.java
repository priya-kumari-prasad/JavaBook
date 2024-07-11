
class Overloading {
  // Constructor Overloading
  Overloading() {
    System.out.println("1: Constructor Overloading");
  }

  Overloading(String name) {
    System.out.println("2: Constructor Overloading");
  }

  // Method Overloading
  int sum(int a, int b) {
    return a + b;
  }

  int sum(int a, double b) {
    return (int) (a + b);
  }

  void display() {
    System.out.println(sum(10, 20));
    System.out.println(sum(5, 4.5));
  }

  public static void main(String[] args) {
    Overloading ov = new Overloading();
    Overloading ov2 = new Overloading("Srikant");
    ov.display();
  }

}
