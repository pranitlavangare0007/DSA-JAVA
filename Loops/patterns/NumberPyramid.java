package Loops.patterns;

public class NumberPyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=(5-i)+1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
