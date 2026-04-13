package Loops.patterns;

public class Butterfly {
    public static void main(String[] args) {
        int n=4;
        int m=8;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=m-(i*2);j++){
                System.out.print("  ");
            }
             for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i)+1;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=((i-1)*2);j++){
                System.out.print("  ");
            }
             for(int j=1;j<=(n-i)+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
