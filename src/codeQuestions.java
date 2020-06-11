import java.util.Scanner;

public class codeQuestions {

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
			
		int number1,number2,number3;
		
		System.out.println("Please Enter 1.Number :");
		number1=scan.nextInt();
		
		System.out.println("Please Enter 2.Number :");
		number2=scan.nextInt();
		
		System.out.println("Please Enter 3.Number :");
		number3=scan.nextInt();
		
		if(number1==number2)
		{
			
			if(number2==number3)
				
			{
				System.out.println("------------------------------------------------------------------------------1");
				System.out.println("3 NUMBERS EQUAL TO EACH OTHER");
			}
			else if(number2<number3)
				
			{
				System.out.println("------------------------------------------------------------------------------2");
				System.out.println("1.number to 2.number equal to each other.3. they're big");
			}
			else if(number2>number3)
			{
				System.out.println("------------------------------------------------------------------------------3");
				System.out.println("1.number to 2.number equal to each other.3rd issue smallest ");
			}
		}else if(number1<number2)
		{
			if(number1<number3)
			{
				if(number2<number3)
					
				{
					System.out.println("------------------------------------------------------------------------------4");
					
					System.out.println("1<2<3");
				}
				else if(number3<number2)
				{
					System.out.println("------------------------------------------------------------------------------5");
					System.out.println("1<3<2");
				} 
			}else if(number3<number2)
			{
				if(number1<number2)
				{
					System.out.println("------------------------------------------------------------------------------6");
					System.out.println("3<1<2");
				}
				else if(number2<number1)
				{
					System.out.println("------------------------------------------------------------------------------7");
					System.out.println("3<3<2");
				}
			}
		}
		else if(number1==number3)
		{
			if(number1<number2)
			{
				System.out.println("1.number=3.number<number2");
			}
			else if(number2<number1)
			{
				System.out.println("1.number=3.number>number2");
			}
		}
		else if(number2==number3)
		{
			if(number1<number2)
			{
				System.out.println("1<3=2");
			}
			else if(number2<number1)
			{
				System.out.println("2=3<1");
			}
			
		}
		else if(number2<number1)
		{
			if(number1<number3)
			{
				System.out.println("2<1<3");
			}
			else if(number3<number1)
			{
				System.out.println("2<3<1");
			}
		}
		else if (number3<number2)
			
		{
			if(number1<number2)
			{
				System.out.println("3<1<2");
			}
			else if(number2<number1)
			{
				System.out.println("3<2<1");
			}
		}
		
		
    }

}
