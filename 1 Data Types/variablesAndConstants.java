public class variablesAndConstants {
    public static void main(String[] args) {

        int currentGear = 4;
        final int gear = 4;

        // int currentGear [declaration]
        // int currentGear=4; [initialization]

        System.out.println(currentGear);

        currentGear = 5;
        System.out.println(currentGear);

        System.out.println(gear);

        // gear = 5; // is not possible because gear is constant

        // try1=4;
        /*
         * final modifier is added to make a constant in java
         */

    }
}
