public class Rnd {
    private int number0;
    private final int a;
    private final int c;
    private final int m;

    public Rnd(int seed, int a, int c, int m) {
        this.number0 = seed;
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public int get() {
        number0 = (a * number0 + c) % m;
        return number0;
    }
}
