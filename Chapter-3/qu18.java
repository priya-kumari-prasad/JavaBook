import java.util.*;

class prime {
  public static void main(String[] args) {
    int num;
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter number to check Prime: ");
    inp.close();
    for (num = inp.nextInt(); num > 2;) {
      boolean isPrime = true;
      for (int i = 2; i < num; i++) {
        if (num % i == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        System.out.println(num + " is a prime number");
        break;
      } else {
        System.out.println(num + " is not prime number");
        break;
      }
    }

  }

}
