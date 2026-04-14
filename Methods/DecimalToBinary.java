package Methods;

public class DecimalToBinary {
   

    public static int decimalToBinary(int n){

        int binary =0;
        int power=0;
        while(n >0){
            int rem = n%2;
            binary = binary+(rem*(int)Math.pow(10, power));
            power++;
            n /= 2;
        }

        return binary;
     
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(8));
    }
    
}
