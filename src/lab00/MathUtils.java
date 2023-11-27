package lab01;

public class MathUtils {
    public static void PrintClosestPerfectSquare(int in) {
        int root = (int)Math.sqrt(in);

        int a = root * root;
        int b = (root + 1) * (root + 1);

        if ((b - in) < (in - a)) System.out.println(b);
        else System.out.println(a);
    }
    public static void IsArmstrongNumber(int in) {
        int nrDigits = 1;
        int sum = 0;
        int a = in;
        while (a / 10 != 0) {
            a /= 10;
            nrDigits++;
        }
        a = in;
        for (int i = 0; i < nrDigits; i++) {
            sum += Math.pow(a % 10, nrDigits);
            a /= 10;
        }
        if (in == sum) System.out.println("Is an Armstrong number");
        else System.out.println("Is not an Armstrong number");
    }
}