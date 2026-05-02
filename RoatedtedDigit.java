public class RoatedtedDigit {

     public static int rotatedDigits(int n) {
        int count=0;

        for(int i=1;i<=n;i++){
           boolean hasChange=false;
           boolean isValid=true;
           int num=i;
            while (num>0) {

                int rem = num % 10;
                num = num/ 10;
                if (rem == 3 || rem==4 || rem==7 ) {
                isValid=false;
                   
                }
                if(rem == 2 || rem==5 || rem==6 || rem==9){
                    hasChange=true;
                }
                
            }

            if(hasChange && isValid){
                count++;
            }
            
        }

        return count;

    }
    public static void main(String[] args) {
System.out.println(rotatedDigits(857));   
 }
    
}
