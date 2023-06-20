package Collection;

import java.util.Stack;
public class stack2 {
	public static void main(String[] args) {
		Stack <String> stk=new Stack();
		stk.push("Orange");
		stk.push("Apple");
		stk.push("Banana");
		stk.push("Graphes");
		stk.push("Water Lemon");
		boolean result =stk.empty();
		System.out.println("is stack is empty " +result);
		System.out.println("Element in the stack is " +stk);
	    int location=stk.search("Apple");
	    System.out.println("location of fruit Apple " +location);
		System.out.println(stk.peek());
		int size=stk.size();
		System.out.println("size of the stack " +size);
		
	}

}
