import java.util.Scanner;
public class BOIIII
	{
		static String name;
		static int question;

		public static void main(String[] args)
			{
				Greeting();
				OddorEven();

			}
		public static void Greeting()
			{
				Scanner userStringInput = new Scanner(System.in);
				System.out.println("Welcome What is Your Name?");
				name = userStringInput.nextLine();
			}
		public static void OddorEven()
		{
			Scanner userIntInput = new Scanner(System.in);
			System.out.println("Enter your number.");
			question = userIntInput.nextInt();
			if (question % 2 == 0)
				{
					System.out.println("The Number " + question + " is even "  + name +"!");
				}
			else
				{
					System.out.println("The Number " + question + " is odd " + name +"!");
				}
		}

	}
