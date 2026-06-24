class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
       

        int i = 0;
        int j = 0;

        while (j <players.length && i<trainers.length) {

            if(players[j] <= trainers[i]){
                j++;
            }
            i++;
            
        }

      return j;
    }
}