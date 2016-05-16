
/**
 * Write a description of class TicTacToe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicTacToe extends JFrame implements ActionListener
{
    private JLabel messages;
    private JPanel board;
    private JButton[][] boardSpots;
    private char[][] marks;
    private boolean xTurn;
    
    //constructor
    public TicTacToe()
    {
            //Set board and size
        super("Tic Tac Toe");
            this.setLayout(new BorderLayout());
            this.setSize(500,500);
        
            // Game messages    
        messages = new JLabel("Player X's turn.");
        messages.setVisible(true);
        this.add(messages, BorderLayout.NORTH);
        
            //3x3
        board = new JPanel(new GridLayout(3, 3));
        board.setVisible(true);
        
            //Buttons
        boardSpots = new JButton[3][3];
        marks = new char[3][3];
            for (int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 3; j++)
                {
                    boardSpots[i][j] = new JButton(" ");
                    boardSpots[i][j].setEnabled(true);
                    boardSpots[i][j].addActionListener(this);
                    boardSpots[i][j].setActionCommand(i + " " + j);
                    boardSpots[i][j].setVisible(true);
                    board.add(boardSpots[i][j]);
                    marks[i][j] = '.';
                } // end second for
            }    // end first for
       
            //Add JPanel to center
        this.add(board, BorderLayout.CENTER);
        xTurn = true;
        
        
        }    
    
            //Method to check if player has won
        private boolean won(char playerMark, char[][]board)
        {
           
            // Checking for horizontal win
            for(int row = 0; row < 3; row++)
        {
                int count = 0;
                for(int col = 0; col < 3; col++)
            {
                if(board[row][col] == playerMark)
                count ++;
                else
                count = 0;
            }  //end second for 
            if(count == 3)
            return true;
        }//end first for
        
        //check for vertical win
        
            for(int col = 0; col < 3; col++)
        {
            int count = 0;
            for(int row = 0; row < 3; row++)
            {
                  if(board[row][col] == playerMark)
                count ++;
                else
                count = 0;
            }  //end second for 
            if(count == 3)
            return true;
        }//end first for
        
        //Check for diagonal win
        
        if(board[1][1] == playerMark && board[0][0] == playerMark && board[2][2] == playerMark)
        return true;
        
        if(board[1][1] == playerMark && board[0][2] == playerMark && board[2][0] == playerMark)
        return true;
        
        //if no diagonal
        return false;
    }  
    
    private boolean tie(char[][] board)
    {
        //Scan spots to see if all spots are used up.
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(board[i][j] == '.')
                return false;
            }
        }
        return true;
    }
    
    //Method for actions
    public void actionPerformed(ActionEvent e)
    
    {
    String s = e.getActionCommand();
    if(s.length() == 3)
    {
        Scanner scan = new Scanner(s);
        String rowString = scan.next();
        String colString = scan.next();
        int row = Integer.parseInt(rowString);
        int col = Integer.parseInt(colString);
        JButton button = boardSpots[row][col];
        
        //if button already pressed, take no action
        
        if(button.isEnabled())
        {
            
            if(xTurn)
            {
                messages.setText("It is now player O's turn.");
                button.setText("X");
                marks[row][col] = 'X';
                button.setEnabled(false);
                xTurn = false;
            }
            else
            {
                messages.setText("It is now player X's turn.");
                button.setText("O");
                marks[row][col] = 'O';
                button.setEnabled(false);
                xTurn = true;
            }
        }
        
        if(tie(marks))
        {
            messages.setText("Tie Game!");
            for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
            boardSpots[i][j].setEnabled(false);
        }
        
        if(won('X', marks))
        {
            messages.setText("Player X has won!");
            for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
            boardSpots[i][j].setEnabled(false);
        }
        if(won('O', marks))
        {
            messages.setText("Player O has won!");
            for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
            boardSpots[i][j].setEnabled(false);
        }   
        
    }
}
}
