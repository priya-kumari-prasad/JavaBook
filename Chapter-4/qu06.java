class car {
  String brand;
  String model;
  int year;

  public void accelerate() {
    System.out.println("This car has accelerate");
  }

  public void brake() {
    System.out.println("This car has break");
  }

}

class main {
  public static void main(String[] args) {
    car mycar = new car();
    car friendsCar = new car();

    mycar.brand = "BMW";
    mycar.model = "i7";
    mycar.year = 2002;

    friendsCar.brand = "Suzuki";
    friendsCar.model = "Alto 800";
    friendsCar.year = 1989;

    mycar.accelerate();
    friendsCar.brake();

    System.out.println("My Car: " + mycar.brand + "  " + mycar.model + "  " + mycar.year);
    System.out.println("Friends Car: " + friendsCar.brand + "  " + friendsCar.model + "  " + friendsCar.year);
  }
}
