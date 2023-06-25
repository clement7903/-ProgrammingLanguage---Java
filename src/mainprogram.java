package src;

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
    }
}