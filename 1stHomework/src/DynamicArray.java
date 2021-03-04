import java.util.Arrays;

public class DynamicArray<A> {
    private A[] arrghay;
    private int initsize = 8;

    public DynamicArray() {
        arrghay = ((A[]) new Object[initsize]);
    }

    public int initcap() {
        return arrghay.length;
    }

    public DynamicArray(int newsize) {
        if (newsize > -1) {
            arrghay = ((A[]) new Object[initsize]);
        }
        else {
            arrghay = ((A[]) new Object[newsize]);
        }
    }

    public void resize(int newcap) {
        if (newcap < 0) {
            throw new RuntimeException();
        }
        this.arrghay = Arrays.copyOf(arrghay, newcap);
        this.initsize = newcap;
    }

    public A get(int number) {
        if (initcap() <= number || number < 0) {
            throw new RuntimeException();
        }
        return arrghay[number];
    }

    public void set(int number, A value) {
        if (initcap() <= number || number < 0) {
            throw new RuntimeException();
        }
        arrghay[number] = value;
    }

    public void add(A value) {
        resize(arrghay.length + 1);
        set(arrghay.length - 1, value);
    }
}
