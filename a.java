public class dubicate_element{
    public static void main(String args[]){
        
    
    int arr[]=new int[]{1,1,2,2,3,4,8,9,5,3};
    for(int i=0; i<arr.length; i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j])
            System.out.println(arr[j]);
        }
    }
    
}
}
