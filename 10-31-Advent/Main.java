import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
class Main {
    public static void main(String[] args) {

    System.out.println(TriangleTester.countTrianglesA("inputTri.txt"));
    System.out.println(TriangleTester.countTrianglesB("inputTri.txt"));
    /*
    Scanner sc1 = new Scanner("This is a bunch of words");
    while (sc1.hasNext()) {
      System.out.println(sc1.next());
    }
    Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
    int sum = 0;
    while (sc2.hasNextDouble()) {
      sum += sc2.nextDouble();
    }
    System.out.println(sum);
    }
    */
  }
}
