import java.lang.Math;
public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    double x1 = a.getX();
    double y1 = a.getY();
    double x2 = b.getX();
    double y2 = b.getY();
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point p6 = new Point(p3);
    System.out.println(p6);
    System.out.println( p3);
    System.out.println(distance(p1,p2));
    System.out.println(Point.distance(p1,p2));
    System.out.println(p1.distanceTo(p2));
  }
}
