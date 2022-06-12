package guru.qa;

public class JavaFundamental {

    public static void dataTypes() {

        boolean boolExample = true; // true or false
        char charExample = 'q'; // single symbol is stored like a number in the memory (it takes 2 byte of the memory)

        byte byteExample = -103; // integer number from -127 to 128 (it takes 1 byte of the memory)
        short shortExample = 1000; // integer number from -32768 to 32767 (it takes 2 byte of the memory)
        int intExample = -592492384; // integer number from -2147483648 to 2147483647 (it takes 4 byte of the memory)
        long longExample = 12312312312313L; // integer number from –9 223 372 036 854 775 808 to 9 223 372 036 854 775 807 (it takes 8 byte of the memory)

        float floatExample = 1.15F; // from -3.4E+38 to 3.4E+38 precision 7 decimal (it takes 4 byte of the memory)
        double doubleExample = -11.222666666333; // from 1.7E+308 to 1.7E+308 precision 15 decimal (it takes 8 byte of the memory)

        System.out.println("boolean example " + boolExample);
        System.out.println("char example " + charExample);
        System.out.println("byte example " + byteExample);
        System.out.println("short example " + shortExample);
        System.out.println("int example " + intExample);
        System.out.println("long example " + longExample);
        System.out.println("float example " + floatExample);
        System.out.println("double example " + doubleExample);

    }

    public static void operatorsAndOverflow() {
        int a = 500;
        int b = 5;
        int c = -1;
        System.out.println("addition a + b = " + (a + b)); // 505
        System.out.println("subtraction a - b = " + (a - b)); // 495
        System.out.println("multiplication a * b = " + (a * b)); // 2500
        System.out.println("division  a / b = " + (a / b)); // 100
        System.out.println("modulus division  a % b = " + (a % b)); // 0
        System.out.println("overflow max value  a = " + (a * 5000)); // error
        System.out.println("overflow min value  b = " + (c - 2147483647)); // error
        System.out.println("division c / b = " + (c / b)); // 0
        System.out.println("postfix increment a" + a++); // 500
        System.out.println("prefix decrement b" + --b); // 4


    }

    public static void booleanOperation() {

    }

    public static void arrayExample() {
        int[] arExample = new int[] {4324, 2, -800, 221, 67, 0, 15};
        System.out.println("array = " + arExample);
    }

    public static void ifElseComparison() {
        int score = 70;

        System.out.println("Your score =" + score);

        if (score < 50) {
            System.out.println("You are not pass");
        }
        else if (score >= 50 && score < 80) {
            System.out.println("You are pass");
        }
        else {
            System.out.println("You are pass, good student!");
        }
    }


    public static void main() {
        dataTypes();
        operatorsAndOverflow();
    }
}
