import java.util.ArrayList;
import java.util.List;

public class StringCollectionsRun {
    public static void main(String[] args) {
        StringCollections sc = new StringCollections();
        StringCollections sc2 = new StringCollections();

        sc.add("a");
        sc.add(0,"aa");
        sc.print();
        System.out.println();

        sc.add("c");
        sc.add("d");
        sc.add("e");
        sc.add("f");
        sc.add("g");

        sc.print();

        System.out.println();

        sc.remove("a");
        sc.remove("f");
        sc.remove("c");

        sc.print();

        System.out.println("ELement with 13-th number in collection : " + sc.get(13));

        System.out.println("Size of collection : " + sc.size());
        System.out.println("__________________________________");

        if(sc.contains("aa"))
            System.out.println("sc contains aa");
        else
            System.out.println("sc doesn't contains aa");

        System.out.println();

        sc2 = sc;

        if(sc.equals(sc2))
            System.out.println("sc is equals to sc2");
        else
            System.out.println("sc isn't equals to sc2");

        System.out.println("_________________________________");

        sc = new StringCollections();
        sc2 = new StringCollections();

        sc.add("a");
        sc.add("b");
        sc.add("c");
        sc2.add("a");
        sc2.add("b");
        sc2.add("c");

        if(sc.equals(sc2))
            System.out.println("sc is equals to sc2");
        else
            System.out.println("sc isn't equals to sc2");

        System.out.println();

        sc.remove("c");

        if(sc.equals(sc2))
            System.out.println("sc is equals to sc2");
        else
            System.out.println("sc isn't equals to sc2");

        System.out.println("_________________________________");

        sc.clear();
        sc.print();
    }
}
