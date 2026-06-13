package Arrays;

public class WeightedWordMapping {
    
     public static String mapWordWeights(String[] words, int[] weights) {
        
        char alphaOrder[] = new char[26];
        char a='a';
        for(int i=alphaOrder.length-1;i>=0;i--){
            alphaOrder[i]=a;
            a++;
        }
       StringBuilder ans = new StringBuilder();
        for(int i=0;i<words.length;i++){
             int sum =0;
            for(int j=0;j<words[i].length();j++){
                String word=words[i];
                sum += weights[word.charAt(j) - 'a'];
            }
            int place = sum % 26;
            ans.append(alphaOrder[place]);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String words[] = {"abcd","def","xyz"};
        int weights[] = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        System.out.println(mapWordWeights(words, weights));
    }
}
