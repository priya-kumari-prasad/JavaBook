// wap to get the canonical representation of the string object
class canonical
{
  public static void main(String[] args) {
    String str1 = new String("Hello, My friend") ;
    String str2 = new String("Hello, My friend");
    System.out.println("Without intern: ");
    System.out.println("Str1 == Str2 : "+(str1==str2));

    String canoStr1 = str1.intern();
    String canoStr2 = str2.intern();


    System.out.println("\nWith Intern: ");
    System.out.println("Str1 == Str2 : "+(canoStr1==canoStr2));

  }
}
