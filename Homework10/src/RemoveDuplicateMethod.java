import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicateMethod {
    public static void main(String[] args) {
        List<Object> testList = new ArrayList<Object>();
        testList.add("a");
        testList.add("b");
        testList.add("a");
        testList.add("c");
        System.out.println(testList);
        testList = removeDuplicate(testList);
        System.out.println(testList);

        LinkedList<Object> testList2 = new LinkedList<Object>();
        testList2.add("d");
        testList2.add("e");
        testList2.add("d");
        testList2.add("f");
        System.out.println(testList2);
        System.out.println(removeDuplicate(testList2));
    }

    public static List<Object> removeDuplicate(List<Object> list){
        List<Object> newL = new ArrayList<Object>();
        for(Object el : list){
            if (!newL.contains(el)){
                newL.add(el);
            }
        }
        return newL;
    }
}
