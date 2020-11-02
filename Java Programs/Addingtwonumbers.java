import java.util.Scanner;

public class Addingtwonumbers {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num1 =scan.nextInt();
	Scanner scan2=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num2 =scan.nextInt();
	System.out.printf("The sum: "+(num1+num2));

	}

}
