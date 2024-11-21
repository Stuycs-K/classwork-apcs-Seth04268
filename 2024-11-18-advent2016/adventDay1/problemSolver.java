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
int x = 0;
int y = 0;
String facing = "U";
ArrayList<int[]> pastValues = new ArrayList<int[]>(1000);

  for (int i = 0; i < data.length; i++) {
    String latestTurn = data[i].substring(0,1);
    int latestDistance = Integer.parseInt(data[i].substring(1));

    if (facing.equals("U")) {
      if (latestTurn.equals("R")) {
        facing = "R";
        x += latestDistance;
      }
      else  {
        facing = "L";
        latestDistance *= -1;
        x += latestDistance;
      }
    }
    else if (facing.equals("R")) {
      if (latestTurn.equals("R")) {
        facing = "D";
        latestDistance *= -1;
        y += latestDistance;
      }
      else  {
        facing = "U";
        y += latestDistance;
      }
    }
    else if (facing.equals("D")) {
      if (latestTurn.equals("R")) {
        facing = "L";
        latestDistance *= -1;
        x += latestDistance;
      }
      else {
        facing = "R";
        x += latestDistance;
      }
    }
    else if (facing.equals("L")){
      if (latestTurn.equals("R")) {
        facing = "U";
         y += latestDistance;
      }
      else  {
        facing = "D";
        latestDistance *= -1;
        y += latestDistance;
      }
    }

    for (int k = 0; k < pastValues.size(); k++) {
      if (pastValues.get(k)[0] == x && pastValues.get(k)[1] == y) {
        return Math.abs(x) + Math.abs(y);
      }
    }
if (latestDistance > 0) {
    for (int z = x - latestDistance; z < x; z++) {
      for (int l = y - latestDistance; l < y; l++) {
    pastValues.add(new int[] {x,y});
  }
}
}
if (latestDistance < 0) {
for (int z = x; z > 1; z--) {
  for (int l = 0; l > 1; l--) {
pastValues.add(new int[] {x,y});
}
  }
}


  }
  return(10000000);
}
  public static void main (String[] args) {
    System.out.println(Arrays.toString(parse("input.txt")));
    System.out.println(solver(parse("input.txt")));
  }
}
