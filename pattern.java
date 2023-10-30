class pattern{
   public static void main(String args[]) {
     int n=5;
      for(int i=0;i<n;i++){ // number of row
	for(int j=0;j<n;j++){// number of colume of print *
       if(i==0|| i==n-1 ||j==0 || j==n-1) // condition for boundary of squre 
	{
	 System.out.print("* ");  
       }
       else
	System.out.print("  ");
	}
	System.out.println();

    } 
}
}