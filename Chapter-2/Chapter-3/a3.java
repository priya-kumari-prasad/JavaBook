import java.util.*;

class rightTriangle {
  public static void main(String[] args) {
    float side1, side2, side3;
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter the value of lengths of three sides: ");
    side1 = inp.nextFloat();
    side2 = inp.nextFloat();
    side3 = inp.nextFloat();

    System.out.println("Enter the lengths of three side of triangle : ");
    if ((side1 * side1) == side2 + side3 || (side2 * side2) == side1 + side3 || (side3 * side3) == side1 + side2) {
      System.out.println("The triangle is right Triangle");
    } else {
      System.out.println("NOt right triangle.");
    }
  }
}
