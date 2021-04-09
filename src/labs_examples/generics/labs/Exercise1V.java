package labs_examples.generics.labs;

public class Exercise1V<T, U> {
    T val1;
    U val2;

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public U getVal2() {
        return val2;
    }

    public void setVal2(U val2) {
        this.val2 = val2;
    }

    public Exercise1V(T val1, U val2) {
        this.val1 = val1;
        this.val2 = val2;
    }
}
