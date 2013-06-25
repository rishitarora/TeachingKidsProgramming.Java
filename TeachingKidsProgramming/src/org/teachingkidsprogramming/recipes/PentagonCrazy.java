package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    //    Make the tortoise move as fast as possible --#3
    Tortoise.setSpeed(10);
    //    createColorPalette (recipe below) --#8
    //    ------------- Recipe for createColorPalette --#8
    //    Add steel blue to the color wheel --#7
    //    Add dark orchid to the color wheel --#11
    //    Add dark slate blue to the color wheel --#12
    //    Add teal to the color wheel --#13
    //    Add indigo to the color wheel --#14
    //    ------------- End of createColorPalette recipe 
    //    DrawPentagon (recipe below) --#10
    //    ------------- Recipe for drawPentagon --#10
    //    Do the following 200 times --#2
    //        AdjustPen (recipe below) --#9
    //        ------------- Recipe for adjustPen --#9
    //        Change the color of the line the tortoise draws to the next color on the color wheel --#6
    //        Increase the tortoises pen width by 1 --#15                                              
    //        If the tortoises pen width is greater than 4, then --#17
    //            Reset it to 1 --#16
    //        ------------- End of adjustPen recipe 
    //        Move the tortoise the length of a side --#4 
    for (int i = 1; i <= 200; i++)
    {
      Tortoise.turn(360 / 5);
      Tortoise.move(50);
      Tortoise.turn(1);
    }
    //    Repeat
    //    ------------- End of drawPentagon recipe
  }
}
