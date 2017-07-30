import java.util.*; //For Scanner.
class calc
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in); //sc is name of Scanner.
		int a,b,c,s; 
		System.out.println("Enter 1st number: ");
		a=sc.nextInt(); //Taking input from user and stored in variable a.
		System.out.println("Enter 2nd numebr: ");
		b=sc.nextInt(); //Taking input from user and stored in variable b.
		System.out.println("Enter 1.Addition \n2.Subtraction \n3.Multiplication \n 4.Division \nEnter your choice: ");
		s=sc.nextInt(); //Taking input from user for swtich case.
		switch(s)
		{
			case 1:
			{
				c=a+b;
				System.out.println("Addition is "+c);
			}
			break;
			case 2:
			{
				c=a-b;
				System.out.println("Subtraction is "+c);
			}
			break;	
			case 3:
			{
				c=a*b;
				System.out.println("Multiplication is "+c);
			}
			break;
			case 4:
			{
				c=a/b;
				System.out.println("Division is "+c);
			}
			break;
			default:
			System.out.println("INVALID INPUT! ");
			break;
		}
		System.out.println("\n\nEnd of the program");
	}
}
		