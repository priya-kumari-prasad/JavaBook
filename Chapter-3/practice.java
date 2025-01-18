import java.util.Scanner;

class factors {
  public static void main(String args[]){
    int n, d = 2;
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter a number: ");
    n = inp.nextInt();
    System.out.println("The number is : "+n);
    System.out.println("The factors are : ");
    do{
      if(n%d == 0)
        System.out.print(d+" ");
      ++d;
    }
      while(d <= n/2);
      System.out.print(n);
      System.out.println();
      
  }
}



/* import java.util.Scanner;
class palindrome{
  public static void main(String args[]){
    int n, rev= 0;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    
  }
} */