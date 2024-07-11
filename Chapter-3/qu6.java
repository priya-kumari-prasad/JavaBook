
import java.util.*;

class maxSalary {
  public static void main(String[] args) {
    String nm1, nm2, nm3;
    int salary1, salary2, salary3;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name of 3 persons : ");
    nm1 = sc.nextLine();
    nm2 = sc.nextLine();
    nm3 = sc.nextLine();
    System.out.println("Enter Salary: ");
    salary1 = sc.nextInt();
    salary2 = sc.nextInt();
    salary3 = sc.nextInt();
    sc.close();
    if ((salary1 > salary2) && (salary1 > salary3)) {
      System.out.println(nm1 + " has Maximum Salary");
    } else if ((salary2 > salary1) && (salary2 > salary3)) {
      System.out.println(nm2 + "has Maximum salary");
    } else {
      System.out.println(nm3 + "has Maximum salary");
    }

  }
}
