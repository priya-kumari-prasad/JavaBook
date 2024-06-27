import java.util.*;

class senFaculty {
  public static void main(String[] args) {
    String name1, name2;
    byte age1, age2;
    Scanner inp = new Scanner(System.in);
    inp.close();

    System.out.println("Enter the name of both person : ");
    name1 = inp.nextLine();
    name2 = inp.nextLine();
    System.out.println("Enter the age of both person: ");
    age1 = inp.nextByte();
    age2 = inp.nextByte();

    if (age1 > age2) {
      System.out.println(name1 + " is Senior faculty");
    } else
      System.out.println(name2 + " is Senior faculty.");

  }
}
