package recursion;

public class TowerOfhanoi {
    public static void solve(int n , char src , char  helper, char dest){
        if(n==1){
            System.out.println("move disk 1 from  " + src +" to "+ dest);
            return;
        }

        solve(n-1, src, dest, helper);
        System.out.println("move disk " + n +" from "+src+" to "+dest);
        solve(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        solve(24, 'A', 'B', 'C');
    }
    
}
