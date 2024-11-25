import java.util.*;
import java.io.*;
public class problemSolver {
  public static ArrayList<String[]> parse(String filename) {
    try {
    ArrayList<String[]> returnStringArray = new ArrayList<String[]>(0);
    File file = new File(filename);
    Scanner parser = new Scanner(file);
    for (int i = 0; i < 5; i++) 
    returnStringArray.add(parser.nextLine().split(""));
    return returnStringArray;

  }
  catch (FileNotFoundException ex) {
    System.out.println("file not found");
    ArrayList<String[]> returnToMakeItCompile = new ArrayList<String[]>(0);
    return returnToMakeItCompile;
  }
  }
  public static String solver(ArrayList<String[]> data) {
int[][] grid = {{1,2,3}, {4,5,6}, {7,8,9}};
String returnString = "";
int height = 1;
int width = 1;
for (int i = 0; i < data.size(); i++) {

 for (int k = 0; k < data.get(i).length; k++) {
 String currentMove = data.get(i)[k];
 if (currentMove.equals("U") && height > 0) {
   height--;

 }
  if (currentMove.equals("D") && height < 2) {
   height++;
 }
 if (currentMove.equals("R") && width < 2) {
    width++;
 }
  if (currentMove.equals("L") && width > 0) {
    width--;
 }
 }
 returnString += grid[height][width];
}
return returnString;
}
  public static void main (String[] args) {
System.out.println(solver(parse("input.txt")));

  }
}
