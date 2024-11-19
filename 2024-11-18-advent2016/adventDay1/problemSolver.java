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
    int latestDistance = data[i].substring(1);
  }
}
  public static void main (String[] args) {
    System.out.println(Arrays.toString(parse("input.txt")));
  }
}
