public class Driver {
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


public static void reset() {
System.out.print("\u001b[0m");
}


public static void color(int foreground,int background){
  System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
}

public static void color(int foreground, int background, int modifier){
  System.out.print( "\u001b[" + foreground + ";" + (10+background) + ";" + modifier + "m");
}
public static void colorRGB(int r, int g, int b) {
    System.out.print("\u001b[38;2;"+r+";"+g+";"+b+"m");
  }
public static void BlueWave(int range, int wavelength,String waveCharachter) {
String wave = "";
for (int z = 0; z < wavelength; z++) {
wave += waveCharachter;
}
  for (int i = 0; i < range; i++) {
    colorRGB(0,0,i);
    System.out.println(wave);
  }
}
public static void wait(int millis){
  try {
    Thread.sleep(millis);
  }
    catch (InterruptedException e) {
  }
}
public static void go(int row,int col){
    System.out.print("\033[" + row + ";" + col + "H");
}
public static void randomColor() {
int randNumr;
int randNumg;
int randNumb;

int randNumbr = (int) (Math.random() * 257);
int randNumbg = (int) (Math.random() * 257);
int randNumbb = (int) (Math.random() * 257);
colorRGB(randNumbr,randNumbg,randNumbb);
}
public static void Border(int length, int height, String charachter) {
  for (int y = 0; y < height; y++) {
  for (int x = 0; x < length; x++) {
//if (x == 1 || y == 1 || y == height - 1 || x == length - 1) {
   if (x == 0 || y == 0 || y == height-1 || x == length - 1) {
   randomColor();
   System.out.print(charachter);

     }else {
    System.out.print(" ");
    }

   if (x == length - 1) {
   System.out.println();
   }
//   }


  // if (x == length - 1) {
   //System.out.println();
   //}
  }
}
 }

//this function will fill your terminal with a bunch of meaningless text if you create too large a range
  public static void freezeWave(int rangeR, int rangeG, int rangeB, int wavelength,String waveCharachter) {
String wave = "";
for (int z = 0; z < wavelength; z++) {
wave += waveCharachter;
}
for (int y = 0; y < rangeB; y++) {
for (int k = 0; k < rangeG; k++) {
  for (int i = 0; i < rangeR; i++) {
    colorRGB(y,k,i);
    System.out.println(wave);
  }
  }
  }
}

public static void main(String[] args) {
reset();
Border(80, 30, "o");

}
}
