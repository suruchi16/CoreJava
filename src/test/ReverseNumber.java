package test;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 456789;
		int res = 0;
		
		while(num>0) {
			int rem = num%10; 
			res = res * 10 + rem; 
			num = num/10;
		}
		System.out.println("Reversed number is : " + res);
	}

}
