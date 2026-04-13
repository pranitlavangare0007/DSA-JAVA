package Loops.patterns;

public class Diamond {
    public static void main(String[] args) {
        int n=4;
        int m=3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=(i*2)-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=(n*2)-((i*2)-1);k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
