import java.util.*;

class avgTemp {
  public static void main(String[] args) {
    int day1, day2, day3, day4, day5, day6, day7;
    float temperatures;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter temperatures of 7 days one by one: ");
    day1 = sc.nextInt();
    day2 = sc.nextInt();
    day3 = sc.nextInt();
    day4 = sc.nextInt();
    day5 = sc.nextInt();
    day6 = sc.nextInt();
    day7 = sc.nextInt();
    temperatures = (day1 + day2 + day3 + day4 + day5 + day6 + day7) / 7;
    System.out.println("Average temperatures = " + temperatures);

  }

}
