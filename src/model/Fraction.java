package oop;

public class Fraction {
    private int T;
    private int M;

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        while (b != 0) {
            if (a > b) {a = a - b;} else {b = b - a;}
        }

        return a;
    }

    private Fraction simple() {
        Fraction simple = new Fraction();
        int temp = gcd(Math.abs(this.T), Math.abs(this.M));
        simple.T = this.T / temp;
        simple.M = this.M / temp;
        return simple;
    }

    private float calc() {
        return (float) this.T / this.M;
    }

    public Fraction() {
        T = 0;
        M = 1;
    }

    public Fraction(int t, int m) {
        T = t;
        M = m;
    }

    public int getT() {
        return T;
    }

    public void setT(int t) {
        T = t;
    }

    public int getM() {
        return M;
    }

    public void setM(int m) {
        M = m;
    }

    @Override
    public String toString() {
        if (T == M) {
            return "Fraction{1}";
        } else if (T == 0) {
            return "Fraction{0}";
        } else {
            return "Fraction{" + "T=" + T + ", M=" + M + '}';
        }
    }

    public Fraction add(Fraction fraction) {
        Fraction result = new Fraction();
        result.T = T * fraction.M + M * fraction.T;
        result.M = M * fraction.M;
        return result.simple();
    }

    public Fraction minus(Fraction fraction) {
        Fraction result = new Fraction();
        result.T = T * fraction.M - M * fraction.T;
        result.M = M * fraction.M;
        return result.simple();
    }

    public Fraction mul(Fraction fraction) {
        Fraction result = new Fraction();
        result.T = T * fraction.T;
        result.M = M * fraction.M;
        return result.simple();
    }

    public Fraction div(Fraction fraction) {
        Fraction result = new Fraction();
        result.T = T * fraction.M;
        result.M = M * fraction.T;
        return result.simple();
    }

    public int compare(Fraction fraction) {
        if (this.calc() < fraction.calc()) {
            return -1;
        } else if (this.calc() == fraction.calc()) {
            return 0;
        } else {
            return 1;
        }
    }
}
