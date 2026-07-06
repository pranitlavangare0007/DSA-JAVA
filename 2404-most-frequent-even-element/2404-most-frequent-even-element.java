class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
         Map<Integer, Integer> map = new HashMap<>();

        int mostFrequent[] = { Integer.MAX_VALUE, -1 };

        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
               
            } else {
                if(n % 2 == 0){
                    map.put(n, 1);
                }
                
            }
            if(n % 2 == 0){
                   
             if (mostFrequent[1] < map.get(n)) {
                    
                        mostFrequent[0] = n;
                        mostFrequent[1] = map.get(n);
                    
                
                }
                }

        }
       return mostFrequent[0] == Integer.MAX_VALUE?-1:mostFrequent[0];
    }
}