
public class Main {

	public static void main(String[] args) {
		// 1. Read input file
		// 2. 
		
		Input input = new Input("C:/Users/Feras/git/HashCode/Delivery/src/busy_day.in");
		//System.out.println(input.getParameters());
		input.read();
		System.out.println(input.getOrderList());
	}

}
