import java.util.Scanner;
class Main {
  /*Name: Arashpreet 
    Purpose: To develop interactive game that implements compass method developed as a class
*/
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    boolean [][]treasure  = new boolean [10][10];
    boolean [][] board = new boolean [10][10];
    boolean gameOver = false; 
    int row = 0;
    int col = 0;
    int userPoints = 0;

    for (int r = 0; r < 10; r++){
      for (int c = 0; c < 10; c++){
        treasure [r][c] = false; 
      }//ifcol
      }//ifrow

    //Hiding treasure along game board 
    treasure [1][1] = true;
    treasure [2][2] = true;
    treasure [3][3] = true;
    treasure [4][4] = true;
    treasure [5][5] = true;

    //gameBoard 
    for (int r = 0; r < 10; r++){
      System.out.println();
      for (int c = 0; c < 10; c++){
        System.out.print(" ? ");
      }//if col
      }//if row
    
    while (gameOver ==false){
      System.out.println();
      System.out.println("Which row would you like to search?");
      row = input.nextInt();
     System.out.println("Which column would you like to search?");
     col = input.nextInt();
      
      board [row][col] = true;
      
     //problem here 
      updateBoard (board, treasure);
          
    //if contains treausre user gains point
    if (treasure [row][col]) {
      userPoints+= 1;
    }//if
      
    //checking if they have 5 points 
    if (userPoints == 5 ){
      System.out.println("All treasures has been found!!");
      gameOver = true; 
    }//if 
    System.out.println();
    System.out.println("Points: "+ userPoints);
    }//while
    
  }//main
  public static void updateBoard(boolean [][] upBoard, boolean [][] treasure){
    System.out.println(\u000C);
    for (int r = 0; r < 10; r++){
      System.out.println();
      for (int c = 0; c < 10; c++){
        if (upBoard [r][c] == true && treasure [r][c]== true){
          System.out.print(" X ");
        }//if
        else if (upBoard [r][c] == true && treasure[r][c]== false){
          System.out.print(" O ");
        }//else if 
        else {
          System.out.print(" ? ");
        }//else
      }//for col
    }//for row
  }//update Board
}//class
