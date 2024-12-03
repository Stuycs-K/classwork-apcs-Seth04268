public class ColorDemo {
  //color directory
  public static final int BLACK = 30;
  public static final int RED = 31;
  public static final int Green = 32;
  public static final int Yellow = 33;
  public static final int Blue = 34;
  public static final int Magenta = 35;
  public static final int Cyan = 36;
  public static final int White = 37;
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";
  public static void color(int foreground,int background){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
  }

  public static void color(int foreground, int background, int modifier){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + + ";" + modifier + "m");
  }
  public static void colorRGB(int r, int g, int b) {
      System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
    }
  public static void BlueWave(int range) {
    for (int i = 0; i < range; i++ {
      
    }
  }


  public static void main(String[] args) {

  }
}
