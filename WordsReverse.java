package week1.day2;

public class WordsReverse {

	public static void main(String[] args) 
	{
String name= "Ämazon development centre, Chennai";
String LowerCase = name.toLowerCase();


String[] words = LowerCase.split(" ");
for (int i=words.length-1 ; i>=0 ; i-- )
{
System.out.print(words[i]+" ");
		
	}

}
}
