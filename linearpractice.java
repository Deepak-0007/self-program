public class linearpractice {
    public static void main(String[] args) {
        int nums[]={1,23,46,76,9};
        int target=90;
        int ans =linearpractice1(target, nums);
        System.out.println(ans);
    }
    static int linearpractice1(int target,int arr[]){
        if(arr.length==0){
            return -1;
        }
        for(int index=0; index<arr.length;index++){
            int element=arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;   
    }
    
}
