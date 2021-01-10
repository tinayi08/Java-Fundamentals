package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;


public class Mall implements MallInterface{
    private String name;
    private int maxCapacity;
    private int entrance;
    private int numOfRestrooms;

    public int getNumOfRestrooms() {
        return numOfRestrooms;
    }

    public void setNumOfRestrooms(int numOfRestrooms) {
        this.numOfRestrooms = numOfRestrooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getEntrance() {
        return entrance;
    }

    public void setEntrance(int entrance) {
        this.entrance = entrance;
    }

    public Mall(String name, int maxCapacity, int entrance, int numOfRestrooms) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.entrance = entrance;
        this.numOfRestrooms = numOfRestrooms;

    }
   public void mall(String name) {
        System.out.println("Welcome to " + name + ".");
    }
    //method overloading
    public void shop(String name) {
        System.out.println("Come to the mall to shop at " + name + "." );
    }

    //interface
    @Override
    public void restrooms(int numOfRestrooms) {
        System.out.println("The number of restrooms in this mall are " + numOfRestrooms + " this does not include" +
                " the restrooms that are inside individual stores or restaurants");
    }
    //interface
    @Override
    public void maxCapacity(int maxCapacity) {
        System.out.println("The max capacity of the mall is " + maxCapacity);
    }
    //interface
    @Override
    public void entrance(int entrance) {
        System.out.println("There are " + entrance + " entrance(s) in this mall.");
    }
}
//how do i know if these classes should be public or default...? first class i listed as public
//same with the instance variables. how do i know what their access modifiers should be
class Restaurant extends Mall {
    String cuisine;
    int tables;

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public int getTables() {
        return tables;
    }

    public void setTables(int tables) {
        this.tables = tables;
    }

    public Restaurant(String name, int maxCapacity, int entrance, int numOfRestrooms, String cuisine, int tables) {
        super(name, maxCapacity, entrance, numOfRestrooms);
        this.cuisine = cuisine;
        this.tables = tables;
    }

    //method overloading
    public void shop(String name, String cuisine) {
        System.out.println("Come to the mall to shop and stop by to eat at " + name + " it is a " + cuisine + " restaurant.");
    }

    //interface
    @Override
    public void restrooms(int numOfRestrooms) {
        System.out.println("There are " + numOfRestrooms + " restrooms here.");
    }
    //interface
    @Override
    public void maxCapacity(int maxCapacity) {
        System.out.println("The max capacity inside the restaurant is " + maxCapacity);
    }
    //interface
    @Override
    public void entrance(int entrance) {
        System.out.println("There are " + entrance + " entrance(s) to get inside.");
    }
}

class Stores extends Mall {
    int numOfRegisters;
    String typeOfStore;

    public String getTypeOfStore() {
        return typeOfStore;
    }

    public void setTypeOfStore(String typeOfStore) {
        this.typeOfStore = typeOfStore;
    }

    public int getNumOfRegisters() {
        return numOfRegisters;
    }

    public void setNumOfRegisters(int numOfRegisters) {
        this.numOfRegisters = numOfRegisters;
    }

    public Stores(String name, int maxCapacity, int entrance, int numOfRestrooms, int numOfRegisters, String typeOfStore) {
        super(name, maxCapacity, entrance, numOfRestrooms);
        this.numOfRegisters = numOfRegisters;
        this.typeOfStore = typeOfStore;
    }
    //overriding & overloading
    public void checkoutTime(int numOfRegisters) {
        System.out.println("Checkout time can vary based on the number of registers available.");
    }
    //method overriding
    public void typeOfStore(String name, String typeOfStore) {
        System.out.println(name + " is a " + typeOfStore + " store.");
    }

    //interface
    @Override
    public void restrooms(int numOfRestrooms) {
        System.out.println("The number of restrooms inside the store are " + numOfRestrooms + ".");
    }
    //interface
    @Override
    public void maxCapacity(int maxCapacity) {
        System.out.println("The max capacity inside the store is " + maxCapacity);
    }
    //interface
    @Override
    public void entrance(int entrance) {
        System.out.println("There are " + entrance + " entrance(s) to this store.");
    }
}

class JewelryStore extends Stores {
    int numOfGlassCases;
    String typeOfJewelry;

    public int getNumOfGlassCases() {
        return numOfGlassCases;
    }

    public void setNumOfGlassCases(int numOfGlassCases) {
        this.numOfGlassCases = numOfGlassCases;
    }

    public String getTypeOfJewelry() {
        return typeOfJewelry;
    }

    public void setTypeOfJewelry(String typeOfJewelry) {
        this.typeOfJewelry = typeOfJewelry;
    }

    public JewelryStore(String name, int maxCapacity, int entrance, int numOfRestrooms, int numOfRegisters, String typeOfStore, int numOfGlassCases, String typeOfJewelry) {
        super(name, maxCapacity, entrance, numOfRestrooms, numOfRegisters, typeOfStore);
        this.numOfGlassCases = numOfGlassCases;
        this.typeOfJewelry = typeOfJewelry;
    }

    @Override
    public void checkoutTime(int numOfRegisters) {
        System.out.println("Checkout time may seem lengthy since this store only has " + numOfRegisters + " registers however since they provide a more personalized visit, " +
                "you should be on your way out shortly.");
    }
    //interface
    @Override
    public void restrooms(int numOfRestrooms) {
        System.out.println("This store does not have any restrooms. Please use the restroom provided by the mall.");
    }
    //interface
    @Override
    public void maxCapacity(int maxCapacity) {
        System.out.println("The max capacity inside the jewelry store is " + maxCapacity);
    }
    //interface
    @Override
    public void entrance(int entrance) {
        System.out.println("There are " + entrance + " entrance(s) to this store.");
    }
}

