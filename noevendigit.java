public class noevendigit{
    static int even=0;
    static int fnoevendigit(int arr[]){
        for(int i=0;i<arr.length; i++){
        int count=0;
        
        if(arr[i]==0){
            continue;

        }
        while(arr[i]!=0){
            arr[i]=arr[i]/10;
            count++;
        }
        if(count%2==0){
           even++;
        }
        }
    return even;
        }
public static void main(String[] args) {
    int arr[]={22,345,7421,90786};
    System.out.println(fnoevendigit(arr));
}
}