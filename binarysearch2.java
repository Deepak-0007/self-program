public class binarysearch2 {
    public static void main(String[] args) {
       // int arr[]={-12,0,2,4,5,6,7,8,9,12,13,14};
        int arr[]={12,11,10,9,7};
        int target=11;
        int ans=binarySearch(arr,target);
        System.out.println("location of target element by binary search is "+ans);
    }
    static int binarySearch(int arr[] , int target){
        int start=0;
        int end=arr.length-1;


        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc=true;
        }else{
            isAsc=false;
        }


         
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }


            if(isAsc){
                if (target<arr[mid]) {
                end=mid-1;
            }else{
                start=mid+1;
            }
            }
            else{
                if (target>arr[mid]) {
                end=mid-1;
            }else {
                start=mid+1;
            }
            }
        }
        return -1;
    }
}

