/*Problem
You are given a table with 
 rows and 
 columns. Each cell is colored with white or black. Considering the shapes created by black cells, what is the maximum border of these shapes? Border of a shape means the maximum number of consecutive black cells in any row or column without any white cell in between.

A shape is a set of connected cells. Two cells are connected if they share an edge. Note that no shape has a hole in it.


Input format:

The first line contains t denoting the number of test cases.
The first line of each test case contains integers n,m denoting the number of rows and columns of the matrix. Here, '#' represents a black cell and '.' represents a white cell. 
Each of the next n lines contains m integers.


Output format:

Print the maximum border of the shapes.

Sample Input:

10
2 15
.....####......
.....#.........
7 9
...###...
...###...
..#......
.####....
..#......
...#####.
.........
18 11
.#########.
########...
.........#.
####.......
.....#####.
.....##....
....#####..
.....####..
..###......
......#....
....#####..
...####....
##.........
#####......
....#####..
....##.....
.#######...
.#.........
1 15
.....######....
5 11
..#####....
.#######...
......#....
....#####..
...#####...
8 13
.....######..
......##.....
########.....
...#.........
.............
#######......
..######.....
####.........
7 5
.....
..##.
###..
..##.
.....
..#..
.#...
14 2
..
#.
..
#.
..
#.
..
..
#.
..
..
..
#.
..
7 15
.###########...
##############.
...####........
...##########..
.......#.......
.....#########.
.#######.......
12 6
#####.
###...
#.....
##....
###...
......
.##...
..##..
...#..
..#...
#####.
####..

Sample Output:
4
5
9
6
7
8
3
1
14
5

*/

import java.util.*;

class TestClass {
 
    public static int findMaxBorder(char[][] grid, int n, int m) {
        int maxBorder = 0;
 
        // row-wise max consecutive black cells
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '#') {
                    count++;
                    maxBorder = Math.max(maxBorder, count);
                } else {
                    count = 0;
                }
            }
        }
 
        // column-wise max consecutive black cells
        for (int j = 0; j < m; j++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (grid[i][j] == '#') {
                    count++;
                    maxBorder = Math.max(maxBorder, count);
                } else {
                    count = 0;
                }
            }
        }
 
        return maxBorder;
    }
 
    public static void main(String args[] ) throws Exception { 

        // Write your code here

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] grid = new char[n][m];
 
            for (int i = 0; i < n; i++) {
                grid[i] = sc.next().toCharArray();
            }
 
            System.out.println(findMaxBorder(grid, n, m));
        }
        sc.close();
 
    }
}
