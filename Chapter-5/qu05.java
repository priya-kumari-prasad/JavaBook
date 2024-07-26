class Range {
  public static void main(String[] args) {

    int[] TestScore = {2,34,12, 39, 23, 90, 87, 45, 32, 11, 64,65, 5, 9, 54,35, 29, 41, 69, 70, 75, 32, 82, 89, 92, 99, 100, 59, 53, 71, 78, 49};
    int count = 0;
    
    System.out.println("Score ranges between 0-10 :-");
    for (int i = 0; i < TestScore.length; i++) {
      if (TestScore[i] >= 0 && TestScore[i] <= 10) {
        System.out.print(TestScore[i] + "  ");
        count++;
      }
    }
    System.out.println("\nStudent b/w 0-10 range = " + count);
    count = 0;

    System.out.println("\nScore ranges b/w 11-20 :-");
    for (int i = 0; i < TestScore.length; i++) {
      if (TestScore[i] > 10 && TestScore[i] < 21) {
        System.out.print(TestScore[i] + "  ");
        count++;
      }
    }
    System.out.println("\nStudent b/w 11-20 range = " + count);

    count = 0;

    System.out.println("\nScore ranges b/w 21-30 :-");
    for (int i = 0; i < TestScore.length; i++) {
      if (TestScore[i] > 20 && TestScore[i] < 31) {
        System.out.print(TestScore[i] + "  ");
        count++;
      }
    }
    System.out.println("\nStudent b/w 21-30 range = " + count);
    count = 0;

    System.out.println("\nScore ranges b/w 31-40 :-");
    for (int i = 0; i < TestScore.length; i++) {
      if (TestScore[i] > TestScore.length && TestScore[i] < 41) {
        System.out.print(TestScore[i] + "  ");
        count++;
      }
    }
    System.out.println("\nStudent b/w 31-40 range = " + count);
    count = 0;

    System.out.println("\nScore ranges b/w 41-50 :-");
    for (int i = 0; i < TestScore.length; i++) {
      if (TestScore[i] > 40 && TestScore[i] < 51) {
        System.out.print(TestScore[i] + "  ");
        count++;
      }
    }
    System.out.println("\nStudent b/w 41-50 range = " + count);
    count = 0;

    System.out.println("\nScore ranges b/w 51-60 :-");
    for (int i = 0; i < TestScore.length; i++) {
      if (TestScore[i] > 50 && TestScore[i] < 61) {
        System.out.print(TestScore[i] + "  ");
        count++;
      }
    }
    System.out.println("\nStudent b/w 51-60 range = " + count);
    count = 0;

    System.out.println("\nScore ranges b/w 61-70 :-");
    for (int i = 0; i < TestScore.length; i++) {
      if (TestScore[i] > 60 && TestScore[i] < 71) {
        System.out.print(TestScore[i] + "  ");
        count++;
      }
    }
    System.out.println("\nStudent b/w 61-70 range = " + count);
    count = 0;

    System.out.println("\nScore ranges b/w 71-80 :-");
    for (int i = 0; i < TestScore.length; i++) {
      if (TestScore[i] > 70 && TestScore[i] < 81) {
        System.out.print(TestScore[i] + "  ");
        count++;
      }
    }
    System.out.println("\nStudent b/w 71-80 range = " + count);
    count = 0;

    System.out.println("\nScore ranges b/w 81-90 :-");
    for (int i = 0; i < TestScore.length; i++) {
      if (TestScore[i] > 80 && TestScore[i] < 91) {
        System.out.print(TestScore[i] + "  ");
        count++;
      }
    }
    System.out.println("\nStudent b/w 81-90 range = " + count);
    count = 0;

    System.out.println("\nScore ranges b/w 91-100 :-");
    for (int i = 0; i < TestScore.length; i++) {
      if (TestScore[i] > 90 && TestScore[i] < 101) {
        System.out.print(TestScore[i] + "  ");
        count++;
      }
    }
    System.out.println("\nStudent b/w 91-100 range = " + count);

  }
}