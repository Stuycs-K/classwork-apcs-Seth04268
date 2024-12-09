import java.util.*;
import java.io.*;


public class Game {
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:
EldritchKnight betaTest = new EldritchKnight();
CodeWarrior betaTestEnemy2 = new CodeWarrior();
boolean quit = false;
while (betaTest.getHP() > 0 && betaTestEnemy2.getHP() > 0) {
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");

    //Read one line of user input
    String instruction = userInput.nextLine();
    //Do something with the input
    if (instruction.equals("a") || instruction.equals("attack")) {
    System.out.println(betaTest.attack(betaTestEnemy2));
    }
    if (instruction.equals("sp") || instruction.equals("special")) {
    System.out.println(betaTest.specialAttack(betaTestEnemy2));
    }
    if (instruction.equals("s") || instruction.equals("support")) {
    System.out.println(betaTest.support());
    }
    if (betaTestEnemy2.getHP() <= 0) {
    break;
    }

    if (instruction.equals("quit")) {
    break;
    }
int randomMove = (int) (Math.random() * 3);
if (randomMove == 0) {
    System.out.println(betaTestEnemy2.attack(betaTest));
}
if (randomMove == 1) {
    System.out.println(betaTestEnemy2.support());
}
if (randomMove == 2) {
    System.out.println(betaTestEnemy2.specialAttack(betaTest));
}
    }		
  if (!quit) {
  if (betaTest.getHP() > 0) {
  System.out.println(betaTest.getName() + " has defeated " + betaTestEnemy2.getName());
  System.out.println("You had " + betaTest.getHP() + " and the enemy had " + betaTestEnemy2.getHP());
  if (betaTest.getHP() - betaTestEnemy2.getHP() > 6) {
  System.out.println("It wasn't particularly close");
  }
    else  {
  System.out.println("It was pretty close");
  }
  }
  else {
    System.out.println(betaTestEnemy2.getName() + " has defeated " + betaTestEnemy2.getName());
    System.out.println("How did you lose to an enemy spamming random moves, are you okay, llike mentally?");
  }
  }
}

}
