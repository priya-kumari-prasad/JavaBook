class Person{
  private String name;
  private int age;

  //constructor
  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  public void display(){
    System.out.println(this.name);
    System.out.println(this.age);
  }

}
class Main{
  public static Person createPerson(String name, int age){
    return new Person(name, age);
  }
  public static void main(String[] args) {
    //creating a person object using the createPerson method
    Person person = createPerson("Aadhya", 20);

    person.display();
  }
}
