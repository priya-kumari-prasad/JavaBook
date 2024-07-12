class Modifier {
  int age;
  private String name;

  public void display() {
    System.out.println("PUBLIC METHOD");
    System.out.println("Name: " + name);
    System.out.println("age: " + age + "\n");
  }

  private void show() {
    System.out.println("PRIVATE METHOD");
    System.out.println("name: " + name);
    System.out.println("Age: " + age + "\n");
  }

  protected Modifier(int age) {
    this.age = age;
  }

  public void printNum() {
    System.out.println("CONSTRUCTOR");
    System.out.println("Age = " + this.age + "\n");
  }

}

class main {

  public static void main(String args[]) {
    Modifier m = new Modifier(12);
    m.printNum();
    m.display();
    // m.show(); //it is private

  }
}
