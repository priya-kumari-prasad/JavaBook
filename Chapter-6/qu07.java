class compare {
  public static void main(String args[]){
    String str1 = "I can do anything.";
    String str2 = "any";

    if(str1.equals(str2)){
      System.out.println("Both are equal");
    }
    else if (str1.contains(str2)){
      System.out.println("Str2 is available in Str1");
    }
    else if(str1.startsWith(str2)){
      System.out.println("The str2 is starts with the str1");
    }
    else if(str1.endsWith(str2)){
      System.out.println("The str2 is ends with str1.");
    }
    else
       System.out.println("You have given different string.");
  }

  
}
