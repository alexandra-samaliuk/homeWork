package homeTask5.homeTask5_4;

public class HomeTask5_4 {
    public static void main(String[] args) {
        Integer[] arrayI = {1, 2, 3, 4, 5};
        ArrayGeneric<Integer> arrayInt = new ArrayGeneric<>(arrayI);
        arrayInt.printArray(arrayInt.getArray(),2);
        Double[] arrayD = {1.00, 2.00, 3.00, 4.00, 5.00};
        ArrayGeneric<Double> arrayDouble = new ArrayGeneric<>(arrayD);
        arrayDouble.printArray(arrayDouble.getArray(),3);
        Long[] arrayL = {1000000l, 200000l, 300000l, 400000l, 500000l};
        ArrayGeneric<Long> arrayLong = new ArrayGeneric<>(arrayL);
        arrayLong.printArray(arrayLong.getArray(),4);
        String[] arrayS = {"aa1", "bb2", "cc3", "dd4", "ee5"};
        ArrayGeneric<String> arrayString = new ArrayGeneric<>(arrayS);
        arrayString.printArray(arrayString.getArray(),0);
    }
}
