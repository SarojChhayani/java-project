public class Area_of_circle {
    //Static method no return with parameter
    static void circle(int r){
        double pie = 3.14;
        double area = (pie* (r*r));
        System.out.println("The area of the circle for given radius "+r+ " is "+ area);
    }
    public static void main(String[] args){
        circle(4);// static method in static area not required to create the object.
    }
    }
