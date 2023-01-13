import java.util.*;

public class sequenceGameLogic
{
    endScreen end = new endScreen();
    
    //create an integer ArrayList to store the sequence of squares
    static ArrayList<Integer> sequence = new ArrayList<Integer>();
    
    //create an object of the Interface class
    sequenceGameInterface gui = new sequenceGameInterface();
    
    //Initialize Integer to score the score of the user playing
    int point = 0;
    //Initialize booleans to track whether the sequence is finished or game is over
    static boolean gameOver = false;
    static boolean finished = false;
    public void startScreen(){
        gui.graphicInterface();
        while(gui.started == false){
            try {
                Thread.sleep(10);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
        }
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        
        running();
    }
    //The running method starts the sequence and displays the squares
    public void running() {
        //initialize integers to store the next square
        int nextBox;
        int previousBox = 0;
        
        //while loop runs while the game has not ended
        while(gameOver == false){   
            //This Do While loop generates a random integer from 1 to 9 and ensures 
            //that it is not the same as the previous square
            do{
                nextBox = (int)(Math.random()*9)+1;
            } while(nextBox == previousBox);
            //update the previous box variable
            previousBox = nextBox;
            //add the new square to the sequence ArrayList
            sequence.add(nextBox);
            //increase the point value
            point+=1;
            //call the animation method in the Interface class to display the pattern
            gui.animation(sequence);
            //set finished to false at the start of the sequence
            finished = false;
            //while the user is pressing the sequence, repeatedly wait 10 milliseconds
            //until they are finished before starting a new sequence
            while(finished == false){
                //when using Thread.sleep(), there is a possibility for an 
                //Interrupted Exception where thread is interrupted while it is sleeping
                //Because this is a checked exception, we must use a try-catch
                //for the program to run properly
                try {
                        Thread.sleep(10);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
            }
            //After the user is finished inputting the sequence, wait one second
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            
        }
        //If the gameOver variable becomes true, the game ends.
        end.gameOver();
    }
    
}
