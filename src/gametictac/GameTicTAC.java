/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametictac;



/**
 *
 * @author joshiyogesh
 */
public class GameTicTAC {

    /**
     * @param args the command line arguments
     */
    public static boolean playerOneTurn = true ;
    public static boolean playerOneWon = false ;
    public static boolean playerTwoWon = false ;
    public static int count = 0;
    public static void checkForWin(){
         
    if(TicTacToe.b1.equals("X")){
        if(TicTacToe.b2.equals("X")){
        if(TicTacToe.b3.equals("X")){
            playerOneWon = true;
//            System.out.println("45555");
        GameTicTAC.decidedWinner();}
    }
    }
    
    if(TicTacToe.b1.equals("X")){
        if(TicTacToe.b5.equals("X")){
        if(TicTacToe.b9.equals("X")){
            playerOneWon = true;   
           GameTicTAC.decidedWinner();}
    }
    }
     
    if(TicTacToe.b1.equals("X")){
        if(TicTacToe.b4.equals("X")){
        if(TicTacToe.b7.equals("X")){
            playerOneWon = true; 
           GameTicTAC.decidedWinner();}
    }
    }
     
    if(TicTacToe.b3.equals("X")){
        if(TicTacToe.b5.equals("X")){
        if(TicTacToe.b7.equals("X")){
            playerOneWon = true;  
           GameTicTAC.decidedWinner();}
    }
    }
    
    if(TicTacToe.b3.equals("X")){
        if(TicTacToe.b6.equals("X")){
        if(TicTacToe.b9.equals("X")){
            playerOneWon = true;  
          GameTicTAC.decidedWinner() ;}
    }
    }
    
    if(TicTacToe.b7.equals("X")){
        if(TicTacToe.b8.equals("X")){
        if(TicTacToe.b9.equals("X")){
            playerOneWon = true;
           GameTicTAC.decidedWinner();}
    }
    }
    
    if(TicTacToe.b4.equals("X")){
        if(TicTacToe.b5.equals("X")){
        if(TicTacToe.b6.equals("X")){
            playerOneWon = true; 
          GameTicTAC.decidedWinner() ;}
    }
    }
    
    if(TicTacToe.b2.equals("X")){
        if(TicTacToe.b5.equals("X")){
        if(TicTacToe.b8.equals("X")){
            playerOneWon = true;
           GameTicTAC.decidedWinner();}
    }
    }
    
    
         
    if(TicTacToe.b1.equals("O")){
        if(TicTacToe.b2.equals("O")){
        if(TicTacToe.b3.equals("O")){
            playerTwoWon = true;
           GameTicTAC.decidedWinner();}
    }
    }
    
    if(TicTacToe.b1.equals("O")){
        if(TicTacToe.b5.equals("O")){
        if(TicTacToe.b9.equals("O")){
           playerTwoWon = true;
          GameTicTAC.decidedWinner();}
    }
    }
     
    if(TicTacToe.b1.equals("O")){
        if(TicTacToe.b4.equals("O")){
        if(TicTacToe.b7.equals("O")){
             playerTwoWon = true;
          GameTicTAC.decidedWinner() ;}
    }
    }
     
    if(TicTacToe.b3.equals("O")){
        if(TicTacToe.b5.equals("O")){
        if(TicTacToe.b7.equals("O")){
            playerTwoWon = true;
           GameTicTAC.decidedWinner();}
    }
    }
    
    if(TicTacToe.b3.equals("O")){
        if(TicTacToe.b6.equals("O")){
        if(TicTacToe.b9.equals("O")){
            playerTwoWon = true;
          GameTicTAC.decidedWinner();}
    }
    }
    
    if(TicTacToe.b7.equals("O")){
        if(TicTacToe.b8.equals("O")){
        if(TicTacToe.b9.equals("O")){
            playerTwoWon = true;
           GameTicTAC.decidedWinner();}
    }
    }
    
    if(TicTacToe.b4.equals("O")){
        if(TicTacToe.b5.equals("O")){
        if(TicTacToe.b6.equals("O")){
             playerTwoWon = true;
           GameTicTAC.decidedWinner();}
    }
    }
    
    if(TicTacToe.b2.equals("O")){
        if(TicTacToe.b5.equals("O")){
        if(TicTacToe.b8.equals("O")){
             playerTwoWon = true;
          GameTicTAC.decidedWinner();}
    }
    }
    
    
    }
     
    public static void decidedWinner(){
//             WinnerWindow win = new WinnerWindow();
    if(playerOneWon == true ){
//
//                win.Fill("Player One Has Won !");
//                new WinnerWindow().setVisible(true);
    }
    else if (playerTwoWon == true){
//        win.Fill("Player Two Has Won !");
//        new WinnerWindow().setVisible(true);
    }
    else
    {
//          win.Fill("Match Has been Tied !");
//          new WinnerWindow().setVisible(true);
    }
    }
   
     
    
    public static void main(String[] args) {
        // TODO code application logic here
        new TicTacToe().setVisible(true);
        
    }
    
}
