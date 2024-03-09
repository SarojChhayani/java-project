public class Personinformation {
    static String name = "John";//Static method - no return no parameter
    static String  address = "14 St Joseph's Vale, Greater, Blackheath, London SE3 0XF";
    static  int age = 24;
    static String mobile_number = "0785863541";
    static double salary = 2456.78;
    public static void main (String[] args){
        System.out.println("My name is "+ name);//static method in static area no extra step required.
        System.out.println("My address is " + address);
        System.out.println("My age is "+ age);
        System.out.println("My mobile number is "+ mobile_number);
        System.out.println("My salary is "+ salary );

    }
}
