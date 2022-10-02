public class Operators {
    public static void main(String[] args) {

        // assignment operator
        int number = 5;
        System.out.println(number);

        // arithmetic operator
        // + - * / %

        int sum = 4 + 5;
        int substraction = 10 - 2;
        int multiply = 4 * 5;
        int divide = 10 / 2;
        int remainder = 7 % 2;
        System.out.println(sum);
        System.out.println(substraction);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(remainder);

        // concatenation operator
        String firstName = "Anuj";
        String secondName = "Jindal";
        System.out.println(firstName + secondName);

        // unary opearator
        // + - ++ -- !
        int num1 = +5;
        int num2 = -3;
        int num3 = +-2;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        int num4 = 5;
        System.out.println(++num4);
        System.out.println(--num4);

        int i = 5;
        System.out.println(++i);// 6
        System.out.println(i++);// 6
        System.out.println(i);// 7

        boolean moneyInBank = !false;
        System.out.println(moneyInBank);

        System.out.println("-----------------------------------------------------------");

        // equality and relational operators
        int value1 = 10;
        int value2 = 5;
        int value3 = 10;
        int value4 = 5;

        System.out.println(value1 == value3); // true
        System.out.println(value1 > value2); // true
        System.out.println(value2 > value1); // false
        System.out.println(value1 >= value3); // true
        System.out.println(value2 <= value3); // true
        System.out.println(value1 != value3); // false
        System.out.println(value1 != value2); // true

        // conditional operator
        // && ||
        System.out.println((value1 == value3) && (value1 == value2)); // false
        System.out.println((value1 == value3) || (value1 == value2)); // true

        // example
        int age = 19;
        String sex = "male";
        System.out.println((age > 18) && (age < 25) && (sex == "female"));
        System.out.println((age > 18) || (sex == "male"));

        // ternary operator
        System.out.println((age > 18) ? "eligible to vote" : "not eligible");

    }
}
