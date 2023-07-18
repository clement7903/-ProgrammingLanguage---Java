package src;

import java.util.Scanner;

public class mainprogram {

  public static void main (String args[])
    {
      // Instatiate objects from classes
      HelloWorld obj = new HelloWorld();
      Numbers obj2 = new Numbers();

      // Invoking methods from classes + using while loops
      System.out.println("---------------------------------------- Invoking methods from classes + using while loops");
      while (obj2.integer1 < 20) {
        obj2.add_one_to_int_one();
        System.out.println(obj2.integer1);
      }
      System.out.println("");
      
      // Ternary operator aka. alternative to if then else statement
      System.out.println("---------------------------------------- Ternary operator aka. alternative to if then else statement");
      int max_value = (obj2.integer1 > obj2.integer2) ? obj2.integer1 : obj2.integer2;
      System.out.printf("The largest integer out of %d and %d is: %d%n", obj2.integer1, obj2.integer2, max_value);
      System.out.println("");

      // using arguments in methods & using printf
      System.out.println("---------------------------------------- using arguments in methods & using printf");
      int value_to_add = 99;
      System.out.printf("Integer 1 before addition: %d%n",obj2.integer1);
      obj2.add_to_integer1(value_to_add);
      System.out.printf("Integer 1 after adding %d: %d%n",value_to_add, obj2.integer1);
      System.out.println("");

      // Switch Statement
      System.out.println("---------------------------------------- Switch Statement");
      switch (obj2.integer1) {
        case 9:
          System.out.println("Item is 9");
          
          break;

        case 20:
          System.out.println("Item is 20");
          
          break;
      
        default:
          System.out.println("Item is neither 9 or 20");
          break;
      }

      // Class Constructor Overloading - Under Student.java
      System.out.println("---------------------------------------- Class constructor overloading");

      Student james = new Student("james", "1996-12-08", 1234);
      System.out.printf("A new Student record has been created with name: %s, ID: %d, Date of Birth: %s, Age: %d",james.name, james.ID, james.dob, james.age);

      

      Student john = new Student("john");
      System.out.printf("A new Student record has been created with name: %s",john.name);

      System.out.println(" ");

      // adding in command line arguments
      System.out.println("---------------------------------------- Command line arguments");
      // Scanner input = new Scanner(System.in); //read keyboard input
      // System.out.println(input.nextLine());

      // break and continue statements
      System.out.println("---------------------------------------- Break and Continue Statements");
      for (int i = 0; i < 20; i++){
        if (i == 10){
          continue;
        }
        System.out.println(i);
      }

      // Java Arrays
      double[] weekHigh = {80, 60, 75, 69, 72 ,74, 90};
      double highsSum = 0;
      for (int index =0; index < weekHigh.length; index ++){
        highsSum = highsSum + weekHigh[index];
      }
      double averageHighs = highsSum / weekHigh.length;
      System.out.println("Average is: " + averageHighs);
    }
} 