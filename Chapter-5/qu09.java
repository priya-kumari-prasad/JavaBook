import java.util.*;
class Difference {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    System.out.println("Enter First number: ");
    int num = sc.nextInt();
    System.out.println("Enter difference value: ");
    int diff = sc.nextInt();
    do{
      System.out.print(num+" ");
      num += diff;
      count++;
    }
    while (count<=20);
    System.out.println();
  }
  
}
