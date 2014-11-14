import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;


public class UsingMice extends Applet implements MouseListener, MouseMotionListener
{

   Rect r1 = new Rect(100, 100, 100, 50);
   Rect r2 = new Rect(200, 500, 30, 200);


   FakeWindow[] fw = new FakeWindow[10];


   int mx = 0;
   int my = 0;


   public void init()
   {
      for(int i = 0; i < fw.length; i++)

         fw[i] = new FakeWindow("Fake Window " + i, 25*i, 25*i, 200, 200);


      addMouseListener(this);

      addMouseMotionListener(this);


   }


   public void paint(Graphics win)
   {
       for(int i = 0; i < fw.length; i++)
          fw[i].draw(win);


     // r1.draw(win);
      //r2.draw(win);


      //if (r1.contains(mx, my))  win.drawString("Mouse Inside", 10, 30);

      //else                      win.drawString("Mouse Outside", 10, 30);

   }


   public void mouseMoved(MouseEvent e)
   {

   }

   public void mouseDragged(MouseEvent e)
   {
      int dx = e.getX() - mx;

      int dy = e.getY() - my;


      for(int i = 0; i < fw.length; i++)
      {
         if(fw[i].titlebar.contains(mx, my)) fw[i].moveBy(dx, dy);

         if(fw[i].resizer.contains(mx, my))  fw[i].resizeBy(dx, dy);
      }

      mx = e.getX();

      my = e.getY();

      repaint();
   }






   public void mousePressed(MouseEvent e)
   {
     // Record where the mouse was pressed so it can be used in another function
     mx = e.getX();

     my = e.getY();

//     repaint();

   }

   public void mouseReleased(MouseEvent e)
   {
      System.out.println("Released");

   }

   public void mouseClicked(MouseEvent e)
   {
      System.out.println("Clicked");

   }


   public void mouseEntered(MouseEvent e)
   {
      System.out.println("Entered");

   }


   public void mouseExited(MouseEvent e)
   {
      System.out.println("Exited");

   }



}
