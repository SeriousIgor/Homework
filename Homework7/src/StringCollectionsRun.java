import java.util.List;

public class StringCollectionsRun {
    public static void main(String[] args) {
        StringCollections stringCollections = new StringCollections();

        stringCollections.add("Aaaaa");
        stringCollections.add("Bbbbb");
        stringCollections.add("Aaaaa");
        stringCollections.add("Bbbbb");
        stringCollections.print();

        System.out.println();
        System.out.println("___________");

        stringCollections.add(0,"Ccccc");
        stringCollections.add(3,"Ddddd");
        stringCollections.add(0,"Ccccc");
        stringCollections.add(7,"Ddddd");
        stringCollections.print();

        System.out.println();
        System.out.println("___________");

        stringCollections.remove("Ccccc");
        stringCollections.print();

        System.out.println();
        System.out.println("___________");

        stringCollections.remove(5);
        stringCollections.remove(0);
        stringCollections.print();

        System.out.println();
        System.out.println("___________");

        System.out.println("Element with index 1");
        System.out.println(stringCollections.get(1));

        System.out.println();
        System.out.println("___________");

        StringCollections stringCollections2 = new StringCollections();

        stringCollections2.add("Value");

        System.out.println("Removing a nonexistent element with index 2");
        if(stringCollections2.remove(2)){
            System.out.println("That part will not be reflected");
        }
        else{
            System.out.println("You can't remove this");
        }

        System.out.println("___________");

        System.out.println("Removing a nonexistent element walue");
        if(stringCollections2.remove("walue")){
            System.out.println("That part will not be reflected");
        }
        else{
            System.out.println("You can't remove this");
        }

        System.out.println("___________");

        if(stringCollections2.add(5, "value")){
            System.out.println("That part will not be reflected");
        }
        else{
            System.out.println("You can't add element to this index");
        }
    }
}
