import java.util.*;
public class TwoDim {

  public static void main(String[] args){
    int marks[][] = new int[5][5];
    Scanner sc = new Scanner(System.in);
    for(int i = 0;i<marks.length-1;i++){
      for(int j = 0;j<marks.length-1;j++){
        System.out.println("Enter the "+(i+1)+" Student's marks: ");
        marks[i][j] = sc.nextInt();
      }
    }
    for(int i = 0;i<marks.length-1;i++){
      marks[i][4] = 0;
      for(int j = 0;j<marks.length-1;j++){
        marks[i][4] += marks[i][j];
      }
    }

    for(int i = 0;i<marks.length-1;i++){
      marks[4][i] = 0;
      for(int j = 0;j<marks.length-1;j++){
        marks[4][i] += marks[i][j];
      }
    }
    marks[4][4] = 0;
    for(int i = 0;i<marks.length-1;i++){
      marks[4][4] += marks[4][i];
    }
    System.out.println("\nSub-1 \t Sub-2  `\t Sub-3  \t Sub-4  \t Total ");
    System.out.println("------------------------------------------------------------------------");
    for(int []a: marks){
      for(int y: a){
        System.out.print(" "+y+"\t");
      }
      System.out.println("\n");
    }
    System.out.println("--------------------------------------------------------------------------");

  }
}