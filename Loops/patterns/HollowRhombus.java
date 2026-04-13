package Loops.patterns;

public class HollowRhombus {
    public static void main(String[] args) {
        int n=5;
        int m=4;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=(m-i)+1;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=n;k++){
                if(i==1 || i==5 || k==1 || k==5){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
    
}
