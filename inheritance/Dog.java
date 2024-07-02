package inheritance;

public class Dog extends Canine { // inherits the 
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

    // just to 
    public void groom(){}
}
