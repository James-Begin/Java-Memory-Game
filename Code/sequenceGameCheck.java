public class sequenceGameCheck {
    //Initialize the current number in the repeating sequence
    int sequenceNum = 0;
    
    //Method to check if the user has pressed the right square
    public void check(int square) {
        //if the user has pressed the correct square, and this is not the last square
        //in the sequence, continue to the next square in the pattern
        if (square == sequenceGameLogic.sequence.get(sequenceNum)) {
            sequenceNum += 1;
            sequenceGameLogic.finished = false;
            //if the user presses correctly, and was the last square in the sequence
            //reset the sequence number and start from the beginning
            if (sequenceNum == sequenceGameLogic.sequence.size()) {
                sequenceGameLogic.finished = true;
                sequenceNum = 0;
            }
            //if the user presses the wrong button, the game ends.
        } else {
            sequenceGameLogic.gameOver = true;
            sequenceGameLogic.finished = true;
            
        }
        
    }
}