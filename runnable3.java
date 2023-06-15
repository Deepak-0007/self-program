package thread_example;
// if we ar not extend the class we have a exception error in program 
public class runnable3 implements Runnable {
	public void run() {
		System.out.println("hello i am  ..... Deepak");
	}
	public static void main(String[] args) {
		runnable3 ri=new runnable3();
		Thread t=new Thread(ri);
		ri.run();
	}

}
