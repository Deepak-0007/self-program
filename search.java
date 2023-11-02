class search{
    public static void main(String args[]){
        int [] nums= {23,20,28,19,16,45};
        int target=19;
        int ans =linearsearch(nums,target);
        System.out.println(ans);
    }
    // search array :return the index id item found
    // otherwiseif item is not fine retun -1
    static int linearsearch(int [] arr,int target){
        if(arr.length==0){
            return -1;
        }
    for (int index =0;index <arr.length; index++){

        //chech for element at every index if it is = target
        int element=arr[index];
        if (element== target){
            return index;
        }
    }
    // if target is not found it return -1
    return -1;
    }
}