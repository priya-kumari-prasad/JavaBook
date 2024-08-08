/* class vehicle {
  String brandName;
  double price;
  public void vehicleDetails(){
    System.out.println("Vehicle Details: ");
    System.out.println("Brand of the vehicle: "+brandName);
    System.out.println("Price of the vehicle: "+price);
  }
  
}
class car extends vehicle{
  String color;
  String fuelType;
  public void carDetails(){
    System.out.println("Car Details: "    );
    System.out.println("Color of the car: "+color);
    System.out.println("Type of fuel: "+fuelType);
  }
} 
class main{
  public static void main(String[] args) {
    car obj = new car();
    obj.brandName = "Mercedies";
    obj.price = 200000;
    obj.color = "Silver";
    obj.fuelType = "petrol";
    obj.vehicleDetails();
    obj.carDetails();
  }
} */





//code to illustrate overriding method of the vehicle superclass
/**
 * vehicle
 */
class vehicle {
  public void printDetail(){
    System.out.println("Vehicle details: ");
  }
  
}
class car extends vehicle{
  String fuelType;
  String color;
  public void printDetail(){
    System.out.println("Car details: ");
    System.out.println("carFuelTupe: "+fuelType);

    System.out.println("Car color: "+color);
  }
}
class OverridingMethods{
  public static void main(String[] args) {
    car obj = new car();
    obj.fuelType = "Petrol";
    obj.color = "Red";
    obj.printDetail();
  }
}