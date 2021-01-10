package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Car implements Automotive {
    private String make;
    private String model;
    private int fuelCapacity;

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void fuelCapacity() {
        System.out.println("the fuel capacity for " + model + " is " + fuelCapacity);
    }

    public Car(String make, String model, int fuelCapacity) {
        this.make = make;
        this.model = model;
        this.fuelCapacity = fuelCapacity;
    }
}

class Truck implements Automotive {
    private String make;
    private String model;
    private int fuelCapacity;

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Truck(String make, String model, int fuelCapacity) {
        this.make = make;
        this.model = model;
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void fuelCapacity() {
        System.out.println("the fuel capacity for " + model + " is " + fuelCapacity);
    }
}

class CarMain {
    Automotive automotive;

    public CarMain(Automotive a) {
        this.automotive = a;
    }

    public Automotive getAutomotive() {
        return automotive;
    }

    public void setAutomotive(Automotive automotive) {
        this.automotive = automotive;
    }
    //    public static void main (String [] args) {
//        Automotive truck = new Truck("Ford", "F150");
//        function(truck);
//        Automotive car = new Car("Honda", "Civic");
//
//        truck.fuelCapacity(30);
//    }
//
//    public static void function(Automotive[] automotives) {
//        for (int i = 0; i<automotives.length; i++) {
//            automotives[i].fuelCapacity();
//        }
//    }
}

interface Automotive {
    public void fuelCapacity();

}


