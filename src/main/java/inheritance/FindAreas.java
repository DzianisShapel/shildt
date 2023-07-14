package inheritance;

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9 ,5);
        Triangle tr = new Triangle(10, 8);
        Figure figref;

        figref  = r;
        System.out.println("Rectangle area: " + figref.area());
        figref  = tr;
        System.out.println("Triangle area: " + figref.area());
        figref = f;
        f.area();
    }
}
