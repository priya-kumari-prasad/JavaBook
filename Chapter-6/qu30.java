import java.util.StringTokenizer;

class tokenizer {
public static void main(String[] args) {
  String str = "java is fun and easy to learn";
  String[] tokens = str.split("\\s+");
  for(String token : tokens){
    System.out.println(token);
  }

  StringTokenizer tokenizer = new StringTokenizer(str);

  while (tokenizer.hasMoreTokens()) {
    String token2 = tokenizer.nextToken();
    System.out.println(token2);
    
  }
}  
}
