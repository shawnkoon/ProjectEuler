/*
  Idea: The problem seems to be a finding path type of problem.
        Where I need to find how many paths are available.
        In this case, recursion might be the way to approach this problem.

  Special: only moves either right or down.
*/
public class Problem15 {
  public static void main(String[] args) {
    int gridSize=20, startRow=0, startCol=0;
    int totalPath = recursivePathFind(gridSize, startRow, startCol);

    System.out.printf("Total path for %dx%d grid is %d routes.\n", gridSize, gridSize, totalPath);
  }// End of main()

  private static int recursivePathFind(int gridSize, int curRow, int curCol) {
    int result = 0;
    // Base case
    if(curRow == gridSize && curCol == gridSize)
      return 1;    
    
    if(curRow > gridSize || curCol > gridSize)
      return 0;
    
    // Recursive case
    result += recursivePathFind(gridSize, curRow, curCol + 1);
    result += recursivePathFind(gridSize, curRow + 1, curCol);

    return result;
  }// End of recursivePathFind().

}// End of Problem15 class.