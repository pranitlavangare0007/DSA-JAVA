package recursion;

public class SumOfNNaturalNumbers {

    public static int nSum(int n){
        if(n==1){
            return 1;
        }
        int sum = nSum(n-1);
        return sum+n;

    }
    public static void main(String[] args) {
        System.out.println(nSum(555));
    }
}
