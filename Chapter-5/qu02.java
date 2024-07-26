class Permutation{
  public static void main(String[] args) {
    String Short = "abc";
    System.out.println("All possible permutations are: ");
    generatePerm(Short,"");
  }
  private static void generatePerm(String str, String prefix){
    int n = str.length();
    if(n == 0){
      System.out.println(prefix);
    }
    else{
      for(int i=0;i<n;i++){
        String remaining = str.substring(0, i)+str.substring(i+1);
        generatePerm(remaining, prefix+str.charAt(i));
      }
    }
  }
}