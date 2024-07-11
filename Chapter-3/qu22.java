import java.util.*;

class sphereVol {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of Radius: ");
    float r = sc.nextFloat();
    sc.close();
    float volume = 4 / 3 * 3.14f * r * r * r;

    System.out.println("Volume of Sphere = " + volume);

  }
}
