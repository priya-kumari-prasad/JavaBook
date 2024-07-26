class WordSeries {
  public static void main(String[] args) {
    int num = 752;
    int digit, reversed = 0;
    while (num != 0) {
      digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;
    }   

    while (reversed != 0) {
      digit = reversed % 10;
      reversed /= 10;
      switch (digit) {
        case 1:
          System.out.print("One" + "  ");
          break;
        case 2:
          System.out.print("Two ");
          break;
        case 3:
          System.out.print("Three ");
          break;
        case 4:
          System.out.print("Four ");
          break;
        case 5:
          System.out.print("Five ");
          break;
        case 6:
          System.out.print("Six ");
          break;
        case 7:
          System.out.print("Seven ");
          break;

        case 8:
          System.out.print("Eight ");
          break;
        case 9:
          System.out.print("Nine ");
          break;
        case 0:
          System.out.print("Zero ");
          break;
        default:
          System.out.print("Wrong input");
          break;
      }
      
    }
    System.out.println();
  }
}