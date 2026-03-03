public class topairsum {
   public int[] sum(int arr[] , int target){
        int i , j;
        for(i = 0 ; i < arr.length ; i++){
            for(j = i + 1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    return new int[] {i , j};
                }
            }
        }
        return new int[] {};
   }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        topairsum w1 = new topairsum();
        int ans[] = w1.sum(arr , 3);
        if(ans.length == 2){
            System.out.println("Element Found at Index " + arr[0] + " . " + arr[1]);
        }
        else{
            System.out.println("Element Sum Not found in Pair");
        }
    }
}
