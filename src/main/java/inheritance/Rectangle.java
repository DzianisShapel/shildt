package inheritance;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Rectangle area is: ");
        return dim1*dim2;
    }
}
