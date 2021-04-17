import java.util.LinkedList;
import java.util.List;

public class StringLinkedListTun {
    public static void main(String[] args) {
        StringLinkedList sll = new StringLinkedList();
        StringLinkedList sll2 = new StringLinkedList();

        String[] strArray = new String[]{"val1", "val2", "val3"};

        sll.add("a");
        sll.add("1");
        sll.add("2");
        sll.add("3");
        sll.add("b");
        sll.add("c");
        sll.add(null);
        sll.print();

        System.out.println("______________");

        sll.addAll(strArray);
        sll.print();

        System.out.println("______________");

        sll2.add("d");
        sll2.addAll(sll);
        sll2.print();

        System.out.println("______________");

        System.out.println(sll.get(4));

        System.out.println("______________");

        System.out.println("Sll contains \"5\" " + sll.contains("5"));
        System.out.println("Sll contains \"null\" " + sll.contains(null));

        System.out.println("______________");

        sll.print();
        System.out.println("Current size is " + sll.getSize());
        System.out.println("Deleting 2-nd element");
        sll.delete(2);
        sll.print();
        System.out.println("Current size is " + sll.getSize());
        System.out.println("Deleting element \"b\"");
        sll.delete("b");
        sll.print();
        System.out.println("Current size is " + sll.getSize());
        System.out.println("Clear list");
        sll.clear();
        System.out.println("Deleting from empty list " + sll.delete(0));
        System.out.println();
        System.out.println("Deleting single element");
        sll.add(3);
        sll.delete(0);
        sll.print();

        System.out.println("______________");

    }
}
