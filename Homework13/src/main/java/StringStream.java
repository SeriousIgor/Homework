import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringStream {
    public static List<String> listFilter(List<String> list){
        list = list.stream().map(String::toLowerCase).filter(i -> i.length() == 4).collect(Collectors.toList());
        return list;
    }
    public static List<Pair<String, String>> pairList(List<String> list) {
        List<Pair<String, String>> pl = new ArrayList<>();
        for (String value : list) {
            Pair<String, String> p = new Pair(value, value.toUpperCase());
            pl.add(p);
        }
        return pl;
    }
}
class Pair<L, R>{
    L l;
    R r;

    public Pair(L l, R r) {
        this.l = l;
        this.r = r;
    }

    public L getL() {
        return l;
    }

    public R getR() {
        return r;
    }

    @Override
    public String toString() {
        return "{" + l +  " : " + r + "}";
    }
}
