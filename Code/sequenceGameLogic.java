import java.util.*;

public class sequenceGameLogic
{
    sequenceGameInterface gui = new sequenceGameInterface();
    ArrayList<Integer> sequence = new ArrayList<Integer>();
    int point = 0;
    boolean gameOver = false;
    boolean finished = false;
    public void running() {
    
        int nextBox = (int)(Math.random()*9)+1;
        int previousBox = nextBox;
        sequence.add(nextBox);
        
        gui.animation(sequence);
        while(gameOver == false){
            
            
            
            while(finished == false){
                try {
                        Thread.sleep(10);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
            }
            
            do{
                nextBox = (int)(Math.random()*9)+1;
            } while(nextBox == previousBox);
            
            previousBox = nextBox;
            sequence.add(nextBox);
            
            point++;
            
        }
        
        
    }
    
}
