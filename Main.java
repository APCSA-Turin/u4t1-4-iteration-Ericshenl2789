
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number that is either positive, even, and a multiple of 7 OR prime:");
    int userNumber = scanner.nextInt();
    while((userNumber <= 0 || userNumber % 2 == 1 || userNumber % 7 != 0) && !isPrime(userNumber)){
      if (userNumber <= 0){
        System.out.println("> Not positve.");
      }
      if(userNumber % 2 != 0){
        System.out.println("> Not even");
      }
      if (userNumber % 7 != 0) {
        System.out.println("> Not a multiple of 7");
      }
      System.out.print("Try again: ");
      userNumber = scanner.nextInt();
    }
    if (isPrime(userNumber)) {
      System.out.println("Well done, " + userNumber + " is prime!");
    } else {
      System.out.println("Well done, " + userNumber + " is a postive, even, multiple of 7!");
    }

  }

  /* Returns true if number is prime and false
        if it is not prime; if number is 1, return false */
  private static boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }

    int currentDivisor = 2; //start at 2 since no need to check 1

    while (currentDivisor < number) {
      if (number % currentDivisor == 0) {
        return false;  // breaks the loop AND exits the method
      }
      currentDivisor++;
    }
    return true;
  }
}

