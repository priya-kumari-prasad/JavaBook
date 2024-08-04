import java.time.*;
import java.time.format.DateTimeFormatter;
class date_time {
  public static void main(String[] args) {
   LocalDateTime now = LocalDateTime.now();
  //  System.out.println(LocalDateTime); 


   //define the desired format
   DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss" );
   
  //  format the current date and time using the defined format
    String formattedDateTime = now.format(formate);

    //print the formatted date and time
    System.out.println("Current Date and Time: "+formattedDateTime);

  } 
}
