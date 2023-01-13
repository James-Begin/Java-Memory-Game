import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class startScreen {
    static sequenceGameLogic l = new sequenceGameLogic();
    static sequenceGameCheck c = new sequenceGameCheck();
    static sequenceGameInterface gui = new sequenceGameInterface();
    public JFrame startFrame = new JFrame("Sequence Memory");
    public Label Title = new Label("");
    
    JButton start = new JButton("Start");
    JButton exit = new JButton("Exit");
    
    mainSequence mainSeq = new mainSequence();
    public void displayStart() {
        
        
        exit.setBounds(130,370,80,80);
        startFrame.add(exit);
        
        
        exit.addActionListener(this);
        
        startFrame.setSize(500,500);
        startFrame.add(Title);
        
        String Text = "Sequence Memory";
        startFrame.setLayout(null);
        Title.setBounds(110,80,300,300);
        Title.setText(Text);
        Title.setFont(new Font("Serif", Font.PLAIN, 50));
        
        
        startFrame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == exit) {
            
            System.exit(0);
        }
    }
}
