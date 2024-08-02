class compare{
  public static void main(String[] args) {
    String str1 = "Aadhya";
    String str2 = "Aadhya";
    String str3 = "john";


    if(str1.equals(str2)){
      System.out.println(str1+" and "+str2+" are equal.");
    }
    if(!str1.equals(str3)){
      System.out.println("not equal");
    }

  }
}