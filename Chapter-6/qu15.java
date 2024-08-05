class qu15{
  public static void main(String[] args) {
    String str = "Hello, World!";

    char[] charArray = str.toCharArray();
    System.out.println("The character array is:");
    for(char c: charArray){
      System.out.print(c+" ");
    }
    System.out.println();
  }
}
