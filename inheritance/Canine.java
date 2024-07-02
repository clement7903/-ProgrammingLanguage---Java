package inheritance;

/*
 * Abstract classes represent generic concepts / things
 */
public abstract class Canine{ // abstract class has an abstract method
    protected double size;

    public Canine(double size){
        this.size=size;
    }

    public void bark(){
        System.out.println("Woof!");
    }

    public abstract void groom(); // abstract method
}