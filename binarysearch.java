class binarysearch{
    public static void main(String[] args) {
        int arr[]={-12,0,2,4,5,6,7,8,9,12,13,14};
        int target=-12;
        int ans=binarySearch(arr,target);
        System.out.println("location of target element by binary search is "+ans);
    }
    static int binarySearch(int arr[] , int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target<arr[mid]) {
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}