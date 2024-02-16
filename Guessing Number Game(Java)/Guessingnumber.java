import java.util.*;
public class Guessingnumber {
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);
      int guessenumber = 56;
      int counter = 10;
      System.out.println("please enter the number ");
      while (counter > 0) {
         int userinput = dev.nextInt();
         if (userinput < 0) {
            System.out.println("invalid number. Please enter the valid number " + "you have " + counter +" "+ "chances left");
            continue;
         }
         counter--;
         if (guessenumber > userinput) {
            System.out.println("your number is less " + "you have " + counter +" "+ "chances left");
         
         }
         else if( guessenumber < userinput) {
         System.out.println("your number is big " + "you have " + counter +" "+  "chances left");
         }
         else if( guessenumber == userinput) {
            System.out.println("congrats you won ");
            break;
         }
      }
    }
}
