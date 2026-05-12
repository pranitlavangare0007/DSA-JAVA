package backtracking;

public class GridWays {

    public static int ways(int i , int j , int n, int m){

        if(i == n-1 || j == m-1){
            return 1;
        }else if (i == n || j ==m) {
            return 0;
            
        }

        return ways(i+1, j, n, m) + ways(i, j+1, n, m);
    }
    public static int factorial(int n){
        if(n==0){
           return 1;
        }
      int fn_1=  factorial(n-1);
     return  fn_1*n;  
    }

     public static int waysOptimize( int n, int m){

       int factnPm=factorial((n-1 + m-1));
       int factn=factorial(n-1);
       int factm=factorial(m-1);
       
       return factnPm / (factm + factn);
    }
    public static void main(String[] args) {
        
        System.out.println(waysOptimize( 3, 3));
    }
}
