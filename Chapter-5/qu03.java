class Grade{
  public static void main(String[] args) {
    char grade[] = {'A', 'C','D', 'B', 'A', 'C', 'E', 'B', 'G'};
    for(int i = 0;i<grade.length;i++){
      System.out.print(grade[i] +"  ");
    }
    System.out.println();
    System.out.println("Top 5 Grade is: ");
    for(int i = 0;i<5;i++){
      System.out.println("Grade "+(i+1)+" = "+grade[i]);
    }
  }
}