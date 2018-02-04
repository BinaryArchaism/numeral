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
        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            int k=(int) (c - '0');
            num.add(k);
        }
    }

    public Numeral sub(Numeral a, Numeral b) {
        this.copy(a);
        for (int i = 0; i < b.num.size(); i++) {
            if (a.num.get(i) < b.num.get(i)) {
                num.set(i, num.get(i) + 10);
                int k = i;
                while (num.get(k+1) == 0) {
                    num.set(k+1, 9);
                    k++;
                }
                num.set(k+1, num.get(k+1) - 1);
            }
            num.set(i, num.get(i) - b.num.get(i));
        }
        return this;
    }

    public Numeral add(Numeral a, Numeral b) {
        this.copy(a);
        int i = 0;
        while (i < num.size() && i < b.num.size()) {
            if (num.get(i) + b.num.get(i) >= 10) {
                num.set(i, (num.get(i) + b.num.get(i)) % 10);
                num.set(i + 1, num.get(i + 1) + 1);
            } else num.set(i, num.get(i) + b.num.get(i));
            ++i;
        }
        while (num.get(i) == 10) {
            num.set(i, 0);
            //   if(a.num.get(i+1) < 9) {
            num.set(i+1, num.get(i+1) + 1);
            //     } else a.num.set(i+1, 10);
            ++i;
        }
        return this;
    }

    public void copy(Numeral a) {
        num.clear();
        for(int i =0; i < a.num.size(); i++ ) {
            num.add(i, a.num.get(i));
        }
    }

    public void print() {
        for (int i = this.num.size()-1; i >= 0; i--) {
            System.out.print(this.num.get(i));
        }
        System.out.println();
    }
}