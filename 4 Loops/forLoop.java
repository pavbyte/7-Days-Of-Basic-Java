public class forLoop {
    public static void main(String[] args) {

        /*
         * loop - for loop , while loop , do while loop
         */

        /*
         * for(initialization;condition;updation)
         */

        String[] friends = { "Pavitra", "Anuj", "Dhruv", "Dua", "Piya" };

        System.out.println(friends.length);

        for (int i = 0; i < 5; i++) {
            // System.out.println(i);
            System.out.println(friends[i] + " ");
        }

        for (int i = 1; i >= 10; i++) {
            System.out.println("2" + " x " + i + " = " + (i * 2));
        }

        // while
        int num = 10;
        while (num >= 0) {
            System.out.println(num);
            num -= 2;
        }

        while (num != 0) {
            System.out.println(num);
            num++;
        }

    }
}
