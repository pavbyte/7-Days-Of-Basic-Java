import java.util.Arrays;

public class DataTypes {
    public static void main(String[] args) {
        int num = 4;
        long amountInBank = 1023743202;
        boolean test = true; // true or false
        float try1 = 2.5f;
        double try2 = 20.5;
        char try3 = 'r';

        String name = "anuj";

        String[] address;
        address = new String[5];

        // String[] address = new String[5];

        address[0] = "haryana";
        address[1] = "maharashtra";
        address[2] = "west bengal";

        System.out.println(address[0]);
        System.out.println(address[1]);
        System.out.println(address[2]);
        System.out.println(address[3]);
        System.out.println(address[4]);

        int[] number = new int[5];
        number[0] = 23566;
        number[2] = 23456;

        System.out.println(Arrays.toString(number));

        String[] friends = { "anuj", "udit", "dua", "daksh", "dhruv", "nischal", "mohit" };
        System.out.println(friends[4]);
        // System.out.println(Arrays.toString(friends));

    }
}
