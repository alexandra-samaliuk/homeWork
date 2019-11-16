package homeTask5.homeTask5_5;

public class HomeTask5_5 {
    public static void main(String[] args) {
        String[] array = {"first", "second", "third", "forth"};
        CollectionUnit collectionUnit = new CollectionUnit();
        collectionUnit.createArrayList(array);
        collectionUnit.createLinkedList(array);
        collectionUnit.createQueue(array);
    }
}
