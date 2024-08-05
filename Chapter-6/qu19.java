class regionMatch {
 public static void main(String[] args) {
  String str1 = "Hello, World!";
  String str2 = "World";

  //using regionMatches() for case-sensitive comparison
  boolean result1 = str1.regionMatches(7, str2, 0, str2.length());

  //using regionMatches(true, ...) for case-insensitive comparison
  boolean result2 = str1.regionMatches(true, 7, str2,0, str2.length());


  System.out.println("Case-sensitive match: "+result1);
  System.out.println("Case-insensitive match: "+result2);
 }  
}
