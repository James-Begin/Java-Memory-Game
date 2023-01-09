import java.util.*;

public class sequanceGameLogic
{
    public static void main(String[]args){
        
        boolean gameOver = false;
        boolean success = false;
        
        int nextBox = (int)(Math.random()*9)+1;
        int previousBox = nextBox;
        ArrayList<Integer> sequance = new ArrayList<Integer>(Arrays.asList(nextBox));
        int point = 0;
        
        while(gameOver == false){ 
            
            while(success == false){
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
            sequance.add(nextBox);
            
            point++;
            
        }
        
        
    }
}
