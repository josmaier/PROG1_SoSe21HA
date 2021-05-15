import java.util.Scanner;

public class ConwaysGameOfLife {

    public static void main(String[] args){

        //scanner for input
        Scanner input = new Scanner(System.in);

        System.out.println("Please input the desired amount of generations: ");

        //setting amount of generations to be generated
        int genlim = input.nextInt();

        System.out.println("Please input the desired grid size: ");

        //setting gridsize
        int gridSize = input.nextInt();

        //initialising new grid
        GoLGrid grid = new GoLGrid(gridSize);

        //filling grid
        int[][] data = grid.createRandom(0.3);

        //array that saves the amount of neighbours of a grid cell
        int[][] neighData = new int[gridSize][gridSize];

        //drawing intial grid
        grid.setData(data);

        //for loop for each generation
        for (int gen = 0; gen < genlim; gen++){

            //this block updates the neighbour data array with the current number of neighbours
            for (int j = 0; j < gridSize; j++){
                for (int k = 0; k < gridSize; k++){
                    //filling array with the current number of neighbours
                    neighData[j][k] = grid.getNumberOfNeighbors(j,k);
                }
            }

            for (int i = 0; i < gridSize; i++){

                //this block updates if a cell is dead or alive depending on the amount of neighbours or neighbours and the cells status
                for (int j = 0; j < gridSize; j++){
                    if ((data[i][j] == 1 && neighData[i][j] == 2) || neighData[i][j] == 3){
                        data[i][j] = 1;
                    }
                    else if (data[i][j] == 1 && (neighData[i][j] < 2 || neighData[i][j] > 3)) {
                        data[i][j] = 0;
                    }
                }
            }

            //redrawing grid with new information
            grid.setData(data);

            //having program sleep for 350ms at the end of the gen
            grid.sleep(350);
        }
    }
}
