package Newprograms;

public class Polymorphism1{

	public static void main(String[] args) {
		int a=20, b = 5;
		System.out.println(add(a,b));
		System.out.println(subtract(a,b));
		System.out.println(multiply(a,b));
		System.out.println(divide (a,b));
		System.out.println(mod(a,b));
		
	}
		public static int add (int a, int b) {
		return a+b;
			
		}
		public static int subtract (int a,int b) {
			return a-b;
		}
		public static int multiply ( int a , int b) {
			return a*b ;
		}
		
		public static int divide (int a,int b) {
			return a/b ;
			
		}
		public static int mod(int a ,int b) {
			return a%b;
		}
}

	

