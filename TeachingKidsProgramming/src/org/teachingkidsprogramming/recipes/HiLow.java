package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

import com.spun.util.NumberUtils;

public class HiLow
{
  public static void main(String[] args)
  {
    int correctNumber = NumberUtils.getRandomInt(1, 100);
    for (int i = 1; i <= 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
      if (guess == correctNumber)
      {
        Sounds.playBeep();
        MessageBox.showMessage("You have won the game");
        System.exit(0);
      }
      else if (guess >= correctNumber)
      {
        MessageBox.showMessage("The number is too high");
      }
      else if (guess <= correctNumber)
      {
        MessageBox.showMessage("The number is too low");
      }
    }
    MessageBox.showMessage("You have lost the game");
  }
}