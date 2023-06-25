package src;

public class mainprogram {

  public static void main (String args[])
    {
      // Instatiate objects from classes
      HelloWorld obj = new HelloWorld();
      Numbers obj2 = new Numbers();

      System.out.println(obj2.integer1);

      // Invoking methods from classes + using while loops
      while (obj2.integer1 < 20) {
        obj2.add_one_to_int_one();
        System.out.println(obj2.integer1);
      }

      // Switch Statement
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

      // Prints the attributes of HelloWorld class & Numbers class
      System.out.println(obj.text);
      
    }
  
}