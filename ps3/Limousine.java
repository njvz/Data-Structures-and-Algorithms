/*
* Nathan Van Zandt (nvz@bu.edu)
*  
* Limousine is a sub-class of automobile
*/
public class Limousine extends Automobile {

    private boolean hasSunRoof;
    private int champagneBottles;

    // constructor that takes in values for the make, model, year, number of seats,
    // whether
    // it has a sun roof and how many champagne bottles can be chilled
    public Limousine(String make, String model, int year, int numSeats, boolean hasSunRoof, int champagneBottles) {
        super(make, model, year, numSeats, false);

        if (champagneBottles < 0)
            throw new IllegalArgumentException();

        this.hasSunRoof = hasSunRoof;
        this.champagneBottles = champagneBottles;

    }

    // returns hasSunRoof
    public boolean gethasSunRoof() {
        return hasSunRoof;
    }

    // returns champagneBottles
    public int getchampagneBottles() {
        return champagneBottles;
    }

    // returns string that can be used when printing Limousine
    public String toString() {
        String str = this.getMake() + " " + this.getModel() + " (seats up to " + (getNumSeats() - 2) + " customers)";
        return str;
    }
}
