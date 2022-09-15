package practiceprogramms;
import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(10);
		st.push(10.12);
		st.push('t');
		st.push("Tops");
		st.push(null);
		st.push(true);
		st.push(10);
		
		System.out.println(st);
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());

	}

}
