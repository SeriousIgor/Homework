import java.util.*;
import java.util.stream.Collectors;

public class StreamsAPIRun {
    public static void main(String[] args) {
        //Task1
        List<Integer> intList = List.of(1,2,3,4,5,6,7);
        System.out.println("Average of list: " + IntegerStream.getAvg(intList));
        System.out.println();

        //Task2
        List<String> strList1 = List.of("one", "two", "three", "four", "five");

        System.out.println(StringStream.pairList(strList1).toString());

        System.out.println();
        //Task3
        List<String> strList2 = List.of("Value", "VAL", "val", "VALU", "valu", "WORD", "wOrD");
        for(String s : StringStream.listFilter(strList2)){
            System.out.print(s + " ");
        }

        System.out.println();
    }
}
