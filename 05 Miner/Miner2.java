import java.util.Random;
import java.util.Scanner;

public class Miner2 {
	
	public static int[][] initializeField(int w, int h) {
		
		int [][] a = new int[w][h];
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				a[0][0] = 0;
			}
		}
		return a;
		
	}

	public static void generateMines(int [][] field, int nMines) {
		
		Random r = new Random();
		int k = 0;
		while (k < nMines) {
			int i = r.nextInt(field.length);
			int j = r.nextInt(field[0].length);
			if (field[i][j] != -1) {
				field[i][j] = -1;
				k += 1;
			}
		}	
	}
	
	public static void outputField(int [][] field, int [][] opened) {
		
		for (int i = 0; i < field.length; i++) {
			System.out.print(i + " | ");
			for (int j = 0; j < field[0].length; j++) {
				switch (opened[i][j]) {
					case 0:
						System.out.print("." + " ");
						break;
					case 1:
						if (field[i][j] == -1) {
							System.out.print("*" + " ");
						}
						else {
							System.out.print(field[i][j] + " ");
						}
						break;
					case 2:
						System.out.print("F" + " ");
						break;
				}
			}
			System.out.println();
		}
		System.out.print("  | ");
		for (int i = 0; i < field.length; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
	
	public static int [] getAndCheckStep(int [][] field, int [][] opened) {
		
		boolean correctCoord = false;
		int [] coords = new int[]{0, 0};
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter coordinates");
			coords[0] = sc.nextInt(); 
			coords[1] = sc.nextInt();
			if ((coords[0] >= 0) && (coords[0] < field.length) && (coords[1] >= 0) && (coords[1] < field[0].length)) {
				correctCoord = true;
			} else {
				System.out.println("Incorrect Coordinates :-(");
			}
		} while (!correctCoord);
		
		return coords;
		
	}
	
	public static boolean makeStep(int [][] field, int [][] opened, int [] coords) {
		opened[coords[0]][coords[1]] = 1;
		if (field[coords[0]][coords[1]] == -1) {
			System.out.println("Oh no...");
			return false;
		} else {
			System.out.println("You're lucky!...");
			return true;
		}
	}
	
	public static void main(String [] args) {
		
		System.out.println("Welcome to Minesweeper");
		
		final int w = 10;
		final int h = 10;
		final int nMines = 10;
		
		// create gamefield
		int [][] field = initializeField(w, h);
		int [][] opened = initializeField(w, h);
		
		// generate mines
		generateMines(field, nMines);
		
		// output
		outputField(field, opened);
		
		boolean gameIsGoing = true;
		while (gameIsGoing) {
			
			int [] coordinates = getAndCheckStep(field, opened);
			gameIsGoing = makeStep(field, opened, coordinates);
			outputField(field, opened);
			
		}
	}
	
}