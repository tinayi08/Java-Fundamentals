package labs_examples.objects_classes_methods.labs.objects;

public class Job {
    public static void main(String[] args) {
        Person p = new Person("Tina");
        Company c = new Company("Go Rentals");
        System.out.println(p.name + " works at " + c.companyName);
    }
}


class Person {
    String name;
    public Person (String name) {
        this.name = name;
    }
}

class Company {
    String companyName;
    public Company(String companyName) {
        this.companyName = companyName;
    }
}