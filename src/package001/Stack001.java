package package001;
import java.util.Stack;
public class Stack001 {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		//System.out.println(stack.empty());
		stack.push("Clash Royale");
		stack.push("Sudoku");
		stack.push("Archery");
		stack.push("Battle Ship");
		stack.push("Monopoly");
		stack.push("Chess");
		System.out.println(stack.empty());
		System.out.println(stack);
		System.out.println(stack.peek());
		String myFavGame=stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack);
		System.out.println(myFavGame);
		System.out.println(stack.search("Sudoku"));
		System.out.println(stack.search("Air Hockey"));
		for(int i=0;i<10000;i++) {
			stack.push("Bus");
		}
		System.out.println(stack); 
		for(int i=0;i<10000;i++) {
			stack.pop();
		}
		System.out.println(stack);
	}
}
