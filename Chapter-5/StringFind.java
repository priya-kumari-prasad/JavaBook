import java.util.*;
public class StringFind {

  public static void printname(String names[], int number){
    Scanner sc = new Scanner(System.in);
    for(int i = 0;i<number;i++){
      System.out.println("Enter the name of girl "+(i+1)+" : ");
      names[i] = sc.nextLine();
    }
  }
    
    
public static void presentName(String names[], String searchName){
  boolean present = false;
  for(String element: names){
    if(element.equals(searchName))
    present = true;
    break;
  }
  if(present)
    System.out.println("\nThe String "+searchName+" is present in String array.");
    else
    System.out.println("\nThe String "+searchName+" is not present in String array.");

  
  
}

  public static void nameList(String names[], int number){
    System.out.println("-----------------------------------------");
    System.out.println("\nName List: ");
    System.out.println("-----------------------------------------");
    for(int i = 0;i<number;i++){
      System.out.println(names[i]);
    }
  }

  public static void main(String[] args) {
    String name[] = new String[10];
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of girls: ");
    int num = sc.nextInt();
    printname(name, num);
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter name to be searched: ");
    String sname = inp.nextLine();
    nameList(name, num);
    presentName(name, sname);
   
  }
}
