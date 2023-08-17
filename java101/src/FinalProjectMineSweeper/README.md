# Minesweeper Game
- patika.dev Java 101 Final Project
## Game Rules :
- The game is text-based.
- It should be played using two-dimensional arrays and designed within the MineSweeper class.
- The matrix dimensions, i.e., the number of rows and columns, should be determined by the user.
- A quarter of the total number of array elements (elementCount / 4) should be randomly assigned as mines. For example, if the array is of size 4x3, the element count should be calculated using the formula (rowCount * columnCount), resulting in a size of 12. In this case, there should be 3 mines, as 12 / 4 = 3. (hint: you can create a second array to store the positions of these mines.)
- The user should select a point on the matrix. They need to input the row and column values for the point selection.
- It should be checked whether the selected point is within the boundaries of the array. If the condition is not met, the user should be prompted to enter the point again.
- If there's a mine at the chosen point, the user should lose the game.
- If there's no mine, the program should examine all adjacent positions to the selected point (right, left, above, below, top left diagonal, top right diagonal, bottom right diagonal, bottom left diagonal) and the sum of the mines around that point should be written in the respective location. If there are no adjacent mines, the value "0" should be assigned to that point.
- If the user manages to select all points without hitting any mines, they should win the game.

## Losing Scenario

``````
Mine Locations
* - -
- - *
- - -
===========================
Welcome to the Minesweeper Game!
- - - 
- - - 
- - -
Enter Row : 0
Enter Column : 1
===========================
- 2 -
- - -
- - -
Enter Row : 2
Enter Column : 0
===========================
- 2 -
- - -
0 - -
Enter Row : 0
Enter Column : 2
===========================
- 2 1
- - -
0 - -
Enter Row : 0
Enter Column : 0
Game Over!!
===========================
``````
# Winning Scenario

``````
Mine Locations
- - -
- * - 
- * - 
=========================== 
Welcome to the Minesweeper Game! 
- - - 
- - - 
- - - 
Enter Row : 0 
Enter Column : 0 
=========================== 
1 - - 
- - - 
- - - 
Enter Row : 0 
Enter Column : 1 
=========================== 
1 1 - 
- - - 
- - - 
Enter Row : 0 
Enter Column : 2 
=========================== 
1 1 1 
- - - 
- - - 
Enter Row : 1 
Enter Column : 0 
=========================== 
1 1 1 
2 - - 
- - - 
Enter Row : 2 
Enter Column : 0 
=========================== 
1 1 1 
2 - - 
2 - - 
Enter Row : 1 
Enter Column : 2 
=========================== 
1 1 1 
2 - 2 
2 - - 
Enter Row : 2 
Enter Column : 2 
Congratulations! You Won! 
1 1 1 
2 - 2 
2 - 2 
===========================
``````
