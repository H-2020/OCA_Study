package questions_1_25;

public class Test15 {

    public static void main(String[] args) {
        char[][] grid=new char[3][3];
        grid[1][1]='X';
        grid[0][0]='O';
        grid[2][0]='X';
        grid[0][1]='O';
        grid[2][2]='X';
        grid[1][2]='O';

        grid[2][1]='X';

        for (int i = 0; i < grid.length ; i++) {
            for (int j = 0; j <grid[i].length ; j++) {
                System.out.print(grid[i][j]);

            }
            System.out.println();
        }



    }
}
