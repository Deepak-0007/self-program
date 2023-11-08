public class sandg {
    private String name;
	private int rollNumber;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getRollNumber() {
    	return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
    	this.rollNumber=rollNumber;
    }
	public static void main(String args[]) {
		sandg str1=new sandg();
        str1.setName("Deepak");
		str1.setRollNumber(2);
		System.out.println("Name of the student is "+str1.name+" and RollNo is "+str1.rollNumber);
	}
	
}

