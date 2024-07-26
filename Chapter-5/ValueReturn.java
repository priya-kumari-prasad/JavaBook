import java.util.*;
public class ValueReturn {
  /* Reads an array and passes to the methods.
  calculates the batting average and returns
   */
  public static void readarray(int []b, int size1){
    Scanner inp = new Scanner(System.in);
    for(int i = 0;i<size1;i++){
      System.out.print("Enter the Score for the "+(i+1)+" ODI");
      b[i] = inp.nextInt();
    }
  }  
  public static double battingavg(int []b, int size1){
    int i, total = 0;
    double avg = 0;
    for(i = 0;i<size1;i++){
      total += b[i];
      avg = total/size1;
    }
    return avg;
  }

  public static void printarray(int b[], int size1){
    for(int i = 0;i<size1;i++){
      System.out.println("Match :   "+(i+1)+"    "+b[i]);
    }
  }
  public static void main(String args[]){
    int score[] = new int[10];
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size = inp.nextInt();
    
    readarray(score, size);
    double a = battingavg(score, size);
    System.out.println("\nBatting performance of the batsman: ");
    System.out.println("----------------------------------------------------------------------");
    printarray(score, size);
    System.out.println("-----------------------------------------------------------------------");
    System.out.println("Batting Average: "+a);
    System.out.println("-----------------------------------------------------------------------");


  }
}
