import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class IntegerStream {
     public static double getAvg(List<Integer> intList){
        AtomicReference<Double> avg = new AtomicReference<>((double) 0);
        intList.stream().
                mapToInt(i -> i).
                average().
                ifPresent(avg::set);
        return avg.get();
    }
}
