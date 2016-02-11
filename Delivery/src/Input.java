import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Input {
	
	private Scanner sc;
	private List<Integer> param;
	private List<ArrayList<Integer>> stock;
	private List<Integer> prod;
	private List<ArrayList<Integer>> orders;
	private List<ArrayList<Integer>> positionlist;
	private List<ArrayList<Integer>> orderlist;
	private int prodNumber;
	private int numberWarehouses;
	private int numberOrders;
	

	
	public Input(String file) {
		try {
			sc = new Scanner(new File(file));
		}
		catch(FileNotFoundException e){
			System.out.println("Error");
		}
		positionlist = new ArrayList<ArrayList<Integer>>();
		orderlist = new ArrayList<ArrayList<Integer>>();
		stock = new ArrayList<ArrayList<Integer>>();
		orders = new ArrayList<ArrayList<Integer>>();
		
	}
	
	public List<Integer> getParameters() {
		param = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++) {
			param.add(sc.nextInt());
		}
		return param;
	}
	
	public int getNumberProducts() {
		return prodNumber = sc.nextInt();
	}

	public int getNumberWarehouses() {
		return sc.nextInt();
	}
	
	public List<Integer> getProducts() {
		prod = new ArrayList<Integer>();
		int numberProducts = getNumberProducts();
		for(int i = 0; i < numberProducts; ++i) {
			prod.add(sc.nextInt());
		}
		return prod;
	}
	
	public void getWarehousePosition() {
		ArrayList<Integer> loc = new ArrayList<Integer>();
		loc.add(sc.nextInt());
		loc.add(sc.nextInt());
		positionlist.add(loc);
		
	}
	
	public void getWarehouseStock() {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i = 0; i < prodNumber; ++i) {
			temp.add(sc.nextInt());
		}
			stock.add(temp);
		
	}
	
	public void getWarehouse() {

		 numberWarehouses = getNumberWarehouses();
		for(int i = 0; i < numberWarehouses; ++i) {
			getWarehousePosition();
			getWarehouseStock();
		}
	
	} 
	
	public int getNumberOrders() {
		return numberOrders = sc.nextInt();
	}
	
	public void getOrderDetails() { 
		getNumberOrders();
		for(int i = 0; i < numberOrders; ++i) {
			getOrderPosition();
			getOrderProducts();
		}
	}
	
	public void getOrderPosition() {
			ArrayList<Integer> loc = new ArrayList<Integer>();
			loc.add(sc.nextInt());
			loc.add(sc.nextInt());
			orderlist.add(loc);
			
			
	}
	
	public int getOrderNumberItems() {
		return sc.nextInt();
	}
	
	public void getOrderProducts() {
		ArrayList<Integer> items = new ArrayList<Integer>();
		int numberItems = getOrderNumberItems();
		for(int i = 0; i < numberItems; ++i) {
			items.add(sc.nextInt());
		}
		orders.add(items);
	}
	
	public void read() {
		getParameters();
		getProducts();
		getWarehouse();
		getOrderDetails();
	}
	
	public List<Integer> getParam() {
		return param;
		
	}
	public List<ArrayList<Integer>> getStock() {
		return stock;
		
	}
	public List<Integer> getProd() {
		return prod;
		
	}
	public List<ArrayList<Integer>> getOrders() {
		return orders;
		
	}
	public List<ArrayList<Integer>> getPositionList() {
		return positionlist;
		
	}
	public List<ArrayList<Integer>> getOrderList() {
		return orderlist;
		
	}
	
	
	/*public void testRead()
	{
		for(int i=0;i<getParameters().size();i++)
		{
			System.out.
		}
	} */
}
