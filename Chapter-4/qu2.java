class Student {
  int rollNo;
  String name;

  Student(int rollNo, String name) {
    this.rollNo = rollNo;
    this.name = name;
  }

  void display() {
    System.out.println("Roll No: " + this.rollNo);
    System.out.println("Name: " + this.name);
  }
}

class Main {
  public static void main(String[] args) {
    Student student1 = new Student(1, "Alice");

    // Call the display method to show the details of student1
    student1.display();
  }
}
