package brm.lab1.test;

import mypkg1.Calculator;

public class TestCal {

	public static void main(String[] args) {
		
		Calculator ob= new Calculator();
		
		System.out.println("Sum of the numbers is: "+ob.sum(15, 3));
		
		System.out.println("Difference of the numbers is: "+ob.sub(15, 3));
		
		System.out.println("Product of the numbers is: "+ob.mul(15, 3));
		
		System.out.println("Division of the numbers is: "+ob.div(15, 3));

	}
}