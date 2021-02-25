public class DynamicArray<A> {
    private A[] arrghay;
    private int initsize = 8;

    public DynamicArray(int newsize) {
        if (newsize > -1) {
            arrghay = ((A[]) new Object[initsize]);
        }
        else {
            arrghay = ((A[]) new Object[newsize]);
        }
    }
}
