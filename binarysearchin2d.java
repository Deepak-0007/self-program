import java.util.Arrays;

class binarysearchin2d{
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4},
            {7,8,9,12},
            {13,15,23,25}
        };
        int target=23;
        
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int matrix[][],int target){
        int r=0;
        int c=matrix.length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){

                return new int[]{r,c};
            }
            if(matrix[r][c]< target){
                r++;
            }else{
                c--;
            }
            
        }
        return new int[]{-1,-1};
    }
}