package homeTask5.homeTask5_4;

public class ArrayGeneric<T> {
    T[] array;

    public ArrayGeneric(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void printArray (T[] array, int index){
        System.out.println(array[index]);
    }
}
