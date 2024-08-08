// Illustration of run-time polymorphism'
//superclass
class shapes{
  int r = 3 ;
  double area ;
  public void calculate(){
    System.out.println("Area of circle: ");
  }
}

class circle extends shapes{
  
  final double pi = 3.14;
  public void calculate(){
  
    area = pi*r*r;
    System.out.println("Area of Circle : "+area);
  }
}

/**
 * dynamicBinding
 */
public class dynamicBinding {

  public static void main(String[] args) {
    circle cr = new circle();
    cr.calculate();
  }
}