public class ifStatement {
    public static void main(String[] args) {
        // int num = 5;
        // System.out.println((num > 5) ? "number greater than fiver" : "number less
        // than five");

        // int age = Integer.parseInt(args[0]);
        int age = 15;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("not eligible to vote");
        }
        int angle1, angle2, angle3 = 0;
        angle1 = 90;
        angle2 = 40;
        angle3 = 60;

        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("It's a triangle");
        } else {
            System.out.println("wrong angles provided");
        }

        int amount = 10000;

        if (amount < 1000) {
            System.out.println("2%");
        } else if (amount < 5000) {
            System.out.println("8%");
        } else {
            System.out.println("10%");
        }

        int ch = 1;

        switch (ch) {
            case 1000:
                System.out.println("int rate 5%");
                break;
            case 5000:
                System.out.println("8%");
                break;
            case 10000:
                System.out.println("4%");
                break;
            default:
                System.out.println("kuch nai mila");
        }

    }
}
