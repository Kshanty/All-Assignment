package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+" ");
		for (int i = 1; i < 11; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
			
		}
		
		
	}

}
