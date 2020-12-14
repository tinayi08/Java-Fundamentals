package labs_examples.objects_classes_methods.labs.objects;

public class Person1 {
    String name;
    int age;

    public Person1(){
        name = "John";
        age = 25;
    }
    public Person1(String name) {
        this.name = name;

    }
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Example1 {
    public static void main(String[] args) {
        Person1 a = new Person1();
        Person1 b = new Person1("Mary");
        Person1 c = new Person1("Tina", 28);

        System.out.println("1st person's name is " + a.name + " and they are " + a.age + " years old");
        System.out.println("2nd person's name is " + b.name + " and they did not provide an age");
        System.out.println("3rd person's name is " + c.name + " and they are " + c.age + " years old");
    }
}