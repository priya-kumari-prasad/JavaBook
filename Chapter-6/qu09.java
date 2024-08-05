// WAP to create a new string object with the contents of a character array.
class qu09 {
  public static void main(String[] args) {
    char[] ch = {'h','e','l','l','o'};
    char[] newChar = new char[ch.length];

    for(int i = 0 ;i<ch.length;i++){
      newChar[i] = ch[i];
    }
    for(char c: newChar){
      System.out.print(c);
    }
    
  }
  
}