class ClothingStore extends Stores {
    String targetMarket;

    public String getTargetMarket() {
        return targetMarket;
    }

    public void setTargetMarket(String targetMarket) {
        this.targetMarket = targetMarket;
    }

    public ClothingStore(String name, int maxCapacity, int entrance, int numOfRestrooms, int numOfRegisters, String typeOfStore, String targetMarket) {
        super(name, maxCapacity, entrance, numOfRestrooms, numOfRegisters, typeOfStore);
        this.targetMarket = targetMarket;
    }

    //method overriding
    @Override
    public void typeOfStore(String name, String typeOfStore) {
        System.out.println(name + " is a " + typeOfStore + " store that sells shirts, pants, jackets and other items.");
    }
    @Override
    public void checkoutTime(int numOfRegisters) {
        System.out.println("Checkout time may seem lengthy since this store only has " + numOfRegisters + " registers if it is a busy day, you may be waiting a while to pay.");
    }

    @Override
    public void restrooms(int numOfRestrooms) {
        System.out.println("The number of restrooms inside this store are " + numOfRestrooms + ".");
    }
    //interface
    @Override
    public void maxCapacity(int maxCapacity) {
        System.out.println("The max capacity inside this store is " + maxCapacity);
    }
    //interface
    @Override
    public void entrance(int entrance) {
        System.out.println("There are " + entrance + " entrance(s) to this clothing store.");
    }
}

class LuxuryStore extends Stores {
    String typeOfLuxuryStore;

    public String getTypeOfLuxuryStore() {
        return typeOfLuxuryStore;
    }

    public void setTypeOfLuxuryStore(String typeOfLuxuryStore) {
        this.typeOfLuxuryStore = typeOfLuxuryStore;
    }

    public LuxuryStore(String name, int maxCapacity, int entrance, int numOfRestrooms, int numOfRegisters, String typeOfStore, String typeOfLuxuryStore) {
        super(name, maxCapacity, entrance, numOfRestrooms, numOfRegisters, typeOfStore);
        this.typeOfLuxuryStore = typeOfLuxuryStore;

    }

    //method overloading
    public void shop(String name, String typeOfLuxuryStore) {
        System.out.println("Come to the mall to shop at " + name + ". This store sells " + typeOfLuxuryStore + ".");
    }
    //method overloading
    public void checkoutTime(String typeOfStore) {
        System.out.println(typeOfStore + " stores provide a more personalized shopping experience. The employee assisting you will have the ability to process payment, " +
                "minimizing the checkout time");
    }
    //method overriding
    @Override
    public void typeOfStore(String name, String typeOfStore) {
        System.out.println(name + " is a " + typeOfStore + " store that is fit for high end clientele. ");
    }
    @Override
    public void restrooms(int numOfRestrooms) {
        System.out.println("This store does not have any restrooms. Please use the restroom provided by the mall.");
    }
    //interface
    @Override
    public void maxCapacity(int maxCapacity) {
        System.out.println("The max capacity inside the store is " + maxCapacity);
    }
    //interface
    @Override
    public void entrance(int entrance) {
        System.out.println("There are " + entrance + " entrance(s) to this store.");
    }
}

interface MallInterface {
    public void restrooms(int numOfRestrooms);
    public void maxCapacity(int maxCapacity);
    public void entrance(int entrance);
}

class MallExample {
    public static void main (String [] args) {
    Mall mall1 = new Mall("South Coast Plaza", 2000, 15, 30);
    Restaurant food = new Restaurant("Red Robin", 100, 2, 2, "American", 45);
    JewelryStore jewelry = new JewelryStore("Cartier", 25, 1, 0,
            10, "jewelry", 20, "high end");
    ClothingStore clothes = new ClothingStore("Gap", 25, 1, 1, 4, "clothing", "men and women");
    LuxuryStore luxury = new LuxuryStore("Prada", 15, 1, 0, 0, "luxury", "leather goods");

    mall1.mall(mall1.getName());
    mall1.entrance(mall1.getEntrance());
    clothes.shop(clothes.getName());
    System.out.println();

    clothes.typeOfStore(clothes.getName(), clothes.getTypeOfStore());
    clothes.entrance(clothes.getEntrance());
    clothes.checkoutTime(clothes.getNumOfRegisters());
    clothes.restrooms(clothes.getNumOfRestrooms());
    clothes.maxCapacity(clothes.getMaxCapacity());
    System.out.println();

    food.shop(food.getName(), food.getCuisine());
    food.entrance(food.getEntrance());
    food.restrooms(food.getNumOfRestrooms());
    food.maxCapacity(food.getMaxCapacity());
    System.out.println();

    jewelry.shop(jewelry.getName());
    jewelry.typeOfStore(jewelry.getName(), jewelry.getTypeOfStore());
    jewelry.checkoutTime(jewelry.getNumOfRegisters());
    jewelry.restrooms(jewelry.getNumOfRestrooms());
    jewelry.maxCapacity(jewelry.getMaxCapacity());
    jewelry.entrance(jewelry.getEntrance());
    System.out.println();

    luxury.typeOfStore(luxury.getName(), luxury.getTypeOfStore());
    luxury.checkoutTime(luxury.getTypeOfStore());
    luxury.restrooms(luxury.getNumOfRestrooms());
    luxury.maxCapacity(luxury.getMaxCapacity());
    luxury.entrance(luxury.getEntrance());
    }
}