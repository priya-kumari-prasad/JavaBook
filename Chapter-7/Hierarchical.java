//hierarchical Inhertance

//base class

class payment{
  private int paymentId;
  private double amount;

  public int getPaymentId(){
    return paymentId;
  }
  public void setPaymentId(int paymentId){
    this.paymentId = paymentId;


  }public double getAmount(){
    return amount;
  }
  public void setAmount(double amount){
    this.amount = amount;
    
  }
}


class Cheque extends payment{
  private String ChequeType;
  public String getChequeType(){
    return ChequeType;
  }
  public void setChequeType(String chequeType){
    ChequeType = chequeType;
  }
}


//another sub class for same base class

class CreditCard extends payment{
  private String CreditCardType;
  public String getCreditCardType(){
    return CreditCardType;
  } 
  public Void setCreditCardType(String creditCardType){
    creditCardType = CreditCardType;
    return null;
  }
}

public class Hierarchical {

  public static void main(String[] args) {
    Cheque c1 = new Cheque();
    c1.setPaymentId(32);
    c1.setAmount(3400);
    c1.setChequeType("AXIS");
    System.out.println("Cheque Id: "+c1.getPaymentId());
    System.out.println("Cheque Amount: "+c1.getAmount());
    System.out.println("Cheque Type: "+c1.getChequeType());


    CreditCard cc = new CreditCard();
    cc.setPaymentId(33);
    cc.setAmount(4300);
    cc.setCreditCardType("ICICI");
    System.out.println("Credit Card id: "+cc.getPaymentId());
    System.out.println("Credit Card Type: "+cc.getCreditCardType());
    System.out.println("Credit Card Amount: "+cc.getAmount());

  }

}
