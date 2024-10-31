//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) {
    //2 Opening a file requires a try/catch

    try {
      File file = new File("ReadFile.java");//1
      Scanner input = new Scanner(file);
      while (input.hasNextLine()) {
      String checkerString = input.nextLine().toString();
      if (checkerString.contains("{")) {
        System.out.println(checkerString);
      }
      }
      input.close();

    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return;
  }

}
}
