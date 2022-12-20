import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javafx.scene.layout.*;

public class sequanceGameInterface implements ActionListener
{
    public static void main(String[]args){
        sequanceGameInterface s = new sequanceGameInterface();
        s.animation();
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
    
    
    public sequanceGameInterface(){
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
    }
    
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == topLeft){
           
       } else if(e.getSource() == topMiddle){
           
       } else if(e.getSource() == topRight){
           
       } else if(e.getSource() == middleLeft){
           
       } else if(e.getSource() == middleMiddle){
           
       } else if(e.getSource() == middleRight){
           
       } else if(e.getSource() == bottomLeft){
           
       } else if(e.getSource() == bottomMiddle){
           
       } else if(e.getSource() == bottomRight){
           
       }
    }
   
    public void animation(){
        int[] order = {1,2,3,4,5,6,7,8,9,1,6,3,6,3,6,3,7,9,5,4,7};
        for(int i = 0; i < order.length; i++){
            
            switch(order[i]){
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
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
                
                
                switch(order[i]){
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
