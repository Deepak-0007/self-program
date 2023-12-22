public class binarypractice {
    public static void main(String[] args) {
        int arr[]={2,3,4,8,9,10,11};
        int target=2;
        int ans=binarypractice1(arr, target);
        System.out.println(ans);
        
    }
    static int binarypractice1(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;

            }
            else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
