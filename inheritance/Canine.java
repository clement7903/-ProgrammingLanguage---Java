package inheritance;

/*
 * Abstract classes represent generic concepts / things.
 * We do not know the exact implementation for the child classes, 
 * hence we keep it abstracted and let the child classes define it later on
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