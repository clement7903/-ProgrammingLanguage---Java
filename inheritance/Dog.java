package inheritance;

public class Dog extends Canine { // inherits the super class Canine
    protected String name;

    public Dog(String name, double size){
        super(size); // parameter here matches the super class constructor's parameters
        this.name=name;
    }

    public void fetch(){
        System.out.println("Run!");
        System.out.println("Clinch!");
        System.out.println("Return");
    }

    // just to override the abstract method - this is needed because it is a child class of a parent abstract class
    public void groom(){}
}
