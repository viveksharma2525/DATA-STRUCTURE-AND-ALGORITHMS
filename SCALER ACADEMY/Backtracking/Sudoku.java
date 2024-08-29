class Sudoku {
	public boolean isValid(int[][] mat, int r, int c, int num) {
		for (int i = 0; i < 9; i++) {
			if (mat[r][i] == num || mat[i][c] == num) {
				return false;
			}
		}

		int startRow = r - r % 3;
		int startCol = c - c % 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (mat[startRow + i][startCol + j] == num) {
					return false;
				}
			}
		}

		return true;
	}

	public void sudoku(int index, int mat[][]) {
		if (index == 81) {
			printSolution(mat);
			return;
		}

		int r = index / 9;
		int c = index % 9;

		if (mat[r][c] != 0) {
			sudoku(index + 1, mat);
			return;
		}

		for (int num = 1; num <= 9; num++) {
			if (isValid(mat, r, c, num)) {
				mat[r][c] = num;
				sudoku(index + 1, mat);
				mat[r][c] = 0;
			}
		}
	}

	public void printSolution(int[][] mat) {
		for (int r = 0; r < 9; r++) {
			for (int c = 0; c < 9; c++) {
				System.out.print(mat[r][c] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] mat = {
			{5, 0, 1, 7, 0, 0, 0, 0, 9},
			{0, 4, 0, 3, 0, 1, 0, 0, 0},
			{0, 2, 0, 0, 0, 0, 1, 3, 6},
			{0, 6, 0, 1, 4, 0, 7, 0, 0},
			{0, 0, 5, 0, 0, 0, 0, 9, 4},
			{0, 0, 0, 2, 9, 0, 0, 0, 5},
			{0, 0, 8, 0, 3, 6, 0, 0, 0},
			{0, 0, 6, 5, 0, 7, 0, 0, 0},
			{0, 0, 0, 0, 2, 4, 0, 0, 1}
		};

		Sudoku solver = new Sudoku();
		solver.sudoku(0, mat);
	}
}
