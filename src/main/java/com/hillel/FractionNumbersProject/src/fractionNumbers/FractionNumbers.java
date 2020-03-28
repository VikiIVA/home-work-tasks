package fractionNumbers;

public class FractionNumbers {
    public int numerator;
    public int denominator;
    String result;

    public FractionNumbers(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public int getNumerator(){
        return numerator;
    }

    public void setNumerator (int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public FractionNumbers summ(FractionNumbers fractionNumbers) {
        int numerator1 = (numerator * fractionNumbers.getDenominator()) + (fractionNumbers.getNumerator() * denominator);
        int denominator1 = denominator * fractionNumbers.getDenominator();
        return new FractionNumbers(numerator1, denominator1);
    }

    public FractionNumbers minus(FractionNumbers fractionNumbers) {
        int numerator2 = (numerator * fractionNumbers.denominator) - (fractionNumbers.numerator * denominator);
        int denominator2 = denominator *fractionNumbers.denominator;
        FractionNumbers result = new FractionNumbers(numerator2, denominator2);
        return  result;
    }

    public FractionNumbers division(FractionNumbers fractionNumbers){
        int numerator3 = numerator * fractionNumbers.getDenominator();
        int denominator3 = denominator * fractionNumbers.numerator;
        FractionNumbers result = new FractionNumbers(numerator3,denominator3);
        return result;
    }

    public FractionNumbers multi (FractionNumbers fractionNumbers){
        int numerator4 = numerator * fractionNumbers.numerator;
        int denominator4 = denominator * fractionNumbers.denominator;
        FractionNumbers result = new FractionNumbers(numerator4, denominator4);
        return result;
    }

    @Override
    public String toString () {
        return this.numerator + "/" + this.denominator;
    }



    //    public static char MathPlus(double firstfruction, double secondfruction) {
//        return (char) (firstfruction + secondfruction);
//    }
//
//    public static char MathMinus(double firstfruction, double secondfruction, double residue) {
//        if (firstfruction > secondfruction) {
//            return (char) (residue = firstfruction - secondfruction);
//        } else {
//            return (char) (residue = secondfruction - firstfruction);
//        }
//
//    }
//
//    public static char MathMultiply(double a, double b) {
//        return (char) (a * b);
//    }
//
//    public static char MathDivide(double firstfruction, double secondfruction, double division) {
//        if (firstfruction != 0) {
//            return (char) (division = secondfruction / firstfruction);
//        } else if (secondfruction != 0) {
//            return (char) (division = firstfruction - secondfruction);
//        } else {
//            return 0;
//        }
//    }

}
