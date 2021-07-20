/**
 * Class for testing new features while writing Homework.
 *
 * @author  Sbitniev Ihor
 * @version 1.0
 * @since   2021-07-19
 */
public class CustomCacheRun {
    public static void main(String[] args) {
        CustomCache cc = new CustomCache();
        System.out.println(cc.getSize());
        Object o = "value";
        Object oo = "value2";
        System.out.println(cc.putCache("firstCache", "Igor", o));
        System.out.println(cc.putCache("secondCache", "Igor", o));
        System.out.println(cc.putCache("firstCache", "Tigor", oo));
        System.out.println();
        System.out.println(cc.getCache("firstCache", "Tigor"));
        cc.clear("firstCache");
        cc.clear("firstCache");
        System.out.println("_________________________");
        System.out.println(cc.getCache("firstCache", "Tigor"));
        cc.clear("firstCache");
        Object value = cc.getCache("firstName", "Tigor");
        //Object value = null;
    }
}
