import java.util.*;
class TestScore{
  public static void classAvg(int number[]){
    int sum = 0, avg = 0;
    for(int i = 0;i<number.length;i++){
      sum += number[i];
      
    }
    avg = sum/number.length;
    System.out.println("Average test scores = "+avg);
    System.out.println("List of all students with test scores below the class average:-  ");
    for(int i = 0;i<number.length;i++){
      if(avg>number[i]){
        System.out.println(number[i]);
      }
    }
    System.out.println("List of all students with test scores above the class average:- ");
    for(int i = 0;i<number.length;i++){
      if(avg < number[i])
        System.out.println(number[i]);
    }
  }
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int num[] = new int[50];
    // This part of the code is responsible for taking input test scores for 5 students and displaying
    // them. Here's a breakdown:
    for(int i=0;i<50;i++){
    System.out.println("Enter test score of student "+(i+1)+": ");
    num[i] = sc.nextInt();
    }
    System.out.println("Score list of 50 students");
    for(int i = 0;i<50;i++){
      System.out.print(num[i]+"  ");
    }
    System.out.println();
   classAvg(num);


  }  
}
