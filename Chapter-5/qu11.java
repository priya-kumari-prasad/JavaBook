import java.util.*;
class TwoDim {
  public static void main(String[] args) {
    int [][]arr = new int[10][10];

    int value = 100;
    for(int i = 0;i<10;i++){
      for(int j = 0;j<10;j++){
        arr[i][j] = value--;
      }
    }
    System.out.println("Before Sorting the 10 * 10 matrix is : ");
    for(int i = 0;i<10;i++){
      for(int j = 0;j<10;j++){
        System.out.print(arr[i][j]+"    ");
      }
      System.out.println();
    }

    System.out.println("\nAfter sorting the 10 * 10 matrix is : ");
    for(int i = 0;i<10;i++)
      Arrays.sort(arr[i]);

    for(int i =0 ;i<10;i++){
      for(int j = 0;j<10;j++){
        System.out.print(arr[i][j]+"    ");
      }
      System.out.println();
    }
  }
  
}
