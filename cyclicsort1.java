public class cyclicsort1 {
    public static void main(String[] args) {
        int[]arr={4,0,1,2};
        System.out.println(cyclicsort1(arr));
    }
    public static int cyclicsort1(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct =arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        //find missing number
        for(int index=0;index<arr.length; index++){
            if(arr[index]!=index){
                return index;
            }
        }
        //case
        return arr.length;
    }
    private static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}
