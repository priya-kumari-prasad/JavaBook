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