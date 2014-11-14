import java.awt.*;

public class Titlebar extends Rect
{
   String title;


   public Titlebar(String title, int x, int y, int w, int h)
   {
       super(x, y, w, h);

       this.title = title;
   }



   public void draw(Graphics win)
   {
      setColor(Color.blue);

      fill(win);


      win.setColor(Color.white);
      win.drawString(title, x + 20, y + 15);

      super.draw(win);

   }


}
