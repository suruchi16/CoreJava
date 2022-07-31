package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {10,20,30,40,50};
		System.out.println("Array length is : " + array1.length);
		System.out.println("Second index value is :" + array1[1]);
		System.out.println("Last index value :" + array1[array1.length-1]);
		
		String str1 = "Clean world green world";
		String[] array3 = str1.split(" ");
		
		System.out.println("The first world is : " + array3[0]);
		System.out.println("The last string is :" + array3[array3.length - 1]);

	}

}
