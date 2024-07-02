public class Insect {
    private double weight;
    private int x;
    private int y;

    /*
     * static constants/variables
     * These are used for all instances of the Insect class.
     * Public/ Private dictates whether
     * Static: Makes the variable a single constant available for all instances of
     * insect class
     * Final: makes it a constant, prevents changes after initialization
     */

    public static final double DIST_WEIGHT_LOSS_FACTOR = 0.001;
    private static int population = 0;

    public Insect(double newWeight, int newX, int newY) {
        weight = newWeight;
        x = newX;
        y = newY;
        population++;
    }

    public static void main(String[] args) {
        Insect bug1 = new Insect(0, 0, 0);
        Insect bug2 = new Insect(5.11, 1, 2);
    }

}