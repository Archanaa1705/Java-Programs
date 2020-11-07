import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TrialTicTAcToe {

	public static void main(String[] args) {

		char[][] boardgame = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };

		while (true) {
			System.out.println("Enter your placement: ");
			Scanner scan = new Scanner(System.in);
			int pos = scan.nextInt();

			Random cpu = new Random();
			int cpupos = cpu.nextInt(9) + 1;

			placepos(pos, boardgame, "Player");
			placepos(cpupos, boardgame, "CPU");
			displayboardgame(boardgame);
			checkWinner();
		}
	}

	

	private static void placepos(int pos, char[][] boardgame, String User) {

		char symbol = ' ';
		if (User.equals("Player")) {
			symbol = 'X';
		}

		else if (User.equals("CPU")) {
			symbol = 'O';
		}

		switch (pos) {
		case 1:
			boardgame[0][0] = symbol;
			break;
		case 2:
			boardgame[0][2] = symbol;
			break;
		case 3:
			boardgame[0][4] = symbol;
			break;
		case 4:
			boardgame[2][0] = symbol;
			break;
		case 5:
			boardgame[2][2] = symbol;
			break;
		case 6:
			boardgame[2][4] = symbol;
			break;
		case 7:
			boardgame[4][0] = symbol;
			break;
		case 8:
			boardgame[4][2] = symbol;
			break;
		case 9:
			boardgame[4][4] = symbol;
			break;

		}

	}

	private static void displayboardgame(char[][] boardgame) {
		for (char[] rows : boardgame) {

			for (char cols : rows) {

				System.out.print(cols);

			}
			System.out.println();
		}

	}
	
	private static void checkWinner() {
 
			List topRow=Arrays.asList(1,2,3);
			System.out.println(topRow);
			List<List>winning=new ArrayList<List>();
			winning.add(topRow);
			
			for (List l:winning) {
				
				
			}

	}

}
