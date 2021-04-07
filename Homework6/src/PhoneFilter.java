import java.util.Arrays;

public class PhoneFilter implements ChoosingData {

    public void exceedsTime(Phone[] phoneMembers, int n){
        for(Phone p : phoneMembers) {
            try {
                if (p.intercityTime > n) {
                    System.out.println(p.toString());
                }
            }
            catch (NullPointerException ignored){}
        }
    }

    public void alphabetList(Phone[] phoneMembers){
        String[] surnames = new String[phoneMembers.length];
        for(int i = 0; i < phoneMembers.length; i++){
            try {
                surnames[i] = phoneMembers[i].surname;
            }
            catch (NullPointerException ignored) {}
        }
        Arrays.sort(surnames);
        for(int i = 0; i < phoneMembers.length; i++){
            try {
                for(Phone p : phoneMembers){
                    if (p.surname.equals(surnames[i])){
                        System.out.println(p.toString());
                    }
                }
            }
            catch (NullPointerException ignored) {}
        }
    }

    public void usingOuterConnection(Phone[] phoneMembers){
        for(Phone p : phoneMembers) {
            try {
                if (p.outerTime != 0) {
                    System.out.println(p.toString());
                }
            }
            catch (NullPointerException ignored){}
        }
    }

    public void theBiggestTrafficUsers(Phone[] phoneMembers){
        double[] internet = new double[phoneMembers.length];
        for(int i = 0; i < phoneMembers.length; i++){
            try {
                internet[i] = phoneMembers[i].internetTraffic;
            }
            catch (NullPointerException ignored) {}
        }
        Arrays.sort(internet);
        for(int i = phoneMembers.length-1; i > phoneMembers.length - 11; i--)
        {
            try {
                for(Phone p : phoneMembers){
                    if (p.internetTraffic == internet[i]){
                        System.out.println(p.toString());
                    }
                }
            }
            catch (NullPointerException ignored) {}
        }
    }
}
