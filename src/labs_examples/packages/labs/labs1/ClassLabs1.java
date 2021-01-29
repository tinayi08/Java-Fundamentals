package labs_examples.packages.labs.labs1;
import  labs_examples.packages.labs.labs2.ClassLabs2;

public class ClassLabs1 {
    public static void main (String [] args){
        ClassLabs2 newObj = new ClassLabs2();
        newObj.class2Method();
        staticMethod();
        ClassLabs2.staticMethod2();

    }
    public void anotherMethod() {
        System.out.println("here we have a method in ClassLabs1");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method in class ClassLabs1");
    }

    public static void staticMethod() {
        System.out.println("this is a static method to another static method so you can simply call the method.");
    }
}
