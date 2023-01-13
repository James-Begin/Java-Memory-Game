public class mainSequence
{
    //create an object of the logic class
    static sequenceGameLogic start = new sequenceGameLogic();
    public static void main(String[]args){
        
        start();
    }
    public static void start() {
        
        //call the running() method in the logic class to start the program
        start.startScreen();
    }
}
