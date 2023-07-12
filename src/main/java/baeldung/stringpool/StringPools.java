package baeldung.stringpool;

public class StringPools {
    public static void main(String[] args) {
        String constantString1 = "Baeldung";
        String constantString2 = new String("Baeldung");

        System.out.println(constantString1 == constantString2);
        System.out.println(constantString1.equals(constantString2));

    }
}
