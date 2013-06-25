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
    Tortoise.setPenWidth(3);
    fifteenTimes();
    //    Repeat  
  }
  private static void fifteenTimes()
  {
    Tortoise.turn(360 / 5);
    createColorPallete();
    drawOctagon();
    Tortoise.turn(360 / 5);
    createColorPallete();
    drawOctagon();
    Tortoise.turn(360 / 5);
    createColorPallete();
    drawOctagon();
    Tortoise.turn(360 / 5);
    createColorPallete();
    drawOctagon();
    Tortoise.turn(360 / 5);
    createColorPallete();
    drawOctagon();
    Tortoise.turn(360 / 5);
    createColorPallete();
    drawOctagon();
    Tortoise.turn(360 / 5);
    createColorPallete();
    drawOctagon();
    Tortoise.turn(360 / 5);
    createColorPallete();
    drawOctagon();
    Tortoise.turn(360 / 5);
    createColorPallete();
    drawOctagon();
    Tortoise.turn(360 / 5);
    createColorPallete();
    drawOctagon();
    Tortoise.turn(360 / 5);
    createColorPallete();
    drawOctagon();
    Tortoise.turn(360 / 5);
    createColorPallete();
    drawOctagon();
    Tortoise.turn(360 / 5);
    createColorPallete();
    drawOctagon();
    Tortoise.turn(360 / 5);
    createColorPallete();
    drawOctagon();
    Tortoise.turn(360 / 5);
    createColorPallete();
    drawOctagon();
  }
  private static void createColorPallete()
  {
    ColorWheel.addColor(Colors.Oranges.DarkOrange);
    ColorWheel.addColor(Colors.Yellows.Gold);
    ColorWheel.addColor(Colors.Yellows.Yellow);
    ColorWheel.addColor(Colors.Yellows.Yellow);
    ColorWheel.addColor(Colors.Yellows.Gold);
    ColorWheel.addColor(Colors.Oranges.DarkOrange);
    ColorWheel.addColor(Colors.Reds.Red);
  }
  private static void drawOctagon()
  {
    myRefactor();
    myRefactor();
    myRefactor();
    myRefactor();
    myRefactor();
    myRefactor();
    myRefactor();
    myRefactor();
  }
  private static void myRefactor()
  {
    Tortoise.setPenColor(Colors.Oranges.DarkOrange);
    Tortoise.move(50);
    Tortoise.turn(360 / 8);
  }
}
