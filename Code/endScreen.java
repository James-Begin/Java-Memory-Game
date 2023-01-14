import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//this class uses JFrame and Buttons, so we must implement ActionListener
public class endScreen extends JFrame implements ActionListener {
    //Create objects of each class we need values and methods from
    static sequenceGameLogic l = new sequenceGameLogic();
    static sequenceGameCheck c = new sequenceGameCheck();
    static sequenceGameInterface gui = new sequenceGameInterface();

    //Create a frame and two labels to display text
    public JFrame loseFrame = new JFrame("Game Over");
    public Label lose = new Label("");
    public Label score = new Label("");
    
    //initialize an exit button
    JButton exit = new JButton("Exit");
    
    //The gameOver method displays the screen after the user loses
    public void gameOver(int point) {
        //this removes the game frame that contains the grid of squares
        gui.frame.setVisible(false);
        gui.frame.dispose();
        
        //Add the exit button to the frame
        exit.setBounds(190,370,80,80);
        loseFrame.add(exit);
        //add an ActionListener to the exit button
        exit.addActionListener(this);
        
        //Set the size of the frame
        loseFrame.setSize(500,500);

        //add the two labels to the frame
        loseFrame.add(lose);
        loseFrame.add(score);
        //set the layout of the frame to null
        loseFrame.setLayout(null);

        //Create the score label to display the user's score
        score.setBounds(140, 50, 500, 200);
        score.setText("Score: " + point);
        score.setFont(new Font("Serif", Font.PLAIN, 50));
        
        //Create the lose label to display the text "Game Over"
        lose.setBounds(110,200,300,100);
        String Text = "Game Over";
        lose.setText(Text);
        lose.setFont(new Font("Serif", Font.PLAIN, 50));
        
        //set the frame to visible and display it to the user
        loseFrame.setVisible(true);
    }

    //Action listener to check whether the exit button was pressed
    //if so, stop the program
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == exit) {
            
            System.exit(0);
        }
    }
}
