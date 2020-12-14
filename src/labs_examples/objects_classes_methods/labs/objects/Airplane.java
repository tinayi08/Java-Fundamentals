package labs_examples.objects_classes_methods.labs.objects;

public class Airplane {
    FuelCapacity fuelCapacity;
    CurrentFuel currentFuel;
    String airline;
    int seats;

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuel=" + currentFuel +
                ", airline='" + airline + '\'' +
                ", seats=" + seats +
                '}';
    }

    public Airplane(FuelCapacity fuelCapacity, CurrentFuel currentFuel, String airline, int seats) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuel = currentFuel;
        this.airline = airline;
        this.seats = seats;
    }
}

class FuelCapacity {
    double fuelCapacity;

    @Override
    public String toString() {
        return "FuelCapacity{" +
                "fuelCapacity=" + fuelCapacity +
                '}';
    }

    public FuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}

class CurrentFuel {
    double currentFuel;

    @Override
    public String toString() {
        return "CurrentFuel{" +
                "currentFuel=" + currentFuel +
                '}';
    }

    public CurrentFuel(double currentFuel) {
        this.currentFuel = currentFuel;
    }
}

class PlaneExample {
    public static void main(String[] args) {
        FuelCapacity fuelCap = new FuelCapacity(300);
        CurrentFuel curFuel = new CurrentFuel(150);
        Airplane myPlane = new Airplane(fuelCap, curFuel, "United", 250);
        System.out.println("My " + myPlane.airline + " airlines plane can seat " + myPlane.seats + " people. It has a fuel capacity of "
        + myPlane.fuelCapacity.fuelCapacity + " and has current fuel level of " + myPlane.currentFuel.currentFuel + ".");

        System.out.println("---");
        FuelCapacity newFuelCap = new FuelCapacity(400);
        CurrentFuel newCurFuel = new CurrentFuel(100);
        Airplane newPlane = new Airplane(newFuelCap, newCurFuel, "American Airlines", 300);
        System.out.println(newPlane.toString());
        System.out.println("---");
        FuelCapacity fuelCap1 = new FuelCapacity(100);
        CurrentFuel curFuel1 = new CurrentFuel(80);
        Airplane plane1 = new Airplane(fuelCap1, curFuel1, "Spirit Airlines", 150);
        System.out.println(plane1.toString());

    }
}