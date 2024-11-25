import java.util.*;
import java.io.*;
public class problemSolver {

public static int maxindexOfArray(int[] data) {
int maxValue = 0;
for (int o = 0; o < data.length; o++) {
if (maxValue < data[o]) {
maxValue = data[o];
}
}
for (int o = 0; o < data.length; o++) {
if (maxValue == data[o]) {
return o;
}
}
return 3;
}

  public static ArrayList<String[]> parse(String filename) {
    try {
    ArrayList<String[]> returnStringArray = new ArrayList<String[]>(0);
    File file = new File(filename);
    Scanner parser = new Scanner(file);
while (parser.hasNextLine()) {
    returnStringArray.add(parser.nextLine().split(""));
    }
    return returnStringArray;

  }
  catch (FileNotFoundException ex) {
    System.out.println("file not found");
    ArrayList<String[]> returnToMakeItCompile = new ArrayList<String[]>(0);
    return returnToMakeItCompile;
  }
  }
  
  public static String solver(ArrayList<String[]> data) {
 String returnString = "";
  String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

 for (int k = 0; k < data.get(0).length; k++) {
int[] alphabetCount = new int[26];
for (int i = 0; i < data.size(); i++) {
 for (int z = 0; z < 26; z++) {
	if (data.get(i)[k].equals(alphabet[z])) {
	alphabetCount[z] = alphabetCount[z] + 1;
	}
}
}
//System.out.println(Arrays.toString(alphabetCount));
//System.out.println(alphabet[maxindexOfArray(alphabetCount)]);
returnString += alphabet[maxindexOfArray(alphabetCount)];

}

return returnString;
}


  public static void main (String[] args) {
     int[] arrayTest = {0,0,0,0,0,0,5,0,0,0,0,0,0,0,13,0,0,0,0,0,0,0,0,0,0,0};
     //System.out.println(parse("input.txt"));
System.out.println(solver(parse("input.txt")));
System.out.println(maxindexOfArray(arrayTest));

  }
}
