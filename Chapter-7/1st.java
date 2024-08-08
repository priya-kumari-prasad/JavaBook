class fruit{
  String color;
  String name;
  public void fruitdetails(String name, String color){
    System.out.println("Name of the fruit: "+name);
    System.out.println("Color of the fruit: "+color);
  }
}
class Apple extends fruit{
  String benefit = "good for Heart. ";
  public void printDetail(){
    System.out.println("Health benefit = "+benefit);
}
}
class fruitExample{
  public static void main(String[] args) {
    Apple obj = new Apple();
    obj.fruitdetails("Apple", "Red");
    obj.printDetail();
  }
}