class pattern2{
   public static void main(String args[]) {
     int n=6;
     int m=6-2;
      for(int i=n-2;i>=0;i--){ // number of row
	for(int j=0;j<=i;j++){// number of colume of print *
       if(i==0 || i==2||i==4) // condition for boundary of squre 
	{
	 System.out.print("*");  
       }
      else
	System.out.print(m);
	
	}
	System.out.println();

    } 
}
}