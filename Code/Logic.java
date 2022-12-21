import java.util.*;


public class logic {
    public static void main(String[] args) {
        
        //init arraylist to store past moves
        ArrayList<Integer> mem = new ArrayList<Integer>();
        
        boolean fail = false;
        
        int score = 0;
        
        
            
            
        }
    public int choose() {
        return (int)(Math.random()*3+1);
    }
    
    public ArrayList<Integer> add(int rand, ArrayList<Integer> mem) {
        mem.add(rand);
        return mem;
    }
}
