package task;

public class Ifelse {
	// Greatest among 3 numbers
	public static void main(String[] args) {

		int a=10,b=5,c=30;
				
		if(a>b && a>c)
		{
			System.out.println("Greatest number is : "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Greatest no is : "+b);
		}
		else
		{
			System.out.println("Greatest number is : "+c);
		}
	}

}
