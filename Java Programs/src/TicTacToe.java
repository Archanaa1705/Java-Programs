import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		char[][] boardgame = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };
		
		DisplayBoard(boardgame);
		Scanner scan = new Scanner(System.in);
		
	

		while (true) {
			System.out.println("Enter your placement: ");
			int pos = scan.nextInt();
		PlaceChoice(boardgame, pos, "Player");
	
		Random rand=new Random();
		int cpuPos=rand.nextInt(9)+1;
		PlaceChoice(boardgame, cpuPos, "cpu");
		DisplayBoard(boardgame);
	}}

	public static void DisplayBoard(char[][] boardgame) {
		for (char[] rows : boardgame) {
			for (char cols : rows) {
				System.out.print(cols);

			}
			System.out.println();

		}
	}

	public static void PlaceChoice(char[][] boardgame, int choice, String User) {
		
		char symbol =' ';
		if (User.equals("Player")) {
			symbol='X';
			}
		else if(User.equals("cpu")) {
			symbol='O';
			}
		
		switch (choice) {
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

}
