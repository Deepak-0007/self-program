import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void bubble(int []arr){
        boolean Swapped;
     for(int i=0;i<arr.length;i++){
        Swapped=false;
        for(int j=1; j<arr.length-1;j++){
            if (arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                Swapped=true;
            }
        }
        if(Swapped==false){
            break;
        }
     }
    }
}
