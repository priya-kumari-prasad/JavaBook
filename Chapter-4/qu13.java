class ConstructorMethod {
  String name;
  int age;

  // Default Constructor
  public ConstructorMethod() {
    // this.name = "Default name";
    System.out.println("Default Constructor");
  }

  // Parametrized Constructor
  public ConstructorMethod(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // method with no return type and no argument
  public void display() {
    System.out.println("name = " + this.name + "\tAge = " + this.age);

  }

  // method with no return type but with argument
  public void display(int id, String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("id = " + id + "\tName = " + name + "\tAge = " + age);
  }

  // method with return type and with argument
  public int display(int id, String name, int age, String course) {
    System.out.println("id = " + id + "\tName = " + name + "\tAge = " + age + "\t\tCourse = " + course);
    return id;
  }

}

class main {
  public static void main(String[] args) {
    ConstructorMethod c1 = new ConstructorMethod();
    ConstructorMethod c2 = new ConstructorMethod("Aadhya", 20);
    c2.display();
    c2.display(101, "Meera", 21);
    c2.display(102, "Priya", 2, "BSC");
  }
}
