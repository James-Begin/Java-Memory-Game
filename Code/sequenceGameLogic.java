import java.util.*;

public class sequenceGameLogic
{
    static ArrayList<Integer> sequence = new ArrayList<Integer>();
    
    sequenceGameInterface gui = new sequenceGameInterface();
    
    int point = 0;
    
    static boolean gameOver = false;
    static boolean finished = false;
    
    
    public void running() {
    
        int nextBox;
        int previousBox = 0;
        
        while(gameOver == false){   
            
            do{
                nextBox = (int)(Math.random()*9)+1;
            } while(nextBox == previousBox);
            
            previousBox = nextBox;
            sequence.add(nextBox);
            
            point+=1;
            
            gui.animation(sequence);
            
            System.out.println(sequence);
            
            finished = false;
            
            while(finished == false){
                try {
                        Thread.sleep(10);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
            }
            
        }
        
        System.out.println("GAME OVER");
        
    }
    
}
