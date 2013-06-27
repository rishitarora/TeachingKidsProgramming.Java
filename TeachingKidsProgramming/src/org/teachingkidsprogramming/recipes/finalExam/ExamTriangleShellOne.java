package org.teachingkidsprogramming.recipes.finalExam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellOne
{
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int shellSize = MessageBox.askForNumericalInput("Set the size of the shell");
    if (shellSize < 200)
    {
      MessageBox.showMessage("The size of the shell is too small.");
      shellSize = MessageBox.askForNumericalInput("Enter an updated size of the shell");
    }
    else
    {
      for (int i = 1; i <= shellSize; i++);
    }
    Tortoise.setPenColor(Colors.getRandomColor());
    int largeLength = shellSize / 100;
    //          Add the value of the large length to the current length
    int currentLength = 6;
    if (largeLength < 0)
      ;
    {
    }
    int length = currentLength + 3;
    int rotations = 6;
    Tortoise.turn(360 / shellSize);
    drawTriangle();
  }
  private static void drawTriangle()
  {
    Tortoise.move(6);
    Tortoise.turn(360 / 3.5);
    Tortoise.move(6);
    Tortoise.turn(360 / 3.5);
  }
}