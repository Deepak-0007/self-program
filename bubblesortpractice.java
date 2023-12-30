import java.util.Arrays;

public class bubblesortpractice {
    public static void main(String[] args) {
        int[] arr={3,2,5,6,8,1,4,7};
        buble(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void buble(int arr[] ){
        boolean Swapped;
        for(int i=0;i<arr.length;i++){// for length of the array
        Swapped =false;
        for(int j=1;j<arr.length-1;j++){// for element in array
            if(arr[j]<arr[j-1]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            Swapped=true;
            }

        }
        if (Swapped==false){
             break;
        }
        }
    }
}

