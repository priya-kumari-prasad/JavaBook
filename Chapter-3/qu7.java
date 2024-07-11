import java.util.*;

class calcSales {

  public static void main(String[] args) {
    float sales, Commission;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter sales value: ");
    sales = sc.nextFloat();
    sc.close();
    if (sales < 1000) {
      System.out.println("Sales = " + sales + " So, There is no Commission.");
    } else if (sales > 1000 && sales < 5000) {
      Commission = sales * 0.1f;
      System.out.println("Sales = " + sales + " \nSo the commission is " + Commission);

    } else if (sales > 5000) {
      Commission = 2000 + (0.8f * sales);
      System.out.println("Sales = " + sales + "\n So the commision is " + Commission);
    }

  }
}
