import java.util.Arrays;

public class maxin2darray {
    public static void main(String[] args) {
        int arr[][]={
            {2,3,4},
            {12,13,14,16},
            {18,12,2,34},
            {56,59}
        };
        int target =4;
        int ans[]=search(arr,target);
        System.out.println("position of given array element is "+ Arrays.toString(ans));
        System.out.println("maximmum of the array is " + max(arr));
    }
    static int[] search(int [][]arr,int target){
        for(int row=0; row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int [][]arr){
        int max=Integer.MIN_VALUE;
        for(int row=0; row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max=arr[row][col];
               }
        }
    }
    return max;
}
}
