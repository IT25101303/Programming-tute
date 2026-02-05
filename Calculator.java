public class Calculator{
	public static int add ( int a , int b){
		return a + b;
	}
	public static int multiply( int a , int b){
		return a * b;
	}
	public static int square( int a){
		return a*a;
	}
	public static void main (String[]args){
		//Question 1
		System.out.println(square(add(multiply(3,4) , multiply(5,7))));
		// Question 2
		System.out.println(add(square(add(4,7)) , square(add(8,3))));
	}
}