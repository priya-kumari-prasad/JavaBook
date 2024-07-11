
class Cvalue_Cref {

  void change(int y) {
    y = 20;
  }

}

class main2 {
  public static void main(String[] args) {
    Cvalue_Cref c = new Cvalue_Cref();
    int x = 10;
    c.change(x);
    System.out.println(x);

  }
}