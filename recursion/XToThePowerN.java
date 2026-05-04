package recursion;

public class XToThePowerN {

    public static double pow(int x, int n) {

          long N = n;  

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1;

        while (N > 0) {
            if ((N % 2) == 1) {
                result *= x;
            }
            x *= x;
            N /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, -2));
    }
}
