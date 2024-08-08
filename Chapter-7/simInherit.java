class superclass{
  String s = "Hello, my friend";
  public superclass(){
    System.out.println("Superclass method: "+s);

  }
}
class subclass extends superclass{
  String i = "Inheritance ";
  public subclass(){
    super();
    System.out.println("Subclass method: "+i);
  }
}



public class simInherit {
  public static void main(String[] args) {
    subclass sb = new subclass();
    
  }
}
