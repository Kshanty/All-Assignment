package week1.day2;

public class Duplicatenum {

	public static void main(String[] args) {
int[] array= {2,5,7,1,2,8,7,9,10};
for (int i=0; i<array.length; i++)
{
	for (int j=i+1; j<array.length; j++)
	{
		if(array[i]==array[j]) 
		{
			System.out.println("Duplicate "+array[i]);
		}
	}
}
		
	}


}
