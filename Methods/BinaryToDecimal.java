package Methods;

public class BinaryToDecimal {
public static int power(int x , int y){
    int power=1;
    if(x==0) return 1;
 for(int i=1;i<=y;i++){
    power *= x;

 }
 
    return power;
}

    public static int binaryToDecimal(int n){

        int decimal=0;
        int power = 0;
         while (n > 0) {
            int lastDigit = n % 10;
            decimal += lastDigit * power(2, power);
            power++;
            n /= 10;

            
         }

        return decimal;
    }
    public static void main(String[] args) {
        System.out.println(binaryToDecimal(101));
    }
    
}
