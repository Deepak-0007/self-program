
import java.util.*;
public class array {
    
    // public static int[] reverse(){
    //     int a=0;
    //     int b=arr.length-1;
    //     while(a<=b){
    //         int tenp=arr[a];
    //         arr[a]=arr[b];
    //         arr[b]=tenp;
    //         a++;
    //         b--;
    //     }
    //    reverse arr;
    // }
    public static void main(String args[])
    {
        int a =0;
        
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]=new int[n];
         int b=arr.length-1;
         for (int i=0; i<n;i++){
            arr[i]=sc.nextInt();
            
         }
        //  int result=0;
        //  int num2=Integer.MIN_VALUE;
        //  for (int i=0; i<n;i++){
        //     System.out.print(arr[i] +" ");
            
        //     result=result+arr[i];
        //     if(num2<arr[i]){
        //         num2=arr[i];
        //                    }
           
        //  }
        //  System.out.println("");
        //  System.out.println("result "+result);
        //  System.out.print(num2+" ");

        //  System.out.println(Integer.MIN_VALUE);
      
        while(a<=b){
            int tenp=arr[a];
            arr[a]=arr[b];
            arr[b]=tenp;
            a++;
            b--;
        }

      // int arr[]=reverse();
       for (int i=0; i<arr.length;i++){
         System.out.print(arr[i] +" ");
            
       }
    //    
         

         }
    }
    

