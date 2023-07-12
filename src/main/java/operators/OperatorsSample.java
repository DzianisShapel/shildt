package operators;

public class OperatorsSample {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println(i);
        }

       /* for (int i = 0; i < 10; i++) {
            System.out.println(i);
            return;
        }*/

        int counter = 0;
        while(counter<10) {
            System.out.println(counter);
            counter++;
        }
    }
}
