import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		
		
		Random anynumber = new Random();
		int rolldice=anynumber.nextInt(6)+1;
		System.out.println("The number on the rolled dice "+ rolldice);
		
		

	}

}
