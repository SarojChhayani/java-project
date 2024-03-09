public class Calculator {
    static Calculator calculator = new Calculator();
    static int a = 40;
    static int b = 30;
    static int ans;

    static void add() {
        ans = a + b;

        System.out.println("addition " + a + " and " + b + "=" + ans);

    }

    static void subtraction() {
        ans = a - b;
        System.out.println("subtraction " + a + " and " + b + "= " + ans);

    }

    static void multiplication(int a, int b) {

        ans = a * b;
        System.out.println("multiplication of " + a + "and " + b + "= " + ans);
        {

        }
    }

    void division(int a, int b) {

        ans = a / b;
        System.out.println("division of " + a + "and" + b + "= " + ans);

    }


    public static void main(String[] args) {
        add();
        subtraction();
        multiplication(10, 30);
        Calculator.calculator.division(600, 30);
    }


}
