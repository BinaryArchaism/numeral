public class Main {
    public static void main(String[] args) {
        Numeral a = new Numeral("123129101");
        Numeral b = new Numeral("999");
        Numeral c = new Numeral();

        c.add(a,b);

        a.print();
        b.print();
        c.print();
    }

}