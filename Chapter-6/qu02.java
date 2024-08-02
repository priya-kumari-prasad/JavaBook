

class StrFun {
  public static void main(String[] args) {
    String s = "I love java Book.";
    // System.out.println(s);

    System.out.println("Length = "+s.length());
    System.out.println("StartsWith function: "+s.startsWith("I"));
    System.out.println("endsWith function: "+s.endsWith("k."));
    System.out.println("index of j = "+s.indexOf("j"));
    System.out.println("Substring functions: "+s.substring(2, 12));
  }
  
}
