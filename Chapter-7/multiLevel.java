//Multilevel Inheritance
//base class
class payment{
  private int paymentId;
  private double amount;
  public int getPaymentId(){
    return paymentId;
  }
  public void setPaymentId(int paymentId){
    this.paymentId = paymentId;

  }
  public double getAmount(){
    return amount;
  }
  public void setAmount(double amount){
    this.amount = amount;
    }
}

//subclass from baseclass
class cheque extends payment{
  private String ChequeType;
  public String getChequeType(){
    return ChequeType;
  }
  public void setChequeType(String chequeType){
    ChequeType = chequeType;
  }
}

// inheriting from subclass cheque

class CreditCard extends cheque{
  private String CreditCardType;
  public String getCreditCardType(){
    return CreditCardType;
  }
  public void setCreditCardType(String creditCardType){
    CreditCardType = creditCardType;
  }
}

/**
 * multiLevel
 */
public class multiLevel {

  public static void main(String[] args) {
    CreditCard c1 = new CreditCard();
    c1.setPaymentId(15);  //baseclass method
    c1.setAmount(2600);
    c1.setChequeType("SBI");
    c1.setCreditCardType("VISA");

    System.out.println("payment id = "+c1.getPaymentId());
    System.out.println("Payment amount = "+c1.getAmount() );
    System.out.println("Check Type = "+c1.getChequeType());
    System.out.println("Check Credit Card Type = "+c1.getCreditCardType());
  }
}  