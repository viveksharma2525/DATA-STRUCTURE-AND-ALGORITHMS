import java.util.ArrayList;
import java.util.List;
class RatMaze{
	public boolean Check(int i, int j, int mat[][], int n, int m, List<String> path){
		if ( i == n-1 && j == m-1) {
			//1.add
			path.add("(" + i + "," + j + ")");
			return true;
		}
		// Out of Boundary
		if ( i < 0 || i >= n || j < 0 || j >= m) {
			return false;
		}
		if ( mat[i][j] == 1 || mat[i][j] == 2) {
			return false;
		}

		mat[i][j] = 2;
		path.add("(" + i + "," + j + ")");

		 if (Check(i - 1, j, mat, n, m, path) || 
            Check(i, j - 1, mat, n, m, path) || 
            Check(i, j + 1, mat, n, m, path) || 
            Check(i + 1, j, mat, n, m, path)) {
            return true;
        }

		 // Backtrack: remove the position from the path
        path.remove(path.size() - 1);
        mat[i][j] = 0; // Unmark the cell

        return false;
	}
	public static void main(String[] args) {
		 int mat[][] = {
            {0, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 0, 0, 0},
            {0, 0, 1, 0}
        };

		int n = mat.length;
		int m = mat[0].length;

		RatMaze rat = new RatMaze();
		List<String> path = new ArrayList<>();

        if (rat.Check(0, 0, mat, n, m, path)) {
            System.out.println("Path found: " + path);
        } else {
            System.out.println("No path found.");
        }
	}
}