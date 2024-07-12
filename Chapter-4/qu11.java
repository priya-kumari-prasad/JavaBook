class SavingAccount {

  static double annualInterestRate;

  private double savingBalance;


  // TODO: Create a parameterise contstructor and set the saving balance
  public SavingAccount(double savingBalance){
    this.savingBalance = savingBalance;
  }

  public void calculateMonthlyInterest() {
    savingBalance += (savingBalance * annualInterestRate) / 12;
  }

  public static void modifyInterestRate(double aIR) {
    annualInterestRate = aIR;
  }

  public double getInterestRate() {
    return annualInterestRate;
  }

  // TODO: define a function to get user saving balance
  public double getSavingBalance() {
    return savingBalance;
  }
}

class main {
  public static void main(String[] args) {
    SavingAccount saver1 = new SavingAccount(2000);
    SavingAccount saver2 = new SavingAccount(3000);
    System.out.println(saver2.getSavingBalance());  // 2000
    SavingAccount.annualInterestRate = 4; // 4
    saver1.calculateMonthlyInterest(); // 2666.66
    saver2.calculateMonthlyInterest(); 
    System.out.println("Saver 1 :"+saver1.getSavingBalance()); // 2666
    System.out.println("Saver 2 :"+saver2.getSavingBalance());
    SavingAccount.modifyInterestRate(5); // 5
    saver1.calculateMonthlyInterest();
    saver2.calculateMonthlyInterest();
    System.out.println("Saver 1 :"+saver1.getSavingBalance());
    System.out.println("Saver 2 :"+saver2.getSavingBalance());
  }
}
