package week1.day1;

public class PrimeNum {

	public static void main(String[] args) {
		
	
		
			int num = 10;
			int t=0;
		do {
			for(int j=2; j<num; j++)
				{
				if(num%j==0) {
					System.out.println(num+" not prime");
					t++;
					break;
						}
				else
					t=0;
				}
			if(t==0)
			{
				System.out.println(num+" is prime");
				t=0;
			}
			num--;
			}while(num>0);
}
}


