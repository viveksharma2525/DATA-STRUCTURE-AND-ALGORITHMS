class NQueens {
    public void nQueen(int index, int col[], int ld[], int rd[], int mat[][], int N) {
        if (index == N) {
            printSolution(mat, N);
            return;
        }

        for (int j = 0; j < N; j++) {
            if (col[j] == 1 || ld[N + index - j] == 1 || rd[index + j] == 1) {
                continue;
            }

            mat[index][j] = 1;
            col[j] = 1;
            ld[N + index - j] = 1;
            rd[index + j] = 1;

            nQueen(index + 1, col, ld, rd, mat, N);

            // Backtracking
            mat[index][j] = 0;
            col[j] = 0;
            ld[N + index - j] = 0;
            rd[index + j] = 0;
        }
    }

    public void printSolution(int mat[][], int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int N = 8; // You can change this to solve for different N
        int col[] = new int[N];
        int ld[] = new int[2 * N];
        int rd[] = new int[2 * N];
        int mat[][] = new int[N][N];

        NQueens obj = new NQueens();
        obj.nQueen(0, col, ld, rd, mat, N);
    }
}
