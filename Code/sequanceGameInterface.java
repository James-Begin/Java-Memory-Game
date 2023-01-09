import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javafx.scene.layout.*;

public class sequenceGameInterface implements ActionListener
{
    sequenceGameCheck c = new sequenceGameCheck();
    sequenceGameLogic l = new sequenceGameLogic();
    public static void main(String[]args){
        sequenceGameInterface s = new sequenceGameInterface();
        
        
        
    }
    
    JFrame frame = new JFrame();
    
    JButton topLeft = new JButton("");
    JButton topMiddle = new JButton("");
    JButton topRight = new JButton("");
    
    JButton middleLeft = new JButton("");
    JButton middleMiddle = new JButton("");
    JButton middleRight = new JButton("");
    
    JButton bottomLeft = new JButton("");
    JButton bottomMiddle = new JButton("");
    JButton bottomRight = new JButton("");
    
    
    public sequenceGameInterface(){
        topLeft.setBounds(50,50,200,200);
        topMiddle.setBounds(300,50,200,200);
        topRight.setBounds(550,50,200,200);
        
        middleLeft.setBounds(50,300,200,200);
        middleMiddle.setBounds(300,300,200,200);
        middleRight.setBounds(550,300,200,200);
        
        bottomLeft.setBounds(50,550,200,200);
        bottomMiddle.setBounds(300,550,200,200);
        bottomRight.setBounds(550,550,200,200);
        
        
        topLeft.setBackground(new Color(37, 115, 193));
        topMiddle.setBackground(new Color(37, 115, 193));
        topRight.setBackground(new Color(37, 115, 193));
        middleLeft.setBackground(new Color(37, 115, 193));
        middleMiddle.setBackground(new Color(37, 115, 193));
        middleRight.setBackground(new Color(37, 115, 193));
        bottomLeft.setBackground(new Color(37, 115, 193));
        bottomMiddle.setBackground(new Color(37, 115, 193));   
        bottomRight.setBackground(new Color(37, 115, 193));
        
        
        topLeft.setBorderPainted(false);
        topMiddle.setBorderPainted(false);
        topRight.setBorderPainted(false);
        middleLeft.setBorderPainted(false);
        middleMiddle.setBorderPainted(false);
        middleRight.setBorderPainted(false);
        bottomLeft.setBorderPainted(false);
        bottomMiddle.setBorderPainted(false);
        bottomRight.setBorderPainted(false);
        
        frame.add(topLeft);
        frame.add(topMiddle);
        frame.add(topRight);
        
        frame.add(middleLeft);
        frame.add(middleMiddle);
        frame.add(middleRight);
        
        frame.add(bottomLeft);
        frame.add(bottomMiddle);
        frame.add(bottomRight);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,825);
        frame.getContentPane().setBackground(new Color(43, 135, 209));
        frame.setLayout(null);
        frame.setVisible(true);
        
        topLeft.addActionListener(this);
        topMiddle.addActionListener(this);
        topRight.addActionListener(this);
        middleLeft.addActionListener(this);
        middleMiddle.addActionListener(this);
        middleRight.addActionListener(this);
        bottomLeft.addActionListener(this);
        bottomMiddle.addActionListener(this);
        bottomRight.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == topLeft){
            System.out.println("HELLO WORLD");
            c.check(l.sequence, 1);
        } else if(e.getSource() == topMiddle){
            System.out.println("HELLO WORLD");
            c.check(l.sequence, 2);
        } else if(e.getSource() == topRight){
            System.out.println("HELLO WORLD");
            c.check(l.sequence, 2);
        } else if(e.getSource() == middleLeft){
            c.check(l.sequence, 3);
            System.out.println("HELLO WORLD");
        } else if(e.getSource() == middleMiddle){
            c.check(l.sequence, 4);
            System.out.println("HELLO WORLD");
        } else if(e.getSource() == middleRight){
            c.check(l.sequence, 5);
            System.out.println("HELLO WORLD");
        } else if(e.getSource() == bottomLeft){
            c.check(l.sequence, 6);
            System.out.println("HELLO WORLD");
        } else if(e.getSource() == bottomMiddle){
            c.check(l.sequence, 7);
            System.out.println("HELLO WORLD");
        } else if(e.getSource() == bottomRight){
            c.check(l.sequence, 8);
            System.out.println("HELLO WORLD");
        }
    }
   
    public void animation(ArrayList<Integer> order){
        
        for(int i = 0; i < order.size(); i++){
            
            switch(order.get(i)){
                case 1:
                    topLeft.setBackground(new Color(255, 255, 255));
                    break;
                case 2:
                    topMiddle.setBackground(new Color(255, 255, 255));
                    break;
                case 3:
                    topRight.setBackground(new Color(255, 255, 255));
                    break;
                case 4:
                    middleLeft.setBackground(new Color(255, 255, 255));
                    break;
                case 5:
                    middleMiddle.setBackground(new Color(255, 255, 255));
                    break;
                case 6:
                    middleRight.setBackground(new Color(255, 255, 255));
                    break;
                case 7:
                    bottomLeft.setBackground(new Color(255, 255, 255));
                    break;
                case 8:
                    bottomMiddle.setBackground(new Color(255, 255, 255));
                    break;
                case 9:
                    bottomRight.setBackground(new Color(255, 255, 255));
                    break;
                }
            
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
                
                
                switch(order.get(i)){
                    case 1:
                        topLeft.setBackground(new Color(37, 115, 193));
                        break;
                    case 2:
                        topMiddle.setBackground(new Color(37, 115, 193));
                        break;
                    case 3:
                        topRight.setBackground(new Color(37, 115, 193));
                        break;
                    case 4:
                        middleLeft.setBackground(new Color(37, 115, 193));
                        break;
                    case 5:
                        middleMiddle.setBackground(new Color(37, 115, 193));
                        break;
                    case 6:
                        middleRight.setBackground(new Color(37, 115, 193));
                        break;
                    case 7:
                        bottomLeft.setBackground(new Color(37, 115, 193));
                        break;
                    case 8:
                        bottomMiddle.setBackground(new Color(37, 115, 193));
                        break;
                    case 9:
                        bottomRight.setBackground(new Color(37, 115, 193));
                        break;
                }
            }
            
    }
   
}
