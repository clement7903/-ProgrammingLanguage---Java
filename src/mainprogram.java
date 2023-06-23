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

      // Prints the attributes of HelloWorld class & Numbers class
      System.out.println(obj.text);
      
    }
  
}