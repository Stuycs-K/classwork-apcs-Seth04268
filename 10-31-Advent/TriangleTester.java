import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
class TriangleTester {
  public static boolean checkTriangle(int[] ary) {
    return (ary[0] + ary[1] > ary[2] && ary[0] + ary[2] > ary[1] && ary[1] + ary[2] > ary[0]);
  }




  public static int countTrianglesA(String filename) {


    try {
    File file = new File(filename);//1
    int triangleCount = 0;
    int[] intList = new int[3];
    int triangleNumberChecker = 0;
    Scanner scannerForAdvent = new Scanner(file);
    while (scannerForAdvent.hasNextInt()) {
    intList[triangleNumberChecker] = scannerForAdvent.nextInt();
    triangleNumberChecker += 1;
      if (triangleNumberChecker == 3) {
        if (checkTriangle(intList)) {
          triangleCount += 1;
        }
        triangleNumberChecker = 0;
      }
    }
    scannerForAdvent.close();
    return triangleCount;
    }
    catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return 1000000;
    }

  }
  
  
  
  public static int countTrianglesB(String filename) {
      try {
    File file = new File(filename);//1
    int triangleCount = 0;
    int[] intList = new int[3];
    int triangleNumberChecker = 0;
    Scanner scannerForAdvent = new Scanner(file);
    while (scannerForAdvent.hasNextInt()) {
    intList[triangleNumberChecker] = scannerForAdvent.nextInt();
    triangleNumberChecker += 1;
      if (triangleNumberChecker == 3) {
        if (checkTriangle(intList)) {
          triangleCount += 1;
        }
        triangleNumberChecker = 0;
      }
    }
    scannerForAdvent.close();
    return triangleCount;
    }
    catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return 1000000;
    }

  
  }
}
