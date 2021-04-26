import java.util.ArrayList;
import java.util.List;

public class StringCollectionsRun {
    public static void main(String[] args) {
        StringCollections sc = new StringCollections();
        StringCollections sc2 = new StringCollections();

        sc.add("a");

        System.out.println(sc.size());
        sc.clear();
        System.out.println(sc.size());
    }
}
