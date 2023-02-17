package mypkg2;

public class ReverseNumber {
	
	public int reverse(int x) {
		int rem, rev=0;
		
		while(x>0) {
			rem = x%10;
			rev = rev*10 + rem;
			x=x/10;
		}
		
		return rev;
	}

}
