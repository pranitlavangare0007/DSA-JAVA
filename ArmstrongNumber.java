public class ArmstrongNumber {

    public static int digits(int number) {
        int digits = 0;
        while(number >0){
            number /=10;
            digits++;
        }
        return digits;
    }
    public static int power(int  number , int y){
        int power=1;
        if(y==0){
            return 1;
        }
        for(int i=1;i<=y;i++){
            power *= number;
        }
        return power;
    }
    public static void armstrong(int number){
        int temp = number;
        int sum=0;
        int digits=digits(number);

        while (temp >0) {
            int rem= temp % 10;
            sum += power(rem, digits);
            temp /=10;
            
        }
        if(sum == number){
           System.out.println("number is armstrong");
        }else{
            System.out.println("number is not armstrong");
        }


    }
    public static void main(String[] args) {
       armstrong(9474);
    }

}
