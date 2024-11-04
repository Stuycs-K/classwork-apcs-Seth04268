import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
class TriangleTester {
  public static boolean checkTriangle(int[] ary) {
    return (ary[0] + ary[1] > ary[2] && ary[0] + ary[2] > ary[1] && ary[1] + ary[2] > ary[0]);
  }




  public static int countTrianglesA(String filename) {
    int triangleCount = 0;
    int triangleNumberChecker = 0;
    Scanner scannerForAdvent = new Scanner (filename);
    while (scannerForAdvent.hasNextInt()) {
      int[] intList = new int[3];
      if (triangleNumberChecker == 3) {
        if (checkTriangle(intList)) {
          triangleCount += 1;
        }
        triangleNumberChecker = 0;
      }
      else {
        intList[triangleNumberChecker] = scannerForAdvent.nextInt();
        triangleNumberChecker += 1;
      }
    }
    return triangleCount;
  }
}
