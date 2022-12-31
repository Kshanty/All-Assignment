package week3.day1;

public class Overload {

public void movieWatch()
{
	System.out.println("movie playing");
}

public String movieWatch(String name)
{
	System.out.println("playing movie name "+name);
	return name;
}

public String movieWatch ( String name1, int time)
{
	System.out.println("watching movie  "+name1+"for "+time+"minutes ");
	return name1;
}
	}

	
