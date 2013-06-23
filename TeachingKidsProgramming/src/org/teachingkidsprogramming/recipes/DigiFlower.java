package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class DigiFlower
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Make the background silver --#8
    //    Make the line the tortoise draws 3 pixels wide --#20
    //    createColorPalette (recipe below) --#9
    //    Do the following 15 times --#19
    //      drawOctogon (recipe below) --#10
    //      Turn the tortoise 1/15th of 360 degrees to the right --#18
    //    Repeat
    //    ------------- Recipe for createColorPalette --#9
    //    Color 1 is red --#3
    //    Color 2 is dark orange --#11
    //    Color 3 is gold --#12
    //    Color 4 is yellow --#13
    ColorWheel.addColor(Colors.Reds.Red);
    //    Add color 2 to the color wheel --#11.1
    //    Add color 3 to the color wheel --#12.1
    //    Add color 4 to the color wheel --#13.1
    //    Add color 4 to the color wheel --#14
    //    Add color 3 to the color wheel --#15
    //    Add color 2 to the color wheel --#16
    //    Add color 1 to the color wheel --#17
    //    ------------- Recipe for drawOctogon --#10
    myRefactor();
    myRefactor();
    myRefactor();
    myRefactor();
    myRefactor();
    myRefactor();
    myRefactor();
    myRefactor();
    //    Repeat  
  }
  private static void myRefactor()
  {
    Tortoise.setPenColor(Colors.Oranges.DarkOrange);
    Tortoise.move(50);
    Tortoise.turn(360 / 8);
  }
}
