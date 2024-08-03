class strBuffer {
  public static void main(String[] args) {
    String str = "Hey, How are You? ";
    StringBuffer sb = new StringBuffer("Hlo, I am perfectly fine.");
    if(str.equals(sb)){
      System.out.println("Both are equal.");
    }
    
    else if (str.contains(sb)){
      System.out.println("Str2 is available in Str1");
    }
   
    else
       System.out.println("You have given different string.");
    
  }  
}
