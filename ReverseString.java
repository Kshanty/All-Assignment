package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		
 String name = "SHANTHINI";
 char[] charArray= name.toCharArray() ;
 System.out.println("String is "+name);
 System.out.println("Reverse string is ");
 for(int i=name.length()-1 ; i>=0; i--)
 {
System.out.print(charArray[i]);
	}

}
}