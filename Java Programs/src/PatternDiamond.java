import java.util.Scanner;

public class PatternDiamond {

	public static void main(String[] args) {
		
		System.out.println("Number of stars I prefer ");
		Scanner sc=new Scanner(System.in);
		int numOfStars=sc.nextInt();
		
		for(int i=0;i<numOfStars;i++) {
			for (int j=0;j<i;j++) {
			
			System.out.print("*");
			}
			System.out.println();
			}
		
		for (int i=0;i<numOfStars;i++) {
			for (int j=numOfStars;j>i;j--) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}}
