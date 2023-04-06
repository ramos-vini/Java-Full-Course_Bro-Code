public class Main {

	public static void main(String[] args) {
		
		int[][] numbers = new int[3][3];
		
		numbers[0][0] = 1;
		numbers[0][1] = 2;
		numbers[0][2] = 3;
		
		numbers[1][0] = 4;
		numbers[1][1] = 5;
		numbers[1][2] = 6;
		
		numbers[2][0] = 7;
		numbers[2][1] = 8;
		numbers[2][2] = 9;
		
		for (int i=0; i<numbers.length; i++) {
			System.out.println();
			
			for (int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
		}
		
		System.out.println();
		System.out.print("- - -");
		
		char[][] letters = {
				{'a', 'b', 'c'},
				{'d', 'e', 'f'},
				{'g', 'h', 'j'}
		};
		
		for (int i=0; i<letters.length; i++) {
			System.out.println();
			
			for (int j=0; j<letters[i].length; j++) {
				System.out.print(letters[i][j] + " ");
			}
		}
		
	}
}
