class Product {
  int a, b, c;

  Product(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
    System.out.println("Product of three Integers = " + a * b * c);
  }
}

class ProductMain {
  public static void main(String[] args) {
    Product p = new Product(3, 5, 6);
  }
}
