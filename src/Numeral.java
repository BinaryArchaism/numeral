import java.util.ArrayList;

public class Numeral {
    private ArrayList<String> num = new ArrayList<>();

    public Numeral() {
        num.add("0");
    }

    public Numeral(int x){
        while(x!=0) {
            int m = x%10;
            num.add(String.valueOf(m));
            x/=10;
        }
    }

    public Numeral(String s){
        for (int i = s.length(); i <= s.length(); i++) {
            num.add(i, s.substring(i, i+1));
        }
    }

    public Numeral sub(Numeral a, Numeral b) {
        Numeral c = a;
        for (int i = 0; i<a.num.size(); i++) {
            if (a.num[i] < ) {
            }
        }
    }
}
