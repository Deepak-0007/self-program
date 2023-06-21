package Collection;
import java.util.Iterator;
import java.util.Stack;
public class stack3 {
	public static void main(String[] args) {
		Stack <String> stk=new Stack();
		stk.push("Orange");
		stk.push("Apple");
		stk.push("Banana");
		stk.push("Graphes");
		stk.push("Water Lemon");
		Iterator iterator = stk.iterator();
		while(iterator.hasNext()) {
			Object values = iterator.next();
			System.out.println(values);
		}
	}

}
