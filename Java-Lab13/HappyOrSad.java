
/**
 * @author (Jason Henderson) 
 * @version (Chapter 18 Project 3)
 */

import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class HappyOrSad extends JFrame
{
   
    //Face Size
    private final int FACE_DIAMETER = 200;
    private final int X_FACE = 100;
    private final int Y_FACE = 100;
    
    //Eyes
    private final int EYE_WIDTH = 20;
    private final int EYE_HEIGHT = 20;
    private final int X_RIGHT_EYE = X_FACE + 50;
    private final int Y_RIGHT_EYE = Y_FACE + 60;
    private final int X_LEFT_EYE = X_FACE + 130;
    private final int Y_LEFT_EYE = Y_FACE + 60;
    
    //Mouth
    private final int MOUTH_WIDTH = 100;
    private final int MOUTH_HEIGHT = 50;
    private final int X_MOUTH = X_FACE + 50;
    private final int Y_MOUTH = Y_FACE + 100;
    private final int MOUTH_START_ANGLE = 180;
    private final int MOUTH_ARC_SWEEP = 180;
    
    //check if active or not
    private boolean activated;
    
    public HappyOrSad()
    {
        super("Happy or Sad");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        activated = true;
        addWindowListener(new CheckActivated());
    }//end
    
    public void paint(Graphics g)
    {
        super.paint(g);
        //draw face
        g.drawOval(X_FACE, Y_FACE, FACE_DIAMETER, FACE_DIAMETER);
        //draw eyes 
        g.fillOval(X_RIGHT_EYE, Y_RIGHT_EYE, EYE_WIDTH, EYE_HEIGHT);
        g.fillOval(X_LEFT_EYE, Y_LEFT_EYE, EYE_WIDTH, EYE_HEIGHT);
        
        if(activated)
        {
            g.drawArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH,
            MOUTH_HEIGHT, MOUTH_START_ANGLE, MOUTH_ARC_SWEEP);
        }
        
        else
        
        {
            g.drawArc(X_MOUTH, Y_MOUTH, MOUTH_WIDTH,
            MOUTH_HEIGHT, MOUTH_START_ANGLE, -MOUTH_ARC_SWEEP);
        }
    }//end paint method
    
    private class CheckActivated implements WindowListener
    {
        //window activated
        public void windowActivated(WindowEvent w)
        {
            activated = true;
            repaint();
        }
        
        public void windowDeactivated(WindowEvent w)
        {
            activated = false;
            repaint();
        }
        
    public void windowDeiconified(WindowEvent w){}
    public void windowIconified(WindowEvent w){}
    public void windowOpened(WindowEvent w){}
    public void windowClosed(WindowEvent w){}
    public void windowClosing(WindowEvent w){}
    }
    
    public static void main(String args[])
    {
    HappyOrSad pic = new HappyOrSad();
    pic.setVisible(true);
    }   
    
}

    
