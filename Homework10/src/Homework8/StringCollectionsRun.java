package Homework8;

public class StringCollectionsRun {
    public static void main(String[] args) {
        StringCollections sc = new StringCollections();

        sc.add("a");
        sc.add("b");
        sc.add("c");
        sc.add("a");

        sc.removeDuplicate();

        StringCollections.print(sc);
    }
}
