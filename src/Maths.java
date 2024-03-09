public class Maths {
    static Maths maths = new Maths();// create the object to access Instance members of the class - global
    static int a = 40;
    static int b = 35;
    static int answer;
    //static method no return no parameter method
    static void addition() {
        answer = a + b;
        System.out.println("addition of 40 and 35 is =" + answer);
    }
    static void subtraction() {
        answer = a - b;
        System.out.println("subtraction of 40 and 35 is =" + answer);
    }
    //Instance method no return with parameter method
    void multiplication(int a, int b) {
        answer = a * b;
        System.out.println("multiplication of " + a + " and " + b + " is =" + answer);
    }
    void division(int a, int b) {
        answer = a / b;
        System.out.println("division of " + a + " and " + b + " is =" + answer);
    }
    public static void main(String[] args) {
        addition();//static method in static area no extra step required.
        subtraction();//static method in static area no extra step required.
        maths.multiplication(40, 2);// Instance method calling through object.
        maths.division(40, 2);// Instance method calling through object.
    }
}
