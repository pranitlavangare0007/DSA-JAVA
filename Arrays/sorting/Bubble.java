package Arrays.sorting;

public class Bubble {
    public static void bubble(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            boolean flag=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
               
            }
             if(!flag){
                    break;
                }
        }
    }

    public static void main(String[] args) {
        int arr[]={5,8,5,6,655,64556,1};
        bubble(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
