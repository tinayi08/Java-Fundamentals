package labs_examples.objects_classes_methods.labs.classes;

//POJO - Plain old java object
public class Dog {
    String color;
    String breed;
    int age;

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}

class Demo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.color = "black";
        d.breed = "poodle";
        d.age = 10;


        System.out.println("I have a " + d.color + " " + d.breed);

        Dog d2 = new Dog();
        d2.color = "brown";
        d2.breed = "shepard";
        System.out.println("You have a " + d2.color + " " + d2.breed);

        test(d);
        test(d2);
    }

    public static void test(Dog zeus) {
        System.out.println(zeus.toString());
    }
}