import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class endScreen {
    public JFrame loseFrame = new JFrame("Game Over");
    public Label lose = new Label("");
    public Button retry = new Button("Restart");
    public Button exit = new Button("Exit");
    public static void main(String[] args) {
        
    }
    public void gameOver() {
        loseFrame.setSize(500,500);
        loseFrame.add(lose);
        String Text = "Game Over";
        //TODO:
        lose.setBounds();
    }
}
