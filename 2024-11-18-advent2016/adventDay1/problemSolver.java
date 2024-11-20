import java.util.*;
import java.io.*;
public class problemSolver {
  public static String[] parse(String filename) {
    try {
    File file = new File("input.txt");
    Scanner parser = new Scanner(file);
    String[] returnStringArray = parser.nextLine().split(", ");
    return returnStringArray;

  }
  catch (FileNotFoundException ex) {
    System.out.println("file not found");
    String[] returnToMakeItCompile = new String[1];
    return returnToMakeItCompile;
  }
  }
  public static int solver(String[] data) {
  int distanceUp = 0;
  int distanceDown = 0;
  int distanceLeft = 0;
  int distanceRight = 0;
  for (int i = 0; i < data.length; i++) {
    String latestTurn = data[i].substring(0,1);
    int latestDistance = Integer.parseInt(data[i].substring(1));
    String facing = "";
    if (facing.equals("U")) {
      if (latestTurn.equals("R")) {
        facing = "R";
        distanceRight += latestDistance;
      }
      else  {
        facing = "L";
        distanceLeft += latestDistance;
      }
    }
    else if (facing.equals("R")) {
      if (latestTurn.equals("R")) {
        facing = "U";
        distanceUp += latestDistance;
      }
      else  {
        facing = "L";
        distanceDown += latestDistance;
      }
    }
    else if (facing.equals("D")) {
      if (latestTurn.equals("R")) {
        facing = "R";
        distanceRight += latestDistance;
      }
      else {
        facing = "L";
        distanceLeft += latestDistance;
      }
    }
    else {
      if (latestTurn.equals("U")) {
        facing = "L";
        distanceRight += latestDistance;
      }
      else {
        facing = "R";
        distanceLeft += latestDistance;
      }
    }
  }
  return Math.abs(distanceLeft - distanceRight) + Math.abs(distanceDown - distanceUp);

}
  public static void main (String[] args) {
    System.out.println(Arrays.toString(parse("input.txt")));
    System.out.println(solver(parse("input.txt")));
  }
}
