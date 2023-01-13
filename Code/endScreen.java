import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class endScreen implements ActionListener {
    
    static sequenceGameLogic l = new sequenceGameLogic();
    static sequenceGameCheck c = new sequenceGameCheck();
    static sequenceGameInterface gui = new sequenceGameInterface();
    public JFrame loseFrame = new JFrame("Game Over");
    public Label lose = new Label("");
    
    JButton retry = new JButton("Retry");
    JButton exit = new JButton("Exit");
    
    mainSequence mainSeq = new mainSequence();
    public void gameOver() {
        gui.frame.setVisible(false);
        gui.frame.dispose();
        
        exit.setBounds(130,370,80,80);
        loseFrame.add(exit);
        
        
        exit.addActionListener(this);
        
        loseFrame.setSize(500,500);
        loseFrame.add(lose);
        
        String Text = "Game Over";
        loseFrame.setLayout(null);
        lose.setBounds(110,80,300,300);
        lose.setText(Text);
        lose.setFont(new Font("Serif", Font.PLAIN, 50));
        
        
        loseFrame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == exit) {
            
            System.exit(0);
        }
    }
}
