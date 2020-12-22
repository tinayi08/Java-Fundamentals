package labs_examples.objects_classes_methods.labs.objects;

public class Airport {
    private int numBathrooms;
    private int maxCapacity;
    private int numOfTerminals;
    private Terminals terminals;
    private FoodCourt FoodCourt;
    private int baggageClaims;

    public int getNumBathrooms() {
        return numBathrooms;
    }

    public void setNumBathrooms(int numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getNumOfTerminals() {
        return numOfTerminals;
    }

    public void setNumOfTerminals(int numOfTerminals) {
        this.numOfTerminals = numOfTerminals;
    }

    public Terminals getTerminals(Terminals terminal2) {
        return terminals;
    }

    public void setTerminals(Terminals terminals) {
        this.terminals = terminals;
    }

    public labs_examples.objects_classes_methods.labs.objects.FoodCourt getFoodCourt() {
        return FoodCourt;
    }

    public void setFoodCourts(labs_examples.objects_classes_methods.labs.objects.FoodCourt foodCourt) {
        FoodCourt = foodCourt;
    }

    public int getBaggageClaims() {
        return baggageClaims;
    }

    public void setBaggageClaims(int baggageClaims) {
        this.baggageClaims = baggageClaims;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "numBathrooms=" + numBathrooms +
                ", maxCapacity=" + maxCapacity +
                ", numOfTerminals=" + numOfTerminals +
                ", terminals=" + terminals +
                ", FoodCourt=" + FoodCourt +
                ", baggageClaims=" + baggageClaims +
                '}';
    }
}

class Terminals {
    private int NumGates;
    private String airline;
    private int giftShops;
    private int numOfStarbucks;

    public int getNumGates() {
        return NumGates;
    }

    public void setNumGates(int numGates) {
        NumGates = numGates;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getGiftShops() {
        return giftShops;
    }

    public void setGiftShops(int giftShops) {
        this.giftShops = giftShops;
    }

    public int getNumOfStarbucks() {
        return numOfStarbucks;
    }

    public void setNumOfStarbucks(int numOfStarbucks) {
        this.numOfStarbucks = numOfStarbucks;
    }

    @Override
    public String toString() {
        return "Terminals{" +
                "NumGates=" + NumGates +
                ", airline='" + airline + '\'' +
                ", giftShops=" + giftShops +
                ", numOfStarbucks=" + numOfStarbucks +
                '}';
    }
}
class FoodCourt {
    private int numOfTables;
    private int numOfRestaurants;

    public int getNumOfTables() {
        return numOfTables;
    }

    public void setNumOfTables(int numOfTables) {
        this.numOfTables = numOfTables;
    }

    public int getNumOfRestaurants() {
        return numOfRestaurants;
    }

    public void setNumOfRestaurants(int numOfRestaurants) {
        this.numOfRestaurants = numOfRestaurants;
    }

    @Override
    public String toString() {
        return "FoodCourt{" +
                "numOfTables=" + numOfTables +
                ", numOfRestaurants=" + numOfRestaurants +
                '}';
    }
}


class AirportExample {
    public static void main (String[] args) {
        FoodCourt foodCourt1 = new FoodCourt();
        foodCourt1.setNumOfTables(35);
        foodCourt1.setNumOfRestaurants(4);

        FoodCourt foodCourt2 = new FoodCourt();
        foodCourt2.setNumOfTables(50);
        foodCourt2.setNumOfRestaurants(8);

        Terminals terminal1 = new Terminals();
        terminal1.setAirline("United");
        terminal1.setGiftShops(2);
        terminal1.setNumGates(25);
        terminal1.setNumOfStarbucks(4);

        Terminals terminal2 = new Terminals();
        terminal2.setAirline("Jet Blue");
        terminal2.setNumOfStarbucks(2);
        terminal2.setNumGates(10);
        terminal2.setGiftShops(2);

        Airport ocAirport = new Airport();
        ocAirport.setBaggageClaims(4);
        ocAirport.setFoodCourts(foodCourt1);
        ocAirport.setFoodCourts(foodCourt2);
        ocAirport.setMaxCapacity(2000);
        ocAirport.setNumBathrooms(26);
        ocAirport.setNumOfTerminals(2);
        ocAirport.setTerminals(terminal1);
        ocAirport.setTerminals(terminal2);

        System.out.println("At the OC Airport they have " + ocAirport.getTerminals(terminal2).getNumOfStarbucks() + " Starbucks at Terminal 2");
        System.out.println(ocAirport.toString());
    }
}
