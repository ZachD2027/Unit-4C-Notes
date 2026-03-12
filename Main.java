public class Main {

   public static void main(String []args) {

      // *** 2D ARRAY DATA STRUCTURE ***
      // like an Array, but a GRID
      // ROWS (horizontal) & COLUMNS (vertical)

      // DECLARE a 2D array with double square brackets
      int [][] experimentData; // null (empty)
      double [][] pointValues;

      // CRATE a 2D array, call constructor 
      experimentData = new int[10][3]; // 10 rows, 3 cols

      // INITIALIZE a 2D array (declare + create)
      String [][] seatingChart = new String[4][6];
      // total number of items? 4 * 6 = 24

      // SET A VALUE by accessing a cell 
      // ACCESS a cell: arrayName [row][col]
      seatingChart[0][0] = "Mia";
      seatingChart[0][5] = "Sohaila"; 
      // 6 cols -> but 5 is FINAL INDEX!!!
      seatingChart[1][0] = "Ethan";
      seatingChart[1][5] = "Zach";
      seatingChart[2][1] = "Aniyah";
      seatingChart[2][3] = "Simeon";
      seatingChart[2][4] = "Bowe";
      seatingChart[3][0] = "Max S.";
      seatingChart[3][1] = "Caleb";
      seatingChart[3][2] = "Max D.";
      seatingChart[3][3] = "Kyanni";
      seatingChart[3][4] = "Danny";
      seatingChart[3][5] = "Matthew";

      // Shortcut: INITIALIZER LISTS 
      // use double curly brackets to set values 
      // for a 2D array right away!
      String[][] bingo = {
                           {"!", "A", "11"},
                           {"$", "<3", ":)"},
                           {",", "20","x"}
                         };
      // look at new array
      System.out.println(bingo); // no built-in toString 
      // have to use a loop or access individual items
      System.out.println(bingo[0][0]);
      System.out.println(bingo[1][1]); //heart 
      System.out.println(bingo[1][2]); //smiley 

      // 4.12 2D Array TRAVERSALS (loops)
      // A ROW in a 2D array is just a 1D array
      // when we loop, we goROW first
      // then every COL in that arow

      // ENHANCED FOR-EACH loops (nested)
      // outer loop iterates through all ROWS
      // every row in seatingChart is a 1D array
      for ( String[] row : seatingChart ) {
         // for every col in that current row
         for ( String col : row) {
            System.out.print(col + " ");
         }
         System.out.println();
      }
      // remember that FOR-EACH loops are only
      // for visiting every item, not changing values

      // STANDARD for loops require tracking index
      // and knowing how many items in each row/col
      // array.length provides # of ROWS in a 2D array
      int numRows = seatingChart.length; // 4
      // array[0].length provides # of COLS
      int numCols = seatingChart[0].length;
      // seatingChart[0] is literally the whole first row

      // use this info in the standard for loop
      for (int r = 0; r < seatingChart.length; r++) {
         for (int c = 0; c < seatingChart[0].length; c++) {
            System.out.print( seatingChart[r][c] + " " );
         }
         System.out.println(); //new line every row
      }



      // CALL the two methods defined outsaide the main
      int[][] matrix = { {1,2,3} , {4,5,6} };
      System.out.println( getRowTotal(0, matrix) );
      System.out.println( getRowTotal(1, matrix) );

   } // ENDS MAIN METHOD

   // define method to count items in a specified row
   public static int getRowTotal( int row, int[][] array ) {
      // prepare the return value
      int sum = 0;
      // loop thru the row
      for ( int currentCol : array[row] ) {
         sum+= currentCol;
      }
      return sum;
   }
   

} // ENDS CLASS
