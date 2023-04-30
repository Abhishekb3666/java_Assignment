public class RationalNumber {
    int numerator, denominator;


    public RationalNumber() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}