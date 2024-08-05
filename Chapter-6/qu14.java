public class qu14 {
  public static void main(String[] args) {
    String str = "Hello, World!";
    byte[] bytes = str.getBytes();

    System.out.println("Byte array: ");
    for(byte b : bytes){
      System.out.print(b+" ");
    }
    System.out.println();
  }
}
