public class Circle {
    final double PI = 3.14;
    int r = 6;

    public void area() {
        double result = PI * (r * r);
        System.out.println("Circle area: "+ result + " sm");
    }

    public void circumference() {
        double result2 = PI * 2 * r;
        System.out.println("Circumference: " + result2 + " sm");
    }

}
