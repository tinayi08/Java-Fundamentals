package labs_examples.static_nonstatic.labs;

public class Class1 {

    public static void main(String[] args) {
        staticMethod();

        Class1 object = new Class1();
        object.originalNonStatic();

        Class2.staticDifClass();
        Class2 object2 = new Class2();
        object2.nonStaticDifClass();

    }


    public static void staticMethod() {
        System.out.println("this is a static method from the same class");
    }

    public void originalNonStatic() {
        System.out.println("\nThis is a nonstatic method from the same class");
        anotherNonStatic();
        Class2 obj = new Class2();
        obj.nonStaticDifClass();
        Class2.staticDifClass();
    }

    public void anotherNonStatic() {
        System.out.println("We added another non static method being called to a non static method.");
        staticMethod();
    }

}
