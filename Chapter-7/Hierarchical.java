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
  public Void setCreditCardType(String CreditCardType){
    this.CreditCardType = CreditCardType;
    return null;
    
  }
}