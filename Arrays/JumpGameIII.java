package Arrays;

public class JumpGameIII {

    public static boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        return dfs(arr, start, visited);
    }

    public static boolean dfs(int[] arr, int i, boolean[] visited) {

       
        if (i < 0 || i >= arr.length) {
            return false;
        }

       
        if (visited[i]) {
            return false;
        }

      
        if (arr[i] == 0) {
            return true;
        }

        visited[i] = true;

      
        return dfs(arr, i + arr[i], visited) ||
               dfs(arr, i - arr[i], visited);
    }

   

    public static void main(String[] args) {
        
    }
}
