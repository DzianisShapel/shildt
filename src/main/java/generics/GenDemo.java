package generics;

public class GenDemo {

    public static void main(String[] args) {

        Gen<Integer> iOb = new Gen<>(88);

        iOb.showType();

        int v = iOb.getOb();
        System.out.println("Value of: " + v);


        Gen<String> strOb = new Gen<>("My String");

        strOb.showType();

        String str = strOb.getOb();
        System.out.println("Value of: " + str);

    }
}
