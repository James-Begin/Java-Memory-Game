import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//This class requires both JFrame and ActionListener 
public class sequenceGameInterface extends JFrame implements ActionListener
{
    //Create an object of the sequenceGameCheck class
    sequenceGameCheck check = new sequenceGameCheck();
    //create a JFrame where the text and buttons of the game will be displayed
    JFrame frame = new JFrame();
    //initialize boolean for the start screen
    boolean started = false;
    //create a 1D array to store the buttons on the starting screen
    JButton[] startButtons = new JButton[2];
    //create a 2D array to store the buttons in a grid of size 3x3
    JButton[][] buttonGrid = new JButton[3][3];
    //Initialize a title for the start Screen
    Label title = new Label("");

    public void graphicInterface(){
        
        //If the game has not started, display the start screen menu
        frame.setVisible(true);
        if(started == false){
            //define the two starting buttons
            startButtons[0] = new JButton("Start");
            startButtons[1] = new JButton("Exit");
            
            //Create the title of the game
            title.setBounds(180,100,390,100);
            title.setText("Sequence Memory");
            title.setFont(new Font("Serif", Font.PLAIN, 50));
            title.setBackground(new Color(37, 115, 193));
            frame.add(title);

            //create the "start" button
            startButtons[0].setBounds(140,300,200,200);
            startButtons[0].setBackground(new Color(37, 115, 193));
            startButtons[0].setBorderPainted(false);
            frame.add(startButtons[0]);
            //create the "exit" game button
            startButtons[1].setBounds(440,300,200,200);
            startButtons[1].setBackground(new Color(37, 115, 193));
            startButtons[1].setBorderPainted(false);
            frame.add(startButtons[1]);
            
            //Initialize the frame by setting it's size, colour, and layout
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800,825);
            frame.getContentPane().setBackground(new Color(43, 135, 209));
            frame.setLayout(null);
            frame.setVisible(true);
            
            //Add ActionListeners to the two startScreen Buttons
            startButtons[0].addActionListener(this);
            startButtons[1].addActionListener(this);
        
        //Once the game starts, remove the start screen menu
        } else if(started == true){  
            startButtons[0].setVisible(false);
            startButtons[1].setVisible(false);
            title.setVisible(false);
            //create the 3x3 grid of squares
            //These two for loops iterate through each button and set colour and size, then adds them to the frame
            for(int i = 0; i < buttonGrid.length; i++){
                for(int j = 0; j < buttonGrid[0].length; j++){
                    buttonGrid[i][j] = new JButton("");
                    buttonGrid[i][j].setBounds((j*250)+50,(i*250)+50,200,200);
                    buttonGrid[i][j].setBackground(new Color(37, 115, 193));
                    buttonGrid[i][j].setBorderPainted(false);
                    frame.add(buttonGrid[i][j]);
                    buttonGrid[i][j].addActionListener(this);
                }
            }
            //Set the new background frame to display the grid
            frame.setSize(800,1025);
            frame.getContentPane().setBackground(new Color(43, 135, 209));
            //refresh the frame
            frame.setVisible(false);
            frame.setVisible(true);
        }
        
    }
    //Define the actions for the buttons in the start menu and grid
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == startButtons[0]){
            //the start button begins the game
            started = true;
            graphicInterface();
        }
        //the exit button exits the program
        if (e.getSource() == startButtons[1]) {
            System.exit(0);
        }
        //This starts the sequence with a length of 1
        int count = 1;
        //These for loops check if any of the buttons have been pressed by the user
        //if a button has been pressed, it is passed to the check class
        for(int i = 0; i < buttonGrid.length; i++){
            for(int j = 0; j < buttonGrid.length; j++){
                if(e.getSource() == buttonGrid[i][j]){
                    check.check(count);
                }
                //increase the length of the sequence
                count += 1;
            }
        }
    }
    
    //The animation method displays the pattern by changing the colour of certain squares
    //this method accepts an ArrayList with Integers and does not return anything
    public void animation(ArrayList<Integer> order){
        //This for loop iterates through the order ArrayList and displays the order of the pattern
        for(int i = 0; i < order.size(); i++){
            
            //the switch statement changes the colour of the given button to white 
            switch(order.get(i)){
                case 1:
                    buttonGrid[0][0].setBackground(new Color(255, 255, 255));
                    break;
                case 2:
                    buttonGrid[0][1].setBackground(new Color(255, 255, 255));
                    break;
                case 3:
                    buttonGrid[0][2].setBackground(new Color(255, 255, 255));
                    break;
                case 4:
                    buttonGrid[1][0].setBackground(new Color(255, 255, 255));
                    break;
                case 5:
                    buttonGrid[1][1].setBackground(new Color(255, 255, 255));
                    break;
                case 6:
                    buttonGrid[1][2].setBackground(new Color(255, 255, 255));
                    break;
                case 7:
                    buttonGrid[2][0].setBackground(new Color(255, 255, 255));
                    break;
                case 8:
                    buttonGrid[2][1].setBackground(new Color(255, 255, 255));
                    break;
                case 9:
                    buttonGrid[2][2].setBackground(new Color(255, 255, 255));
                    break;
                }
                //After each animation, we have to pause shortly to make it easier for the user
                //Because InterruptedException is a checked exception, we must use a try catch statement
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
                
                //This switch statement changes the colour of the button back to blue, ending the animation
                switch(order.get(i)){
                    case 1:
                        buttonGrid[0][0].setBackground(new Color(37, 115, 193));
                        break;
                    case 2:
                        buttonGrid[0][1].setBackground(new Color(37, 115, 193));
                        break;
                    case 3:
                        buttonGrid[0][2].setBackground(new Color(37, 115, 193));
                        break;
                    case 4:
                        buttonGrid[1][0].setBackground(new Color(37, 115, 193));
                        break;
                    case 5:
                        buttonGrid[1][1].setBackground(new Color(37, 115, 193));
                        break;
                    case 6:
                        buttonGrid[1][2].setBackground(new Color(37, 115, 193));
                        break;
                    case 7:
                        buttonGrid[2][0].setBackground(new Color(37, 115, 193));
                        break;
                    case 8:
                        buttonGrid[2][1].setBackground(new Color(37, 115, 193));
                        break;
                    case 9:
                        buttonGrid[2][2].setBackground(new Color(37, 115, 193));
                        break;
                
                }
            }
            
    }
   
}