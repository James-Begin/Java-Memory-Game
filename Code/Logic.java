import java.util.*;

public class sequanceGameLogic
{
    public static void main(String[]args){
        
        boolean gameOver = false;
        boolean success = false;
        
        int nextBox = (int)(Math.random()*9)+1;
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
            
            nextBox = (int)(Math.random()*9)+1;
            sequance.add(nextBox);
            
            point++;
            
        }
        
        
    }
}
