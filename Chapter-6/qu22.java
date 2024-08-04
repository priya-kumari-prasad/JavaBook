class replace {
  public static void main(String[] args) {
    String str = "ram is the friend of shyam, and he is also friend of anam and jam, all three are best friends.";
    String regex = "am";
   String replaceStr = "tr";
   System.out.println(str.replaceAll(regex, replaceStr));
    
  }
  
}
