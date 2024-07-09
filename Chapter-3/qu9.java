import java.util.*;

class nine {
  public static void main(String[] args) {
    int number;
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter number to convert in Roman numerals: ");
    number = inp.nextInt();
    inp.close();

    StringBuilder roman = new StringBuilder();
    while (number >= 1000) {
      roman.append("M");
      number -= 1000;
    }
    while (number >= 500) {
      roman.append("D");
      number -= 500;
    }
    while (number >= 100) {
      roman.append("C");
      number -= 100;
    }
    while (number >= 50) {
      roman.append("L");
      number -= 50;
    }
    while (number >= 10) {
      roman.append("X");
      number -= 10;
    }
    while (number >= 5) {
      roman.append("V");
      number -= 5;
    }
    while (number >= 4) {
      roman.append("IV");
      number -= 4;
    }
    while (number >= 1) {
      roman.append("I");
      number -= 1;
    }
    System.out.println("The number in roman numerals is :" + roman.toString());
  }

}