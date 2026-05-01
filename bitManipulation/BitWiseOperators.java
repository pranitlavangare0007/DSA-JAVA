package bitManipulation;

public class BitWiseOperators {

    public static void getIthBit(int n, int i) {
        int bitMask = (1 << i);
        if ((n & bitMask) == 0)
            System.out.println("zero");
        else {
            System.out.println("one");
        }
    }
public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static void main(String[] args) {

        // binary AND &
        // System.out.println(5 & 6);

        // Binary OR |
        // System.out.println(7|8);

        // binary XOR ^
        // System.out.println(9 ^ 10);

        // Binary NOT ~
        // System.out.println(~5);

        // Binary left shift <<
        // System.out.println(5 << 1);

        // Binary right shift >>
        // System.out.println(5 >> 2);

        // getIthBit(8, 3);

        System.out.println(setIthBit(10, 2));

    }

}
