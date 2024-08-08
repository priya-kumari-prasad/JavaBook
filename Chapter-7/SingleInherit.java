class payment{
  private int paymentId;
  private double amount;
  public int getPaymentId()
  {
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


//subclass cheque used extends keyword to get base class properties
class cheque extends payment{
  private String chequeType;
  public String getChequeType(){
    return chequeType;
  }
  public void setChequeType(String chequeType){
    chequeType = chequeType;
  }
}
public class SingleInherit {

  public static void main(String[] args) {
    cheque c1 = new cheque();
    c1.setPaymentId(15);
    c1.setAmount(2600);
    c1.setChequeType("SBI");
    System.out.println("Payment id : "+c1.getPaymentId());
    System.out.println("Payment amount = "+c1.getAmount());
    System.out.println("Payment Cheque type : "+c1.getChequeType());
  }
}