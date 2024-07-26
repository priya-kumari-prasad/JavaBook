import java.util.*;

class Test {
  public static void main(String[] args) {
    int correct_ans[] = { 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1 };
    int student_ans[][] = { { 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, },
        { 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, },
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
    for (int i = 0; i < student_ans.length; i++) {
      int score = 0;
      for (int j = 0; j < correct_ans.length; j++) {
        if (student_ans[i][j] == correct_ans[j]) {
          score += 2;
        } else {
          score -= 1;
        }
      }
        int maxScore = correct_ans.length * 2;
        double percentage =((double)score / maxScore) * 100;

        char grade;
        if (percentage >= 90) {
          grade = 'o';
        } else if (percentage >= 80)
          grade = 'A';
        else if (percentage >= 70) {
          grade = 'B';

        } else if (percentage >= 60) {
          grade = 'C';
        } else{
          grade = 'D';
        }
        System.out.printf("Student = %d, Answer = %s, score = %d, percentage = %.2f, grade = %c", i+1, arrayToString(student_ans[i]), score,percentage, grade);
        System.out.println();
      }
      
    
    }
    public static String arrayToString(int [] array){
      StringBuilder sb = new StringBuilder();
      sb.append("[");
      for(int i = 0;i<array.length;i++){
        sb.append(array[i]);
        if(i<array.length-1){
          sb.append(", ");
        }
      }
      sb.append("]");
      return sb.toString();
    

  }
}