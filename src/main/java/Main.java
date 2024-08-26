public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(10, 0);
        int b = calc.minus.apply(10, 0);
        int z = calc.pow.apply(a);

        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
            calc.println.accept(z);
        } catch (ArithmeticException e) {
            System.out.println("Внимание!!! Деление на 0! На ноль делить нельзя");
        }

    }
}