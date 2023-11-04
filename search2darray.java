import java.util.Arrays;

public class search2darray {
    public static void main(String[] args) {
        int arr[][]={
            {2,3,4},
            {12,13,14,16},
            {18,12,2,34},
            {56,59}
        };
        int target =59;
        int ans[]=search(arr,target);
        System.out.println(Arrays.toString(ans));
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
}
