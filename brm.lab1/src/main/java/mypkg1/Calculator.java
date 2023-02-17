package mypkg1;

public class Calculator {

	public int sum(int x, int y) {
		return x+y;
	}
	
	public int sub(int x, int y) {
		return x-y;
	}
	
	public int mul(int x, int y) {
		return x*y;
	}
	
	public int div(int x, int y) {
		return x/y;
	}
	
	public static void main(String args[]) {
		
		Calculator obj = new Calculator();
		System.out.println("Sum of the numbers is:"+obj.sum(20, 5));
		System.out.println("Differnce of the numbers is:"+obj.sub(20, 5));
		System.out.println("Product of the numbers is:"+obj.mul(20, 5));
		System.out.println("Division of the numbers is:"+obj.div(20, 5));
	}
}
