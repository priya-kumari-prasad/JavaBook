import java.util.*;
public class StringArray {
  /* declare a string array and reads String constants.
   * The String constants ar displayed in two ways.
   */
  public static void main (String a[]){
    String states[] = new String[5];
    int i;
    Scanner inp = new Scanner(System.in);
    for(i= 0;i<states.length;i++){
      System.out.print("Enter state name "+(i+1)+" : ");
      states[i] = inp.nextLine();
    }


    System.out.println("\State Name: ");
    for(i = 0;i<states.length;i++){
      System.out.println(states[i]);
    }

      System.out.println("\nEnhanced for - state Name ");
      for(String element : states){
        System.out.println(element);
      }
    }
  
}
