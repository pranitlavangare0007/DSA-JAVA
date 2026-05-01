package bitManipulation;

public class EvenOrOddUsingBit {

    public static boolean evenOrOdd(int n){
 int bitMask=1;
        if((n & bitMask)== 0) return true;

        return false;

    }
    public static void main(String[] args) {
        System.out.println(evenOrOdd(11));
    }
}
