package greedyAlgo;

import java.util.Arrays;

public class Destroyingastroid {
    
    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        
       long sum=mass;
        for(int i=0;i<asteroids.length;i++){

            if(sum >= asteroids[i]){
                sum += asteroids[i];
            }else{
                return false;
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        int mass = 5, asteroids[] = {4,9,23,4};
        System.out.println(asteroidsDestroyed(mass, asteroids));
    }
}
