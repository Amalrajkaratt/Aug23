package task;

public class Concatenate {

	public static void main(String[] args) {
		
	//Q1
		String s="jmeter";
		String s1=" Performance testing tool";
		 
		System.out.println(s.concat(s1));
		
		System.out.println("------------");

	//Q2
		String p="Java language is platform independent";
		System.out.println(p.contains("language"));
		if(p.contains("language"))
				{
			System.out.println("Pass");
				}
		else
		{
			System.out.println("Fail");
		}
		
		System.out.println("------------");
		
	//Q3
		String s3="Selenium webdriver is used for webapplication testing";
		String[] s4=s3.split(" ");
		
		//Printing the values using for each
		for(String a:s4)
		{
			System.out.println(a);
			if(a.contains("webapplication"))
			{
				break;
			}
		}
		
		
	}

}
