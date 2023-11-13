class leetcode{
    public static void main(String[] args) {
    }
        public int max(int[][] accounts){

            //person=row
            //account=col
            int ans=Integer.MIN_VALUE;
            for(int person=0; person<accounts.length; person++){
                //when you start a new col, take a new for that row
                int sum=0;
                for (int account=0; account<accounts[person].length; account++){
                    sum += accounts[person][account];

                }
                if(sum>ans){
                    ans=sum;
                }
            }
            return ans;
        }
    }
