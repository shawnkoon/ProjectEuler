/*
  Idea: First solution to this problem took way too much time to figure out
        20 x 20 grid paths due to it's brute force style approach.
        This time we will look for some kind of pattern.
        If we look at the graph carefully, next right bottom point is sum of
        it's left possible routes & top possible routes.
        ex)  3 x 3 grid.
            0  1  1  1
            1  2  3  4
            1  3  6  10
            1  4  10 20
*/
public class Problem15v2 {
  public static void main(String[] args) {
    int gridSize=20;
    long[][] gridArray = new long[gridSize + 1][gridSize + 1];

    initializeArray(gridArray);
    calculateRoutes(gridArray);
    // printArray(gridArray);

    System.out.printf("\nTotal path for %dx%d grid is %d routes.\n", gridSize, gridSize, gridArray[gridSize][gridSize]);
  }// End of main().

  // Initializes Top most, Left most Row & Col into 1s.
  private static void initializeArray(long[][] gridArray) {
    for(int row = 1; row < gridArray.length; row++)
      gridArray[row][0] = 1;
    for(int col = 1; col < gridArray[0].length; col++)
      gridArray[0][col] = 1;
  }// End of initializeArray().

  // Start solving by adding it's curposition's left value & top value.
  private static void calculateRoutes(long[][] gridArray) {
    for(int row = 1; row < gridArray.length; row++) {
      for(int col = 1; col < gridArray[row].length; col++) {
        gridArray[row][col] = gridArray[row][col - 1] + gridArray[row - 1][col];
      }
    }
  }// End of calculateRoutes().

  private static void printArray(long[][] gridArray) {
    for(int row = 0; row < gridArray.length; row++) {
      for(int col = 0; col < gridArray[row].length; col++) {
        System.out.print(gridArray[row][col]+"  ");
      }
      System.out.println("");
    }
  }// End of printArray()

}// End of Problem15v2 class.