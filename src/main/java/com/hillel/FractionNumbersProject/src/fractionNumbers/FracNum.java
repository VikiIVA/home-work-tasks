package fractionNumbers;

public class FracNum {
    public static void main(String[] args) {
        FractionNumbers number1 = new FractionNumbers(2,4);
        System.out.println(number1.toString());

        FractionNumbers number2 = new FractionNumbers(2,8);

        FractionNumbers number3 = number1.summ(number2);
        System.out.println("Summ: " + number3);

        FractionNumbers number4 = number1.multi(number2);
        System.out.println("Multi: " + number4);

        FractionNumbers number5 = number1.minus(number2);
        System.out.println("Minus: " + number5);

        FractionNumbers number6 = number1.division(number2);
        System.out.println("Division: " + number6);

    }

}
