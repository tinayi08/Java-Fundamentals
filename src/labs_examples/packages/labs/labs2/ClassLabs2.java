package labs_examples.packages.labs.labs2;

public class ClassLabs2 {

    protected void class2ProtectedMethod() {
        System.out.println("This is a protected method in Labs2. How does it interact in different packages?" +
                "This method won't be able to be seen from another package because it is protected.");

    }

    public void class2Method() {
        System.out.println("This is a public method so it can be called from package to package");
    }

    public static void staticMethod2(){
        System.out.println("we are going to call this static method to another static method but from different packages." +
                "the access modifiere is public so it should not be a problem.");
        System.out.println("We can call this method by calling the class name followed by a dot and then the method name.");
    }

}
