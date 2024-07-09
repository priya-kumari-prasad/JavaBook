import java.util.*;

class interest {
  public static void main(String[] args) {
    double totinterest, interest, loanAmount;
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter amount of loan in Rs. ");
    loanAmount = inp.nextDouble();
    if (loanAmount <= 7000) {
      interest = 0.6;
    } else if (loanAmount <= 10000) {
      interest = 0.8;
    } else {
      interest = 0.10;
    }
    totinterest = loanAmount * interest;
    System.out.println("1 year interst for Rs." + loanAmount + " is Rs." + totinterest);
  }

}
