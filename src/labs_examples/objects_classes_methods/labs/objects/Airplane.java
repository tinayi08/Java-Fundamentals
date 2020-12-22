package labs_examples.objects_classes_methods.labs.objects;

import java.util.ArrayList;

public class Airplane {

    private String airline;
    private int seats;
    private double currentFuel;
    private double fuelCapacity;
    private ArrayList<JetEngine> engines = new ArrayList<>();
    private Galley galley;

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(double currentFuel) {
        this.currentFuel = currentFuel;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public ArrayList<JetEngine> getEngines() {
        return engines;
    }

    public void setEngines(ArrayList<JetEngine> engines) {
        this.engines = engines;
    }

    public Galley getGalley() {
        return galley;
    }

    public void setGalley(Galley galley) {
        this.galley = galley;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuel=" + currentFuel +
                ", airline='" + airline + '\'' +
                ", seats=" + seats +
                '}';
    }


}
class JetEngine {
    private double thrust;
    private int horsepower;
    private double fuelConsumption;
    private int turbineSpeed;

    public double getThrust() {
        return thrust;
    }

    public void setThrust(double thrust) {
        this.thrust = thrust;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getTurbineSpeed() {
        return turbineSpeed;
    }

    public void setTurbineSpeed(int turbineSpeed) {
        this.turbineSpeed = turbineSpeed;
    }
}

class Galley {
    private int numFridge;
    private int maxMeals;
    private FoodCart cart;

    public Galley() {

    }
    public Galley(int numFridge, int maxMeals, FoodCart cart) {
        this.numFridge = numFridge;
        this.maxMeals = maxMeals;
        this.cart = cart;
    }

    public int getNumFridge() {
        return numFridge;
    }

    public void setNumFridge(int numFridge) {
        this.numFridge = numFridge;
    }

    public int getMaxMeals() {
        return maxMeals;
    }

    public void setMaxMeals(int maxMeals) {
        this.maxMeals = maxMeals;
    }

    public FoodCart getCart() {
        return cart;
    }

    public void setCart(FoodCart cart) {
        this.cart = cart;
    }
}

class FoodCart {
    private int numWineBottles;
    private int numFoodTrays;

    public int getNumWineBottles() {
        return numWineBottles;
    }

    public void setNumWineBottles(int numWineBottles) {
        this.numWineBottles = numWineBottles;
    }

    public int getNumFoodTrays() {
        return numFoodTrays;
    }

    public void setNumFoodTrays(int numFoodTrays) {
        this.numFoodTrays = numFoodTrays;
    }
}

class PlaneExample {
    public static void main(String[] args) {
       JetEngine engine1 = new JetEngine();
       engine1.setThrust(500.5);
       engine1.setFuelConsumption(50);

       JetEngine engine2 = new JetEngine();
       engine2.setThrust(500.5);
       engine2.setFuelConsumption(50);

       FoodCart cart = new FoodCart();
       cart.setNumFoodTrays(100);
       cart.setNumWineBottles(75);

       Galley galley = new Galley(5, 125, cart);
       Galley galley1 = new Galley();


       Airplane plane = new Airplane();
       plane.setAirline("United");
       plane.setCurrentFuel(100);
       plane.getEngines().add(engine1);
       plane.getEngines().add(engine2);
       plane.setFuelCapacity(300);
       plane.setSeats(100);
       plane.setGalley(galley);

       System.out.println("This plane can serve up to " + plane.getGalley().getMaxMeals() + " meals");
        System.out.println(plane.toString());
    }
}