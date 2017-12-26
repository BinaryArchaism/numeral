import java.util.ArrayList;

public class Numeral {
    private ArrayList<Integer> num = new ArrayList<>();

    public Numeral() {
        num.add(0);
    }

    public Numeral(int x){
        while(x!=0) {
            int m = x%10;
            num.add(m);
            x/=10;
        }
    }

    public Numeral(String s){
        for (int i = s.length(); i <= s.length(); i++) {
            num.add(i, (int) s.charAt(i));
        }
    }

    public Numeral sub(Numeral a, Numeral b) {
        Numeral c = a;
        for (int i = 0; i<a.num.size(); i++) {
            if (a.num.get(i) < b.num.get(i)) {
                c.num.get(i) += 10;
                while (c.num.get(i+1) == 0) {
                    c.num.get(i+1) = 0;
                    i++;
                }
            }
        }
    }
}
