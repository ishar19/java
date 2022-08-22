package MazeProblems;

public class CountingPaths {
    public static void main(String[] args) {
        int res = countPaths(3,3);
        System.out.println(res);
    }

    static int countPaths(int row, int col)
    {
        if (row == 1 || col == 1) {
            return 1;
        }
        int ans1 = countPaths(row-1, col);
        int ans2 = countPaths(row, col-1);

        return ans1 + ans2;
    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        if (r < maze.length - 1) {
            pathRestrictions(p + 'D', maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, r, c + 1);
        }
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }
}

// there could be variation of going diagonal, just add one more recursive call
// one more variation of having an obstacle, just return zero when face obstacle 