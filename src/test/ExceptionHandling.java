package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,4,5};
		int num = 10;
		try {
			int res = num/0;
			System.out.println(array[5]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside the array catch block");
			
		}catch(ArithmeticException e) {
			System.out.println("Inside arithmatic catch block");
		}finally {
			System.out.println("Inside Finally block");
		}
		System.out.println("After Exception");
	}

}
