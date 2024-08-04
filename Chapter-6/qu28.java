class buffer {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Java");
    sb.insert(4, " is Popular ");
    sb.append("Language");
    System.out.println(sb.capacity());
    System.out.println(sb);
    
  }
  
}
