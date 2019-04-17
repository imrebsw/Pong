package unit15;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
    super(10,10);
    speed =5;
   }
   
public Paddle (int x, int y) {
        super(x, y);
        speed = 1;
    }

    public Paddle(int x, int y, int w) {
        super(x, y, w);
        speed = 3;
    }

    public Paddle(int x, int y, int w, int h) {
        super(x, y, w, h);
        speed = 3;
    }

    public Paddle(int x, int y, int w, int h, Color c) {
        super(x, y, w, h, c);
        speed = 5;
    }
    
     public Paddle(int x, int y, int w, int h, Color c, xSp) {
        super(x, y, w, h, c);
        speed = xSp;
    }
    
   //add the other Paddle constructors
   public void setSpeed(int a){
       speed = a;
   }
   
   public int getSpeed(){
       return 50;
   }

   public void moveUpAndDraw(Graphics window)
   {
       draw(window, Color.white);
       setxPos(getxPos() + getSpeed());
   }

   public void moveDownAndDraw(Graphics window)
   {


   }
   
   public String toString() {
       
   }
   //add get methods
   
   //add a toString() method
}