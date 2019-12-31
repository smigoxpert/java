// Rama Smith
// feb-29-19
// This program converts celsius to Fahrenheit

	package numbers;

	import java.util.Scanner;

	public class tempconverter
	{
		public static void  main (String[] args) {

			float temp;
			System.out.println("Enter the temperature to convert in to celsius");
			Scanner sc=new Scanner(System.in);
			temp=sc.nextFloat();
			temp=((temp-32)*5)/9;
			System.out.println("temp in celsius" + temp);
			


		}
	}