package Loops;

public class AddDigits {

    public static int sum(int n){

         int newNum=0;

        while (n > 0) {

            int rem = n % 10;

            newNum += rem;

            n /= 10;
    }
    return newNum;
    }
     public static int addDigits(int num) {
       
            if(num < 10) return num;
            int newNum=sum(num);
            while (newNum > 10) {

                newNum =  sum(newNum);
                
            }
            return newNum;
        }
    
    

    public static void main(String[] args) {
        System.out.println(addDigits(12));
    }
}
