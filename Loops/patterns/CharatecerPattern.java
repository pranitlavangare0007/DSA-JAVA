package Loops.patterns;

public class CharatecerPattern {
    public static void main(String[] args) {
        char character='A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(character);
                character++;
            }
            System.out.println();
        }
       
    }
    
}
