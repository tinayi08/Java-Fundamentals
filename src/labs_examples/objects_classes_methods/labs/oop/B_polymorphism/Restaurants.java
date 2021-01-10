package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;


public class Restaurants implements RestaurantInterface{
    private String name;
    private String cuisine;
    private int capacity;
    private int tables;
    private int AvgTimeSpentInside;

    public int getAvgTimeSpentInside() {
        return AvgTimeSpentInside;
    }

    public void setAvgTimeSpentInside(int avgTimeSpentInside) {
        AvgTimeSpentInside = avgTimeSpentInside;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getTables() {
        return tables;
    }

    public void setTables(int tables) {
        this.tables = tables;
    }

    public Restaurants(String name, String cuisine, int capacity, int tables, int avgTimeSpentInside) {
        this.name = name;
        this.cuisine = cuisine;
        this.capacity = capacity;
        this.tables = tables;
        this.AvgTimeSpentInside = avgTimeSpentInside;
    }

    public void aboutRestaurant(String name, int tables, int capacity) {
        System.out.println(name + " has " + tables + " tables");
    }

    public void basics(String name, String cuisine) {
        System.out.println(name + " is a " + cuisine + " restaurant");
    }

    @Override
    public void capacity(int capacity) {
        System.out.println("this place has a capacity of " + capacity + " people.");
    }

    @Override
    public void time(int avgTimeSpentInside) {
        System.out.println("The average time people spend inside to eat is about " + avgTimeSpentInside + " minutes.");

    }
}
class Bars extends Restaurants {
    int liquorsServed;
    int barStools;
    int TVScreens;
    String specialityDrink;

    public int getLiquorsServed() {
        return liquorsServed;
    }

    public void setLiquorsServed(int liquorsServed) {
        this.liquorsServed = liquorsServed;
    }

    public int getBarStools() {
        return barStools;
    }

    public void setBarStools(int barStools) {
        this.barStools = barStools;
    }

    public int getTVScreens() {
        return TVScreens;
    }

    public void setTVScreens(int TVScreens) {
        this.TVScreens = TVScreens;
    }

    public String getSpecialityDrink() {
        return specialityDrink;
    }

    public void setSpecialityDrink(String specialityDrink) {
        this.specialityDrink = specialityDrink;
    }

    public Bars(String name, String cuisine, int capacity, int tables, int avgTimeSpentInside, int liquorsServed, int barStools, int TVScreens, String specialityDrink) {
        super(name, cuisine, capacity, tables, avgTimeSpentInside);
        this.liquorsServed = liquorsServed;
        this.barStools = barStools;
        this.TVScreens = TVScreens;
        this.specialityDrink = specialityDrink;
    }

    public void aboutRestaurant(String name, int capacity, int tables, int barStools) {
        System.out.println(name + " has " + tables + " tables, " + barStools + " bar stools");
    }

    @Override
    public void basics(String name, String cuisine) {
        System.out.println(name + " is a " + cuisine + " bar");
    }
    @Override
    public void capacity(int capacity) {
        System.out.println("this bar has a capacity of " + capacity + " people.");
    }

    @Override
    public void time(int avgTimeSpentInside) {
        System.out.println("The average time people spend inside the bar is " + avgTimeSpentInside + " minutes.");

    }

}


class ArcadeRestaurant extends Restaurants {
    int ArcadeGames;
    int ticketMachines;

    public int getArcadeGames() {
        return ArcadeGames;
    }

    public void setArcadeGames(int arcadeGames) {
        ArcadeGames = arcadeGames;
    }

    public int getTicketMachines() {
        return ticketMachines;
    }

    public void setTicketMachines(int ticketMachines) {
        this.ticketMachines = ticketMachines;
    }

    public ArcadeRestaurant(String name, String cuisine, int capacity, int tables, int avgTimeSpentInside, int arcadeGames, int ticketMachines) {
        super(name, cuisine, capacity, tables, avgTimeSpentInside);
        ArcadeGames = arcadeGames;
        this.ticketMachines = ticketMachines;
    }

    public void aboutRestaurant(String name, int arcadeGames, int ticketMachines){
        System.out.println(name + " is an arcade that has " + arcadeGames + " arcade games and " + ticketMachines + " ticket machines.");
    }

    @Override
    public void capacity(int capacity) {
        System.out.println("this arcade has a capacity of " + capacity + " people.");
    }

    @Override
    public void time(int avgTimeSpentInside) {
        System.out.println("The average time people spend inside the arcade to eat and play games is about " + avgTimeSpentInside + " minutes.");

    }


}

class RestaurantMain {
    public static void main(String[] args) {
    Restaurants restaurant = new Restaurants("The Diner", "American", 50, 15, 45);
    Bars bar = new Bars("The Pub", "Irish", 100, 10, 120, 35, 20, 15, "Whiskey");
    ArcadeRestaurant arcade = new ArcadeRestaurant("Nickel Nickel", "American", 75, 12, 90, 60, 4);

    restaurant.basics(restaurant.getName(), restaurant.getCuisine());
    restaurant.aboutRestaurant(restaurant.getName(), restaurant.getTables(), restaurant.getCapacity());
    restaurant.capacity(restaurant.getCapacity());
    restaurant.time(restaurant.getAvgTimeSpentInside());
    System.out.println();
    bar.basics(bar.getName(), bar.getCuisine());
    bar.aboutRestaurant(bar.getName(), bar.getCapacity(), bar.getTables(), bar.getBarStools());
    bar.capacity(bar.getCapacity());
    bar.time(bar.getAvgTimeSpentInside());
    System.out.println();
    arcade.aboutRestaurant(arcade.getName(), arcade.getArcadeGames(), arcade.getTicketMachines());
    arcade.capacity(arcade.getCapacity());
    arcade.time(arcade.getAvgTimeSpentInside());
    }
}

interface RestaurantInterface {
    public void capacity(int capacity);
    public void time(int avgTimeSpentInside);

}